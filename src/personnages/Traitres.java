package personnages;

import java.util.Random;

public class Traitres extends Samourai{

	private int niveauDeTraitrise = 0;
	public Traitres(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}
	
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauDeTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if(niveauDeTraitrise < 3) {
			int argentRaconner = (commercant.getArgent() * 2) /10;
			commercant.perdreArgent(argentRaconner);
			this.gagnerArgent(argentRaconner);
			niveauDeTraitrise++;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRaconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			this.parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me démasquer");
		}
	}
	
	public void faireLeGentil() {
		if(nbConnaissance < 1) {
			this.parler("Je ne peux pas faire ami ami avec personne car je ne connais personne ! Snif.");
			
		} else {
			Random rn = new Random();
			int don = (argent * 1)/20;
			int personne = rn.nextInt(nbConnaissance + 1);
			String nomAmi = this.memoire[personne].getNom();
			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			this.memoire[personne].gagnerArgent(don);
			this.perdreArgent(don);
			this.memoire[personne].parler("Merci" + getNom() + ". Vous êtes quelqu'un de bien.");
			if(niveauDeTraitrise > 1) {
				niveauDeTraitrise--;
			}
		}
	}

}
