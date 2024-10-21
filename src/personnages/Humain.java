package personnages;

public class Humain {
	private String nom;
	
	private String boissonFavorite;
	
	protected int argent;
	
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	protected void parler(String texte) {
		System.out.println("(" + this.nom + ")" + " - " + texte);
	}
	
	public String getNom() {
		return nom;
	}

	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFavorite);
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de " + this.boissonFavorite + "! GLOUPS!");
	}
	
	public void acheter(String bien, int prix) {
		if(prix < argent) {
			this.parler("J'ai " +  argent + " en poche. Je vais pouvoir m'offrir un/une " + bien +" � " + prix + " sous");
			this.perdreArgent(prix);
		} else {
			this.parler("Je n'ai plus que " +  argent + " en poche. Je ne peux m�me pas m'offrir un/une " + bien + " � " + prix + " sous");
		}
	}
	
	protected void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
}
