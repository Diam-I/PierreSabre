package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, String boissonFavorite, int argentPosseder) {
		super(nom, "thé", argentPosseder);

	}
//	private int sommeExtorquer ;

	public int seFaireExtorquer(int sommeExtorquer) {

		if (getArgentPosseder() <= sommeExtorquer) {
			parler("J'ai tout perdu! Le monde est trop injuste ... ");
		}
		return sommeExtorquer;
	}

	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur ! ");
	}

}
