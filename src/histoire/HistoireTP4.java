package histoire;

import personnages.Commercant;
import personnages.Humain;

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
		marco.seFaireExtorquer(20);
		marco.recevoir(15);
		marco.boire("thé");

	}
}
