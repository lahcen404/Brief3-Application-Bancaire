public class Client {
    int id;
    String nom;
    String prenom;
    String email;
    String adresse;
    String telephone;

    // Constructor
    public Client(int id, String nom, String prenom, String email, String adresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
    }
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getEmail(){
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setNom(String nom){
        this.nom=nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
