package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 5, 10);
		Panoramix.parler("Je vais aller préparer une petite potion...");
		Panoramix.preparerPotion();
		Gaulois Obélix = new Gaulois("Obélix", 25);
		Panoramix.booster(Obélix);
		Obélix.parler("Par Bélénos, ce n'est pas juste");
		Gaulois Astérix = new Gaulois("Astérix", 8);
		Panoramix.booster(Astérix);
		Astérix.parler("Bonjour");
		Romain Minus = new Romain("Minus", 6);
		Minus.parler("UN GAU... UN GAUGAU...");
		Astérix.frapper(Minus);
	}

}
