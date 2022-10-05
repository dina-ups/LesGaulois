package personnages;

public class Village {
	private String nom;
	private Chef chef;
	 
	private Gaulois[] villageois;
	private int nbvillageois=0;
	 public Village(string nom, int nbVillageoisMaximun) 
	 {
		 this.nom=nom;
		 villageois= new Gaulois[nbVillageoisMaximun];
	 }
	 
	 public void ajouterHabitant(Gaulois g) 
	 {
		 villageois [nbVillageoisMaximum]=g;
		 nbVillageois++;
	 }
	
	public Village(String nom) {
		
	}
	public void setChef(Chef chef) {
		
	}
	public String getNom() {
		
	}
}
