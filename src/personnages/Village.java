package personnages;

public class Village {
	private String nom;
	private Chef chef;
	 
	private Gaulois[] villageois;
	private int nbVillageois=0;
	 public Village(String nom, int nbVillageoisMaximun) 
	 {
		 this.nom=nom;
		 villageois= new Gaulois[nbVillageoisMaximun];
	 }
	 
	 public void ajouterHabitant(Gaulois g) 
	 {
		 villageois [nbVillageois]=g;
		 nbVillageois++;
	 }
	
	 public Gaulois trouverHabitant(int i) 
	 {
		 return villageois[i];
		 
	 }
	
	public void setChef(Chef chef) {
		this.chef=chef;
		
	}
	public String getNom() {
		return nom;
	}
	
	public void afficherVillageois()
	{
		int i;
		for ( i=0; i< nbVillageois; i++)
		{
			System.out.println(chef.getNom());
			System.out.println(villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) 
	{
		Village village= new Village("Village des Irreductibles",30);
		Chef Abraracourcix=new Chef("Abraracourcix",6,village);
		village.setChef(Abraracourcix);
		Gaulois obelix = new Gaulois("obelix",25);
		Gaulois axterix = new Gaulois("axterix",8);
		village.ajouterHabitant(obelix);
		village.ajouterHabitant(axterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		village.afficherVillageois();
//		
		
	}
}
