package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonPreferer, int argentPosseder, String clan) {
		super(nom, boissonPreferer, argentPosseder);
		this.clan = clan;
	}
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens,tiens,ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int sommeExtorquer = victime.seFaireExtorquer();
		int argentApresExtorquer = sommeExtorquer + getArgentPosseder();
		parler("J'ai piqué les " + sommeExtorquer + " sous de " + victime.getNom() + ", ce qui me fait " + argentApresExtorquer
				+ " sous dans ma poche ! Hi ! Hi !");
		setArgentPosseder(argentApresExtorquer);
		

	}
	public int perdre() {
		int argentPerdu = getArgentPosseder();
		perdreArgent(argentPerdu);
		reputation -= 1 ;
		System.out.println("J'ai perdu mon duel et mes "+argentPerdu+" sous, snif ... J'ai déshonoré le clan de "+ clan +".");
		return argentPerdu;
	}
	
	public int gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1 ;
		System.out.println("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+"? Je l'ai dépouillé de ses "+ gain + " sous.");
		
		return getArgentPosseder() ;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+ clan +".");
	}
	
	

}
