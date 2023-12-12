
import java.util.Scanner;

public class TinyCar3q3 {

    public static void main(String[] args) {

        // Déclaration des variables
        double prixHT; // Prix hors taxe
        double tauxTVA; // Taux de TVA (en pourcentage)
        double prixTTC; // Prix tout compris
        String marqueModele; // Marque et modèle du produit
        boolean estElectrique; // Indicateur si le produit est électrique
        int tentative = 0; // Nombre de tentatives
        String codeSecret; // Code secret
        double remise = 0; // Remise (en pourcentage)

        // Création d'un objet Scanner pour la saisie au clavier
        Scanner scanner = new Scanner(System.in);

        // Demande de saisie du code secret
        System.out.print("Entrez le code secret : ");
        codeSecret = scanner.nextLine();

        // Vérification du code secret
        while (!codeSecret.equals("FrebourgGoat") && tentative < 2) {
            System.out.println("Code secret incorrect. Vous avez encore " + (2 - tentative) + " tentative(s).");
            System.out.print("Entrez le code secret : ");
            codeSecret = scanner.nextLine();
            tentative++;
        }

        // Vérification du nombre de tentatives
        if (!codeSecret.equals("FrebourgGoat")) {
            System.out.println("Code secret incorrect. Vous n'êtes pas autorisé à utiliser l'application.");
            scanner.close();
            return; // Arrêt du programme
        }

        // Demande de saisie de la marque et du modèle
        System.out.print("Entrez la marque et le modèle du produit : ");
        marqueModele = scanner.nextLine();

        // Demande de saisie si le produit est électrique
        System.out.print("Le produit est-il électrique ? (oui/non) : ");
        String reponseElectrique = scanner.nextLine();
        estElectrique = reponseElectrique.equalsIgnoreCase("oui");

        // Demande de saisie du prix HT
        System.out.print("Entrez le prix HT du produit : ");
        prixHT = scanner.nextDouble();

        // Vérification si le produit est électrique pour déterminer le taux de TVA
        if (estElectrique) {
            tauxTVA = 5;
        } else {
            tauxTVA = 20;
        }

        // Calcul du prix TTC
        prixTTC = prixHT * (1 + tauxTVA/100);

        // Vérification de la remise
        if (prixTTC > 20000) {
            remise = 10;
            prixTTC = prixTTC * (1 - remise/100);
        }

        // Affichage du résultat
        System.out.println("Le prix TTC à payer pour le produit " + marqueModele + " est de " + prixTTC + " euros");

        // Fermeture du scanner
        scanner.close();
    }
}
