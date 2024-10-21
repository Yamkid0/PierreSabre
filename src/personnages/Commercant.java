package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		//Solution 1 avec getter solution 2 changer visibilité
		int argent = this.getArgent();
		this.perdreArgent(argent);
		this.parler("J'ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		this.parler(argent + " sous ! Je te remercie généreux donateur!");
		this.gagnerArgent(argent);
	}
	
}
