package personnages;

public class Samourai extends Ronin {
	
	private String seigneur;

	public Samourai(String seigneur,String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur " + seigneur);
	}
	
	
	public void boire(String boisson) {
		this.parler("Qu'est ce que je vais boire comme boisson ? Tiens je vais prendre du " + boisson);
	}

}
