package personnages;

import java.util.*;

public class Druide {
	public static final int EFFET_POTION_MOYENNE = 7;
	
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;
	private Random random= new Random();

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = 1;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void preparerPotion() {
		int potion = random.nextInt(effetPotionMin, effetPotionMax);
		if (potion > EFFET_POTION_MOYENNE) {
			parler("J'ai préparé une super potion de force " + potion);
			this.forcePotion = potion;
		} else {
			parler(" Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + potion);
			this.forcePotion = potion;
		}
	}

	public void booster(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) {
			parler("Non, Obélix !... Tu n’auras pas de potion magique ! ");
		} else {
			gaulois.boirePotion(forcePotion);
		}
	}

	public static void main(String[] args) {
		System.out.println("Nouveaux Druide...");
		Druide Panoramix = new Druide("Panoramix", 5, 10);
		Panoramix.preparerPotion();
	}
}
