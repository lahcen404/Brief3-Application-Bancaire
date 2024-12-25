import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

Run();
    }

    private static void Run() {

        Scanner sc = new Scanner(System.in);
        int choixx = -1;
        while (choixx!=0) {
            try {
               int choix=-1;
                while (choix != 0) {
                    System.out.println("Menu Principal:");
                    System.out.println("1. Gérer des clients");
                    System.out.println("2. Gérer des comptes");
                    System.out.println("3. Gérer des opérations");
                    System.out.println("0. Quitter");
                    System.out.print("Entrez votre choix: ");
                    choix = sc.nextInt();

                    switch (choix) {
                        case 1:
                            gererClients(sc);
                            break;
                        case 2:
                            gererComptes(sc);
                            break;
                        case 3:
                            gererOperations(sc);
                            break;
                        case 0:
                            System.out.println("Au revoir!");
                            break;
                        default:
                            System.out.println("Choix invalide, veuillez réessayer.");
                    }
                }
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("Entre only Numbers");
                sc.nextLine();
            }
        }
    }

            private static void gererClients(Scanner scanner) {
                int choix = -1;
                while (choix != 0) {
                    System.out.println("\nMenu Gestion des Clients:");
                    System.out.println("1. Ajouter un client");
                    System.out.println("2. Afficher la liste des clients");
                    System.out.println("3. Rechercher un client par ID");
                    System.out.println("0. Retour au menu principal");
                    System.out.print("Entrez votre choix: ");
                    choix = scanner.nextInt();

                    switch (choix) {
                        case 1:
                            Client.ajouterClient();
                            break;
                        case 2:
                           Client.afficherClient();
                            break;
                        case 3:
                            Client.RechercheClientById();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choix invalide, veuillez réessayer.");
                    }
                }
            }

            private static void gererComptes(Scanner scanner) {
                int choix = -1;
                while (choix != 0) {
                    System.out.println("\nMenu Gestion des Comptes:");
                    System.out.println("1. Créer un compte bancaire");
                    System.out.println("2. Afficher les informations d'un compte");
                    System.out.println("3. Associer plusieurs comptes à un client");
                    System.out.println("0. Retour au menu principal");
                    System.out.print("Entrez votre choix: ");
                    choix = scanner.nextInt();

                    switch (choix) {
                        case 1:
                            //  account creation
                            break;
                        case 2:
                            //  account information display
                            break;
                        case 3:
                            // associate multiple accounts with a client
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choix invalide, veuillez réessayer.");
                    }
                }
            }

            private static void gererOperations(Scanner scanner) {
                int choix = -1;
                while (choix != 0) {
                    System.out.println("\nMenu Gestion des Opérations:");
                    System.out.println("1. Effectuer un dépôt");
                    System.out.println("2. Effectuer un retrait");
                    System.out.println("3. Effectuer un virement");
                    System.out.println("4. Afficher l'historique des opérations");
                    System.out.println("5. Filtrer les opérations");
                    System.out.println("0. Retour au menu principal");
                    System.out.print("Entrez votre choix: ");
                    choix = scanner.nextInt();

                    switch (choix) {
                        case 1:
                            //  deposit
                            break;
                        case 2:
                            //  withdrawal
                            break;
                        case 3:
                            //  transfer
                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choix invalide, veuillez réessayer.");
                    }
                }
            }
        }




//        for(int i=0;i<=2;i++){
//            Client.ajouterClient();
//            Client.afficherClient();
//        }
//        Client.RechercheClientById();




