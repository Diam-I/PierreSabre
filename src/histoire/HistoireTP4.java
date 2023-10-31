package histoire;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Humain;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire("kombucha");
		prof.acheter("un jeu", 2);
		prof.acheter("kimono", 50);

		Commercant marco = new Commercant("Marco", "thé", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire("thé");

		Yakuza YakuLeNoir=new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		YakuLeNoir.direBonjour();
		YakuLeNoir.extorquer(marco);
		
		
		Ronin roro=new Ronin("Roro","shochu",60);
		roro.direBonjour();
		roro.donner(marco);
		
		roro.provoquer(YakuLeNoir);
		
		
		
	}
}
