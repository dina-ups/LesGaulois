package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement=0;
	private Equipement[] equipements = new Equipement[2];
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
		}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int f = force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} 
		else {
			parler("J'abandonne...");
		}
		assert f>force;
	}
	
	public void sEquiper(Equipement equipement)
	{
		switch (nbEquipement) {
		case 2:
			System.out.println("le soldat"+nom+"est d�j� bien prot�g�!");
			break;
		case 1:
			if (equipements[0]==equipement) {
				System.out.println("le soldat"+nom+"possede d�j�"+equipement.toString());}
			break;
		default :
			
		}
	}
	public static void main(String[] args) {
		
	Romain Minus= new Romain("Minus",-6 );
	Minus.prendreParole();
	Minus.parler("UN GAU...UN GAUGAU");
	System.out.println(Equipement.CASQUE);
	
}
}
