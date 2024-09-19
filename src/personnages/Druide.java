package personnages;

import java.util.*;
import java.util.random.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;

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
		Random random = new Random();
		int potion = random.nextInt(effetPotionMax);
		if (potion>7) {
			parler("J'ai préparé une ssuper potion de force");
		}
	}

	public static void main(String[] args) {
		System.out.println("Nouveaux Druide...");
		Druide Panoramix = new Druide("Panoramix", 4, 9);
	}
}
