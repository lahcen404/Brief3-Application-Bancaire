import java.util.Date;

public class Operation {
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
