public class Application {
    public static void main(String[] args) {

        for(int i=0;i<=2;i++){
            Client.ajouterClient();
            Client.afficherClient();

        }
        Client.RechercheClientById();
    }
}
