package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 5, 10);
		Panoramix.parler("Je vais aller pr�parer une petite potion...");
		Panoramix.preparerPotion();
		Gaulois Ob�lix = new Gaulois("Ob�lix", 25);
		Panoramix.booster(Ob�lix);
		Ob�lix.parler("Par B�l�nos, ce n'est pas juste");
		Gaulois Ast�rix = new Gaulois("Ast�rix", 8);
		Panoramix.booster(Ast�rix);
		Ast�rix.parler("Bonjour");
		Romain Minus = new Romain("Minus", 6);
		Minus.parler("UN GAU... UN GAUGAU...");
		Ast�rix.frapper(Minus);
	}

}
