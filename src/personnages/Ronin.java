package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int valeurDon = (int) (this.argent * 0.1);
		this.parler(beneficiaire.getNom() + " prend ces " + valeurDon + " sous");
		this.perdreArgent(valeurDon);
		beneficiaire.recevoir(valeurDon);
	}
	
	public void provoquer(Yakuza adversaire) {
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int forceRonin = honneur * 2;
		if(forceRonin >= adversaire.getReputation()) {
			//Ronin gagne
			this.gagnerArgent(adversaire.argent);
			this.parler("Je t’ai eu petit yakuza!");
			adversaire.perdre();
		} else {
			//Yakuza gagne
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(this.argent);
			honneur--;
			this.perdreArgent(this.argent);
			
		}
	}

}
