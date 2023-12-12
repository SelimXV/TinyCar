import java.util.Scanner;

public class TinyCar2q1 {

    public static void main(String[] args) {

        // Déclaration des variables
        double prixHT; // Prix hors taxe
        double tauxTVA = 20; // Taux de TVA par défaut (en pourcentage)
        double prixTTC; // Prix tout compris
        String marqueModele; // Marque et modèle du produit
        double remise = 0; // Remise (en pourcentage)

        // Création d'un objet Scanner pour la saisie au clavier
        Scanner scanner = new Scanner(System.in);

        // Demande de saisie de la marque et du modèle
        System.out.print("Entrez la marque et le modèle du produit : ");
        marqueModele = scanner.nextLine();

        // Demande de saisie du prix HT
        System.out.print("Entrez le prix HT du produit : ");
        prixHT = scanner.nextDouble();

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
