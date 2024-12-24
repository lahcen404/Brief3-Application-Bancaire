import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static ArrayList<Client> clients = new ArrayList<>();
    static Scanner sc=new Scanner(System.in);

    private static int lastId=0;
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String telephone;


    // Constructor
    public Client( String nom, String prenom, String email, String adresse, String telephone) {
        this.id = ++lastId;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
    }


    public static void ajouterClient(){

        System.out.println("Entre Nom :");
        String nom = sc.nextLine();
        System.out.println("Entre Prenom :");
        String prenom = sc.nextLine();
        System.out.println("Entre email :");
        String email = sc.nextLine();
        System.out.println("Entre adresse :");
        String adresse = sc.nextLine();
        System.out.println("Entre telephone :");
        String telephone = sc.nextLine();

        Client newClient =new Client (nom,prenom,email,adresse,telephone);
        clients.add(newClient);
        System.out.println("Client Ajouter sucessfully");

    }

    public static void afficherClient(){

        for(Client client:clients){
            System.out.println(client);
        }
    }
    public static void RechercheClientById() {
        System.out.println("Entre id ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Client client : clients) {
            if (client.getId()==id){
                System.out.println(client);
            }
        }
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

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
