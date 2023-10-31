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
		perdreArgent(argentDonner);
		beneficiaire.gagnerArgent(argentDonner);
		
		System.out.println(beneficiaire.getNom()+" prend ces "+argentDonner+" sous.");
		beneficiaire.recevoir(argentDonner);
		
	}
	public void provoquer(Yakuza adversaire) {
		int force = attributHonneur*2 ; 
		if (force>=adversaire.getReputation()) {
			adversaire.perdre();
			attributHonneur += 1 ;
			System.out.println("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
			System.out.println("Je t'ai eu petit yakusa !");
		}
		else {
			adversaire.gagner(getArgentPosseder());
//			perdreArgent(argent);
			attributHonneur -= 1 ; 
			System.out.println("J'ai perdu contre de yakuza,mon honneur et ma bourse ont en pris un coup.");
		}
	}
	
	
}
