public class CompteCourant extends  Compte{
        private  double fraiBancaire;

    public CompteCourant(int numero, double solde, Client proprietaire,double fraiBancaire) {
        super(numero, solde, proprietaire);
        this.fraiBancaire=fraiBancaire;
    }

    //Polymorphism
    @Override
    public void afficherInformations() {
        System.out.println("Compte Courant:");
        System.out.println("Numéro: " + numero);
        System.out.println("Solde: " + solde);
        System.out.println("Frais Bancaires: " + fraiBancaire);
        System.out.println("Propriétaire: " + (proprietaire != null ? proprietaire.getNom() : "Aucun"));
    }

    public double getFraiBancaire() {
        return fraiBancaire;
    }

    public void setFraiBancaire(double fraiBancaire) {
        this.fraiBancaire = fraiBancaire;
    }

    @Override
    public String toString() {
        return "CompteCourant{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                ", proprietaire=" + proprietaire +
                ", fraiBancaire=" + fraiBancaire +
                '}';
    }
}
