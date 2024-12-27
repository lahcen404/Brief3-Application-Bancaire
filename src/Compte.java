import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Compte {
    int numero;
    double solde;
    Client proprietaire;

    static ArrayList<Compte> comptes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Constructor
    public Compte(int numero, double solde, Client proprietaire) {
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = proprietaire;

    }




//    public static  void ajouterCompte(){
//
//            System.out.println("Entre Numero de Compte :");
//            String numeroCompte = sc.nextLine();
//            System.out.println("Entre salaire :");
//            Double salaire = sc.nextDouble();
//
//          //  Compte newCompte =new Compte (numeroCompte,salaire,null);
//         //  comptes.add(newCompte);
//            System.out.println("Compte Ajouter sucessfully");
//
//        }
public abstract void afficherInformations();

    public static boolean isNumeroCompteExiste(int numero){
        for(Compte compte : comptes){
            if(compte.getNumero()==numero){
                return true;
            }
        }
        return false;
}

    public static void ajouterCompte() {

        if(Client.clients.isEmpty()){
                 System.out.println("You can't Create Account because No Client (Empty)");
                 return;
        }
        int numero=0;
        try {
            while(true) {
                System.out.print("Entrez  numero de compte: ");
                numero = sc.nextInt();
                sc.nextLine();

                if (isNumeroCompteExiste(numero)) {
                    System.out.println("Le numero de compte existe deja");
                }else{
                    break;
                }
            }


            System.out.print("Entrez le solde initial: ");
            double solde = sc.nextDouble();
            sc.nextLine();

            System.out.print("Entrez le type de compte (1 pour courant, 2 pour épargne): ");
            int type = sc.nextInt();
            sc.nextLine();

            Compte compte;
            if (type == 1) {
                System.out.print("Entrez les frais bancaires: ");
                double fraisBancaires = sc.nextDouble();
                compte = new CompteCourant(numero, solde, null, fraisBancaires);
            } else if (type == 2) {
                System.out.print("Entrez le taux d'intérêt: ");
                double tauxInteret = sc.nextDouble();
                compte = new CompteEpargne(numero, solde, null, tauxInteret);
            } else { System.out.println("Type de compte invalide.");
                return;
            }

            // Add the account to the list
            comptes.add(compte);
            System.out.println("Compte créé avec succès.");
        } catch (InputMismatchException e) {
            System.out.println("Erreur de saisie. Veuillez entrer des valeurs valides.");
            sc.nextLine();
        }
    }

    public static void afficherComptes(){

        if(comptes.isEmpty()){
            System.out.println("No Comptes , Liste Comptes is Empty");
        }
        for(Compte compte : comptes){
            System.out.println(compte);
        }

    }

    public static Compte IsCompteExiste(int numero){
        for(Compte compte : comptes) {
            if(compte.getNumero()==numero){
                return compte;
            }
        }

        return null;
    }


    public static  void associerCompteToClient(){
        System.out.println("Entrer numero de classe :");
        int numero=sc.nextInt();
        sc.nextLine();
        Compte compteExiste=IsCompteExiste(numero);
        System.out.println("Entrer id de Client :");
        int id=sc.nextInt();
        sc.nextLine();
        Client clientExiste=Client.IsClientExiste(id);
        if(compteExiste!=null){
            if(clientExiste!=null){
                compteExiste.proprietaire=clientExiste;
                System.out.println("Compte associer successfully");
            }else {
                System.out.println("Compte non trouver");
            }
            }else{
                System.out.println("Compte non trouver");
            }
        }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "Details du Compte :\n" +
                "-------------------\n" +
                "Numero de Compte : " + numero + "\n" +
                "Solde            : " + solde + " \n" +
                "Proprietaire     : " + proprietaire + "\n";
    }

}
