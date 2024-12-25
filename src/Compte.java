import java.util.ArrayList;
import java.util.Scanner;

public abstract class Compte {
    String numero;
    double solde;
    Client proprietaire;

    static ArrayList<Compte> comptes = new ArrayList<>();
   static  Scanner sc=new Scanner(System.in);
    // Constructor
    public Compte(String numero, double solde, Client proprietaire) {
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = proprietaire;
        
    }

    public static  void ajouterCompte(){

            System.out.println("Entre Numero de Compte :");
            String numeroCompte = sc.nextLine();
            System.out.println("Entre salaire :");
            Double salaire = sc.nextDouble();



//here
           // Compte newCompte =new Compte (numeroCompte,salaire,null);
          //  comptes.add(newCompte);
            System.out.println("Compte Ajouter sucessfully");

        }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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
        return "Compte{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                ", proprietaire=" + proprietaire +
                '}';
    }
}
