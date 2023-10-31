package personnages;

public class Ronin extends Humain {
	private int attributHonneur = 1;

	public Ronin(String nom, String boissonPreferer, int argentPosseder) {
		super(nom, boissonPreferer, argentPosseder);
		this.attributHonneur = attributHonneur;
	}
	public void donner(Commercant beneficiaire) {
		int argent = getArgentPosseder();
		int argentDonner = (10*argent)/100;
		argent -= argentDonner;
		System.out.println(beneficiaire.getNom()+" prend ces "+argentDonner+" sous.");
		beneficiaire.recevoir(argentDonner);
		
	}
	
	
}
