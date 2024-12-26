import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
   public static ArrayList<Client> clients = new ArrayList<>();
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

        String nom;
        do {
            System.out.println("Entre Nom :");
            nom = sc.nextLine();
            if (!isNameValid(nom)) {
                System.out.println("Invalid only Characters without Numbers and more than 2 character");
            }
        }while(!isNameValid(nom));

        String prenom;
        do {
            System.out.println("Entre Prenom :");
            prenom = sc.nextLine();
            if (!isNameValid(prenom)) {
                System.out.println("Invalid only Characters without Numbers and more than 2 character");
            }
        }while(!isNameValid(prenom));

        String email;
        do {
            System.out.println("Entre email :");
            email = sc.nextLine();
            if(!isValidEmail(email)){
                System.out.println("Email not valid (Like this : email@doamin.com)");
            }

        }while (!isValidEmail(email));

        System.out.println("Entre adresse :");
        String adresse = sc.nextLine();
        String telephone;
        do {
            System.out.println("Entre telephone :");
             telephone = sc.nextLine();
             if(!isValidNumero(telephone)){
                 System.out.println("Numero not valid (Like this : 06|05|07 ..... 10 digits)");
             }
        }while (!isValidNumero(telephone));

        Client newClient =new Client (nom,prenom,email,adresse,telephone);
        clients.add(newClient);
        System.out.println("Client Ajouter sucessfully");

    }

    //Method REGEX Email
    static boolean isValidEmail(String email){
        String emailRegex="^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+.[a-zA-Z]{2,}$";
        Pattern pattern=Pattern.compile(emailRegex);
        Matcher matcher= pattern.matcher(email);
        return  matcher.matches();
    }

    //Method REGEX Name & Prenom
    static boolean isNameValid(String name){
        String nameRegex="^[a-zA-Z]{2,}$";
        Pattern pattern=Pattern.compile(nameRegex);
        Matcher matcher= pattern.matcher(name);
        return matcher.matches();
    }

    //Method REGEX Numero
    static boolean isValidNumero(String email){
        String numeroRegex="^(06|07|05)\\d{8}$";
        Pattern pattern=Pattern.compile(numeroRegex);
        Matcher matcher= pattern.matcher(email);
        return  matcher.matches();
    }


    //Display information of client
    public static void afficherClient(){

        if(clients.isEmpty()){
            System.out.println("No Client Available");
        }
        for(Client client:clients){
            System.out.println(client);
        }
    }

    //Check if Client is existe
    boolean clientExiste(){
      for(Client client : clients) {
      if(client.getId()==id){
          return true;
      }
      }

return false;
    }


    public static void RechercheClientById() {

        if(clients.isEmpty()){
            System.out.println("No Client Available");
        }
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
        return "Client Information:\n" +
                "-------------------\n" +
                "ID          : " + id + "\n" +
                "Nom        : " + nom + "\n" +
                "Prenom  : " + prenom + "\n" +
                "Email       : " + email + "\n" +
                "Address     : " + adresse + "\n" +
                "Telephone       : " + telephone + "\n";
    }

}
