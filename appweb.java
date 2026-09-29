import java.util.Scanner;

public class appweb {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cin;
        String nom;
        String prenom;
        String numeroCompte;
        double solde;
        final double PLAFOND_RETRAIT = 500.00;

        System.out.print("Veuillez saisir le CIN : ");
        cin = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Veuillez saisir le nom : ");
        nom = scanner.nextLine();

        System.out.print("Veuillez saisir le prenom : ");
        prenom = scanner.nextLine();

        System.out.print("Entrez le numero du compte : ");
        numeroCompte = scanner.nextLine();

        System.out.print("Entrez le solde initial (TND) : ");
        solde = scanner.nextDouble();

        int choix = -1;

        while (choix != 0) {

            System.out.println("\n===MENU BANQUE ===");
            System.out.println("1. Consulter le solde");
            System.out.println("2. Effectuer un depot");
            System.out.println("3. Effectuer un retrait");
            System.out.println("4. Quitter");
            System.out.print("Votre choix (1-4) : ");
            choix = scanner.nextInt();
            switch (choix) {

                case 1:
                    System.out.println("\n--- INFORMATIONS DU CLIENT ---");
                    System.out.println("Nom : " + nom);
                    System.out.println("Prenom : " + prenom);
                    System.out.println("CIN : " + cin);
                    System.out.println("Numero du compte : " + numeroCompte);
                    System.out.println("Solde actuel : " + solde + " TND");
                    System.out.println("Plafond maximal de retrait : "
                            + PLAFOND_RETRAIT + " TND");
                    break;

               
                
            }
        }

        scanner.close();
    }
}
