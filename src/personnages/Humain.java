package personnages;

public class Humain {
	private String nom;
	
	private String boissonFavorite;
	
	protected int argent;
	
	protected int nbConnaissance;
	
	protected Humain[] memoire = new Humain[NB_MAX_CONNAISSANCE];
	
	private static final int NB_MAX_CONNAISSANCE = 30;
	
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
			this.parler("J'ai " +  argent + " en poche. Je vais pouvoir m'offrir un/une " + bien +" à " + prix + " sous");
			this.perdreArgent(prix);
		} else {
			this.parler("Je n'ai plus que " +  argent + " en poche. Je ne peux même pas m'offrir un/une " + bien + " à " + prix + " sous");
		}
	}
	
	protected void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void listerConnaissance() {
		StringBuilder names = new StringBuilder();
		System.out.println("NB co " + nbConnaissance);
		for(int i = 0; i < nbConnaissance; i++) {
			names.append(this.memoire[i].getNom() + ", ") ;
		}
		this.parler("Je connais beaucoup de monde dont : " + names.toString());
	}
	
	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	private void memoriser(Humain humain) {
		if(nbConnaissance < NB_MAX_CONNAISSANCE) {
			this.memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			for(int i = 0; i < nbConnaissance-1; i ++) {
				this.memoire[i] = this.memoire[i+1];
			}
			System.out.println(nbConnaissance);
			this.memoire[nbConnaissance-1] = humain;
		}
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		humain.repondre(this);
		this.memoriser(humain);
	}
}
