package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int valeurDon = (int) (this.getArgent() * 0.1);
		this.parler(beneficiaire.getNom() + " prend ces " + valeurDon + " sous");
		beneficiaire.recevoir(valeurDon);
	}

}
