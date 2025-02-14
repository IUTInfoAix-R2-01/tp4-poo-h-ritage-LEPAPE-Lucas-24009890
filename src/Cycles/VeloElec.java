package Cycles;

public class VeloElec extends Velo{
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private static double DEFAUT_COUPLE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
        super(braquet, diamRoue);
        this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
    }
	
	 public double getDEFAUT_COUPLE_MOTEUR() {
		 return DEFAUT_COUPLE_MOTEUR;
	 }
	 
	 public void setDEFAULT_COUPLE_MOTEUR(double NEW_DEFAUT_COUPLE_MOTEUR){
		 DEFAUT_COUPLE_MOTEUR = NEW_DEFAUT_COUPLE_MOTEUR;
	 }
	 
	 public double getFacteurPuissanceMoteur() {
		 return facteurPuissanceMoteur;
	 }
	 
	 public void setFacteurPuissanceMoteur(double NEW) {
		 this.facteurPuissanceMoteur = NEW;
	 }
	 
	 public String toString() {
		 return String.format("Vélo Électrique [Braquet: %.2f, DiamRoue: %.2f, PuissanceMoteur: %.2f]", getBraquet(), getDiamRoue(), facteurPuissanceMoteur);
	 }
	 
	 public double getPuissance(double FrequenceCoupsDePedale) {
		 return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	 }
	 
	 public static void main(String[] args) {
	        VeloElec ve1 = new VeloElec();
	        VeloElec ve2 = new VeloElec(2.5, 20);
	        VeloElec ve3 = new VeloElec(18, 2.5, 25);

	        System.out.println("Test des constructeurs:");
	        System.out.println(ve1);
	        System.out.println(ve2);
	        System.out.println(ve3);

	        System.out.println("Test des getters et setters:");
	        ve1.setFacteurPuissanceMoteur(22);
	        System.out.println(ve1);

	        System.out.println("Test de getPuissance:");
	        System.out.printf("Puissance ve3 : %.2f", ve3.getPuissance(90));
	    }
}
