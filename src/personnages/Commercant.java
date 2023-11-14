package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argentPosseder) {
		super(nom, "thé", argentPosseder);

	}
	
//	private int sommeExtorquer ;

	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste ... ");
		int argentPerdu = getArgentPosseder () ;
		perdreArgent(argentPerdu);
		return argentPerdu;
	}

	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur ! ");
		gagnerArgent(argent);
	}

}
