import java.util.Date;
import java.util.Scanner;

public class Operation {
Scanner scanner = new Scanner(System.in);

    private String type;
    private double montant;
    private Date date;
    private Compte compteAssocier;

    public Operation(String type,double montant,Date date,Compte compteAssocier ){
        this.type=type;
        this.montant=montant;
        this.date=date;
        this.compteAssocier=compteAssocier;
    }
    public static  void makeDepot(Compte compte,double montant){
        compte.solde+=montant;
        Operation operation=new Operation("Depot",montant,new Date(),compte);
        System.out.println("Depot successfully !!");
    }
    public static void makeRetrait(Compte compte,double montant){
         if(compte.solde>=montant){
             compte.solde-=montant;
             Operation operation=new Operation("Retrait",montant,new Date(),compte);
             System.out.println("Retrait Succesfully !!");
         }else{
             System.out.println("Solde insuffisant !");
         }
    }
    public static void ConsultationDeSolde(Compte compte){
        System.out.println("Solde actueel : "+compte.solde);
    }

    public static void effectuerDepot(Scanner scanner) {
        System.out.print("Entre numero de compte: ");
        int numeroCompte = scanner.nextInt();
        Compte compte = Compte.IsCompteExiste(numeroCompte);
        if (compte != null) {
            System.out.print("Entre montant du depot: ");
            double montant = scanner.nextDouble();
            Operation operation = new Operation("depot", montant, new Date(), compte);
            operation.makeDepot(compte, montant);
            System.out.println("Depot Successfull !!");
        } else {
            System.out.println("Compte non trouvee");
        }
    }
    
    public static void effectuerRetrait(Scanner scanner) {
        System.out.print("Entrez le numero de compte: ");
        int numeroCompte = scanner.nextInt();
        Compte compte = Compte.IsCompteExiste(numeroCompte);
        if (compte != null) {
            System.out.print("Entre montant du retrait: ");
            double montant = scanner.nextDouble();
            Operation operation = new Operation("retrait", montant, new Date(), compte);
            operation.makeRetrait(compte, montant);
            System.out.println("Retrait Successfull");
        } else {
            System.out.println("Compte non trouve");
        }
    }
    
    public static void consulterSolde(Scanner scanner) {
        System.out.print("Entre  numero de compte: ");
        int numeroCompte = scanner.nextInt();
        Compte compte = Compte.IsCompteExiste(numeroCompte);
        if (compte != null) {
            Operation operation = new Operation("consultation", 0, new Date(), compte);
            double solde = operation.getCompteAssocier().solde;
            System.out.println(" Solde du compte est: " + solde);
        } else {
            System.out.println("Compte non trouve");
        }
    }

    public String getType(){
        return type;
    }
    public double getMontant(){
        return montant;
    }

    public Date getDate() {
        return date;
    }
    public Compte getCompteAssocier(){
        return compteAssocier;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDate(Date date){
        this.date=date;
    }
    public void setCompteAssocier(){
        this.compteAssocier=compteAssocier;
    }
}
