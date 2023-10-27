package personnages;

public class Humain {
	private String nom ;
	private String boissonFavorite ; 
	private int argentPosseder ;
	
	
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
	public void parler (String texte) {
		System.out.println(texte);
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
	
	
	
	
	
	
}

