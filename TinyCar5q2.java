import java.util.Scanner;

public class TinyCar5q2 {

  public static double calculPrixTTC(double prixHT){
    double tva = 1.2;
    return prixHT * tva;
  }

  public static void afficherAccessoire(String nom, double prixTTC){
    System.out.println("L'accessoire " + nom + " coûte " + prixTTC + "€ TTC.");
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Taille du panier : ");
    int taillePanier = scanner.nextInt();

    String[] noms = new String[taillePanier];
    double[] prix = new double[taillePanier]; 
    double[] prixTTC = new double[taillePanier];

    for(int i=0; i<taillePanier; i++) {

      System.out.print("Nom de l'accessoire : ");
      noms[i] = scanner.next();

      System.out.print("Prix HT : ");
      prix[i] = scanner.nextDouble();

    }

    for(int i=0; i<taillePanier; i++) {
      prixTTC[i] = calculPrixTTC(prix[i]);
    }

    for(int i=0; i<taillePanier; i++) {
      afficherAccessoire(noms[i], prixTTC[i]);
    }

    double totalTTC = 0;
    for(int i=0; i<taillePanier; i++) {
      totalTTC += prixTTC[i];
    }

    System.out.println("Total TTC : " + totalTTC);

  }

}
