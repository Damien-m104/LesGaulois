package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois Ludovix = new Gaulois("Ludovix", 8);
		Ludovix.parler("Bonjour à tous");

		Romain Alexendre = new Romain("Alexendre", 6);
		Alexendre.parler("UN GAU... UN GAUGAU");

		Ludovix.frapper(Alexendre);
		Ludovix.frapper(Alexendre);
		Ludovix.frapper(Alexendre);

	}

}
