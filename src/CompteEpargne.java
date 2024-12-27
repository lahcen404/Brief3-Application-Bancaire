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
    public void afficherInformations() {

    }

    @Override
    public String toString() {
        return "=============================\n" +
                "    Détails du Compte Épargne\n" +
                "=============================\n" +
                "Numéro de Compte : " + numero + "\n" +
                "Solde            : " + solde + " \n" +
                "Taux d'Intérêt   : " + TauxInteret + "\n" +
                "Propriétaire     :\n " + (proprietaire != null ? proprietaire : "Aucun") + "\n" +
                "=============================\n";
    }
}
