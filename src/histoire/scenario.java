package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class scenario {
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("asterix",8 );
		System.out.println(asterix);
		asterix.parler("bonjour à tous");
		Romain Minus= new Romain("Minus",6 );
		Minus.parler("un Gaulois est un petit");
		Minus.parler("UN GAU...UN GAUGAU");
		asterix.frapper(Minus);

		asterix.frapper(Minus);
	
		asterix.frapper(Minus);
		

}
}
