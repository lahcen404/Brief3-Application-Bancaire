public class CompteCourant extends  Compte{
        private  double fraiBancaire;

    public CompteCourant(String numero, double solde, Client proprietaire,double fraiBancaire) {
        super(numero, solde, proprietaire);
        this.fraiBancaire=fraiBancaire;
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
