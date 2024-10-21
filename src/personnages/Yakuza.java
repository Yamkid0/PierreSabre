package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 4;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorque = victime.seFaireExtorquer();
		this.gagnerArgent(argentExtorque);
		reputation++;
		this.parler("J'ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		reputation -= 1;
		int totalArgent = this.getArgent();
		this.perdreArgent(totalArgent);;
		this.parler("J’ai perdu mon duel et mes " + totalArgent + " sous, snif... J'ai déshonoré le clan de " + this.clan);
		return totalArgent;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		reputation += 1;
		this.parler("Ce ronin pensait vraiment battre "+ this.getNom() +" du clan de "+ this.clan + "? Je l'ai dépouillé de ses " + gain + " sous");
	}
	
}
