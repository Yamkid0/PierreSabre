package histoire;

import personnages.Commercant;
import personnages.GrandMere;
import personnages.Humain;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitres;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		/*marco.direBonjour();
		chonin.direBonjour();
		kumi.direBonjour();
		yaku.direBonjour();
		roro.direBonjour();*/
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		System.out.println("----");
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sak�", 80);
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("th�");
		
		System.out.println("----");
		Traitres masako = new Traitres("Miyamoto", "Masako", "whisky", 100);
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.direBonjour();
		masako.direBonjour();
		masako.ranconner(marco);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.direBonjour();
		roro.direBonjour();
		
		Samourai akira = new Traitres("Miyamoto", "Akira", "whisky", 50);
		Ronin hiro = new Traitres("Miyamoto", "Hiro", "sak�", 20);
		Humain nori = new Traitres("Miyamoto", "Nori", "whisky", 70);
		akira.direBonjour();
		hiro.direBonjour();
		nori.direBonjour();
		System.out.println("--\n\n");
		
		GrandMere grandMere = new GrandMere("Grand-M�re", 10);
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();
	}

}
