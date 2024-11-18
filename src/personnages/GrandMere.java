package personnages;

import java.util.Random;



public class GrandMere extends Humain {
	private Humain[] memoire = new Humain[NB_MAX_CONNAISSANCE];
	
	protected static int NB_MAX_CONNAISSANCE = 5;
	
	private enum TypeHumain {
		RONIN("Ronin"),
		COMMERCANT("Commercant"),
		HABITANT("Habitant"),
		SAMOURAI("Samourai"),
		GRANDMERE("Grand-mère"),
		YAKUZA("Yakuza");
		
		 public String label = "";

		TypeHumain(String string) {
			this.label = label;
		}
	}
	
	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	@Override
	protected void memoriser(Humain humain) {
		if(nbConnaissance < NB_MAX_CONNAISSANCE) {
			this.memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			this.parler("Oh ma tête! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	private String humainHasard() {
		Random rn = new Random();
		int personne = rn.nextInt(7);
		TypeHumain[] types = TypeHumain.values();
		
		return types[personne].name();
	}
	
	public void ragoter() {
		for(int i = 0; i < nbConnaissance; i++) {
			if (this.memoire[i] instanceof Traitres){
				this.parler("Je sais que " + this.memoire[i].getNom() + " est un traître. Petit chenapan !");
			} else {
				this.parler("Je crois que " +  this.memoire[i].getNom() + " est un " + humainHasard());
			}
		}
		

	}
	
}
