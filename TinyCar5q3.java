import java.util.Scanner;

public class TinyCar5q3 {

  public static double calculPrixTTC(double prixHT){
    double tva = 1.2;
    return prixHT * tva;
  }

  public static void afficherTableaux(String[] noms, double[] prixHT, double[] prixTTC){
    for(int i=0; i<noms.length; i++){
      System.out.println(noms[i] + ", " + prixHT[i] + ", " + prixTTC[i]);
    }
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Taille du panier : ");
    int taillePanier = scanner.nextInt();

    String[] noms = new String[taillePanier];
    double[] prix = new double[taillePanier];
    double[] prixTTC = new double[taillePanier];

    // Remplissage des tableaux

    afficherTableaux(noms, prix, prixTTC);

    // Calcul du total, min, max, moyenne

  }

}
