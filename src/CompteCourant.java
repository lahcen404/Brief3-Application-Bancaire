public class CompteCourant extends  Compte{
        private  double fraiBancaire;

    public CompteCourant(int numero, double solde, Client proprietaire,double fraiBancaire) {
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
    public void afficherInformations() {

    }
    @Override
    public String getType() {
        return "Courant";
    }

    @Override
    public String toString() {
        return "=============================\n" +
                "    Détails du Compte Courant\n" +
                "=============================\n" +
                "Numéro de Compte : " + numero + "\n" +
                "Solde            : " + solde + " \n" +
                "Frais Bancaires  : " + fraiBancaire + "\n" +
                "Propriétaire     : \n" + (proprietaire != null ? proprietaire : "Aucun") + "\n" +
                "=============================\n";
    }
}
