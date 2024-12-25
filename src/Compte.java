public abstract class Compte {
    String numero;
    double solde;
    Client proprietaire;

    // Constructor
    public Compte(String numero, double solde, Client proprietaire) {
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = proprietaire;
        
    }

    public static  void ajouterCompte(){
        System.out.println("  ");
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
