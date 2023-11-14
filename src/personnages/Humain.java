package personnages;

public class Humain {
	static int max=3;
	private String nom ;
	private String boissonFavorite ; 
	private int argentPosseder ;
	protected int nbConnaissance = 0  ;
	protected Humain[] memoire=new Humain[max];
	
	
	
	public Humain(String nom, String boissonFavorite , int argentPosseder) {
		this.nom = nom ; 
		this.boissonFavorite = boissonFavorite; 
		this.argentPosseder = argentPosseder ;
		
	}
	
	public String getNom () {
		return nom ;
		
	}
	public int getArgentPosseder() {
		return argentPosseder ;
	}

	public void setArgentPosseder(int nouvelle) {
		argentPosseder = nouvelle;
	}

	protected void parler (String texte) {
		System.out.println("(" +nom + ")- " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ nom+" et j'aime boire du "+boissonFavorite);
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de "+ boisson + " ! GLOUPS ! ");
	}
	
	public void acheter(String bien,int prix) {
		if (prix > argentPosseder ) {
			parler("Je n'ai plus que"+ argentPosseder +" sous en poche. Je ne peux meme pas m'offrir "+ bien + " à "+ prix+" sous");
		}
		else {
		parler("J'ai "+ argentPosseder + " sous en poche. Je vais pouvoir m'offrir "+ bien +" à "+ prix + " sous");
		argentPosseder -= prix;
		}
	}
	protected int perdreArgent(int argentPerdu) {
		argentPosseder -= argentPerdu ;
		return 	argentPosseder  ;

	}
	protected int gagnerArgent(int argentGagner) {
		argentPosseder += argentGagner;
		return argentPosseder;
	}
	
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance<max) {
			memoire[nbConnaissance]= autreHumain; 
			nbConnaissance++;
		}
		else {
			for (int i=0;i<max-1;i++) {
				memoire[i]=memoire[i+1]; 
			}
			memoire[max - 1]=autreHumain;
		}
	}
	
	private void repondre(Humain autreHumain) {
		autreHumain.memoriser(this);
		autreHumain.direBonjour();
	}
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont :");
		for(int i=0;i<(nbConnaissance-1);i++) {
			parler(memoire[i].getNom()+", ");
		}
		parler(memoire[nbConnaissance-1].getNom()+".");
		
	}
	
	
	
}

