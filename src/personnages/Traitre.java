package personnages;
import java.util.Random;
public class Traitre extends Samourai {
	int niveauTraitise ; 
	public Traitre (String seigneur , String nom , String boissonPreferer , int argentPosseder ,int niveauTraitrise) {
		super(seigneur, nom, boissonPreferer, argentPosseder);
		this.niveauTraitise = niveauTraitrise;
	}
	
	public void ranconner (Commercant commercant) {
		if (niveauTraitise < 3) {
			int argentCommercant;
			int argentRanconner; 
			argentCommercant = commercant.getArgentPosseder();
			argentRanconner = (argentCommercant*2)/10 ; 
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			niveauTraitise ++ ; 
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi "+ argentRanconner + " sous ou gare à toi !" );
			commercant.parler("Tout de suite grand " + getNom() + ".");
			
		}
		else {
			parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else {
			int don ; 
			don = getArgentPosseder()*1/20;
			Random r = new Random();
			int n = r.nextInt(nbConnaissance);
			String nomAmi ; 
			nomAmi = memoire[n].getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami avec "+ nomAmi + "." );
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + "sous.");
			memoire[n].gagnerArgent(don); 
			perdreArgent(don); 
			String nom ; 
			nom=getNom(); 
			memoire[n].parler("Merci " + nom +". vous êtes quelqu'un de bien.");
			
			
		}
	}
	@Override 
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traîtrise est : "+ niveauTraitise + ". Chut !"); 
	}
	
}
