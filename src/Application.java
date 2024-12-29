import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Start the application
        Run();
    }

    private static void Run() {
        Scanner sc = new Scanner(System.in);
        int choixx = -1;
        while (choixx != 0) {
            try {
                int choix = -1;
                while (choix != 0) {
                    // Display the main menu
                    System.out.println("Menu Principal:");
                    System.out.println("1. Gérer des clients");
                    System.out.println("2. Gérer des comptes");
                    System.out.println("3. Gérer des opérations");
                    System.out.println("0. Quitter");
                    System.out.print("Entrez votre choix: ");
                    choix = sc.nextInt();

                    switch (choix) {
                        case 1:
                            // Manage clients
                            gererClients(sc);
                            break;
                        case 2:
                            // Manage accounts
                            gererComptes(sc);
                            break;
                        case 3:
                            // Manage operations
                            gererOperations(sc);
                            break;
                        case 0:
                            // Exit the application
                            System.out.println("Au revoir!");
                            break;
                        default:
                            System.out.println("Choix invalide, veuillez réessayer.");
                    }
                }
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("Entre only Numbers");
                sc.next();
            }
        }
    }

    private static void gererClients(Scanner scanner) {
        int choix = -1;
        while (choix != 0) {
            try {
                // Display the client management menu
                System.out.println("\nMenu Gestion des Clients:");
                System.out.println("1. Ajouter un client");
                System.out.println("2. Afficher la liste des clients");
                System.out.println("3. Rechercher un client par ID");
                System.out.println("0. Retour au menu principal");
                System.out.print("Entrez votre choix: ");
                choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        // Add a new client
                        Client.ajouterClient();
                        break;
                    case 2:
                        // Display the list of clients
                        Client.afficherClient();
                        break;
                    case 3:
                        // Search for a client by ID
                        Client.RechercheClientById();
                        break;
                    case 0:
                        // Return to the main menu
                        break;
                    default:
                        System.out.println("Choix invalide, veuillez réessayer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entre only Numbers !!");
                scanner.next();
            }
        }
    }

    private static void gererComptes(Scanner scanner) {
        int choix = -1;
        while (choix != 0) {
            try {
                // Display the account management menu
                System.out.println("\nMenu Gestion des Comptes:");
                System.out.println("1. Créer un compte bancaire");
                System.out.println("2. Afficher les informations d'un compte");
                System.out.println("3. Associer compte à un client");
                System.out.println("0. Retour au menu principal");
                System.out.print("Entrez votre choix: ");
                choix = scanner.nextInt();

                
                switch (choix) {
                    case 1:
                        // Create a new bank account
                        Compte.ajouterCompte();
                        break;
                    case 2:
                        // Display account information
                        Compte.afficherComptes();
                        break;
                    case 3:
                        // Associate an account with a client
                        Compte.associerCompteToClient();
                        break;
                    case 0:
                        // Return to the main menu
                        break;
                    default:
                        System.out.println("Choix invalide, veuillez réessayer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entre only Numbers !!!");
                scanner.next();
            }
        }
    }

    private static void gererOperations(Scanner scanner) {
        int choix = -1;
        while (choix != 0) {
            try {
                // Display the operations management menu
                System.out.println("\nMenu Gestion des Opérations:");
                System.out.println("1. Effectuer un dépôt");
                System.out.println("2. Effectuer un retrait");
                System.out.println("3. Consulter le solde");
                System.out.println("4. Filter Comptes by Type");
                System.out.println("0. Retour au menu principal");
                System.out.print("Entrez votre choix: ");
                choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        // make a deposit
                        Operation.effectuerDepot(scanner);
                        break;
                    case 2:
                        // make a withdrawal
                        Operation.effectuerRetrait(scanner);
                        break;
                    case 3:
                        // Consult the balance
                        Operation.consulterSolde(scanner);
                        break;
                    case 4:
                        // Filter accounts by type
                        Compte.filtreCompteByType();
                        break;
                    case 0:
                        // Return to the main menu
                        break;
                    default:
                        System.out.println("Choix invalide, veuillez réessayer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entre Only Numbers !!!!");
                scanner.nextLine();
            }
        }
    }
}

//        for(int i=0;i<=2;i++){
//            Client.ajouterClient();
//            Client.afficherClient();
//        }
//        Client.RechercheClientById();