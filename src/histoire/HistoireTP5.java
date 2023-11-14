package histoire;

import personnages.*;
public class HistoireTP5 {
	public static void main(String[] args) {

		Commercant marco = new Commercant("Marco",20);
		Commercant chonin = new Commercant("Chonin",40);
		Commercant kumi = new Commercant("Kumi",10); 
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong"); 
		Ronin roro=new Ronin("Roro","shochu",60); 
		Samourai akimoto = new Samourai("Miyamoto","Akimoto","saké",80);
		Traitre masaka = new Traitre("Miyamoto","Masaka","whisky",100);
		
		
		
		
		
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin); 
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		
		
		
//		yaku.direBonjour();

		
		

//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissance();

		
//		akimoto.boire("thé);
		
		
		masaka.faireLeGentil();
		masaka.ranconner(kumi);
		masaka.ranconner(chonin);
		masaka.ranconner(marco);
		akimoto.faireConnaissanceAvec(masaka);
		masaka.ranconner(kumi);
		masaka.faireConnaissanceAvec(yaku);
		masaka.faireLeGentil();
		masaka.faireConnaissanceAvec(roro);
		
	}
}
