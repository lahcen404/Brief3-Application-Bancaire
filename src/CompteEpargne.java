public class CompteEpargne extends  Compte{

    private double TauxInteret;
    public CompteEpargne(int numero, double solde, Client proprietaire,double TauxInteret) {
        super(numero, solde, proprietaire);
        this.TauxInteret=TauxInteret;
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
