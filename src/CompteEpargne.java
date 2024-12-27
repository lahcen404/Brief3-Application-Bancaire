public class CompteEpargne extends  Compte{

    private double TauxInteret;
    public CompteEpargne(int numero, double solde, Client proprietaire,double TauxInteret) {
        super(numero, solde, proprietaire);
        this.TauxInteret=TauxInteret;
    }


    //Polymorphism
    @Override
    public void afficherInformations() {
        System.out.println("Compte Epargne:");
        System.out.println("Numéro: " + numero);
        System.out.println("Solde: " + solde);
        System.out.println("Frais Bancaires: " + TauxInteret);
        System.out.println("Propriétaire: " + (proprietaire != null ? proprietaire.getNom() : "Aucun"));
    }

    public double getTauxInteret() {
        return TauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        TauxInteret = tauxInteret;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                ", proprietaire=" + proprietaire +
                ", TauxInteret=" + TauxInteret +
                '}';
    }
}
