package personnages;

public class Yakuza extends Humain {
	private String clan;

	public Yakuza(String nom, String boissonPreferer, int argentPosseder, String clan) {
		super(nom, boissonPreferer, argentPosseder);
		this.clan = clan;

	}

	public void extorquer(Commercant victime) {
		parler("Tiens,tiens,ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int sommeExtorquer = victime.seFaireExtorquer();
		int argentApresExtorquer = sommeExtorquer + getArgentPosseder();
		parler("J'ai piqué les " + sommeExtorquer + " sous de " + victime.getNom() + ", ce qui me fait " + argentApresExtorquer
				+ " sous dans ma poche ! Hi ! Hi !");

	}
	

}
