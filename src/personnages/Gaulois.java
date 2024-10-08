package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + " �");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force / 3 * 10);
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler(" Merci Druide, je sens que ma force est " + forcePotion + " fois d�cupl�e");
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		System.out.println("Nouveaux Gaulois...");
		Gaulois Ludovix = new Gaulois("Ludovix", 8);
		Ludovix.parler("okay");

		Romain Alexendre = new Romain("Alexendre", 10);
		Alexendre.parler("okay");

		Ludovix.frapper(Alexendre);
		Ludovix.boirePotion(10);
	}
}
