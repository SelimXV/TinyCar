import java.util.Scanner;

public class TinyCar5q1 {

  public static void afficherAccessoire(String nom, double prixHT){
    System.out.println("L'accessoire " + nom + " coûte " + prixHT + "€ HT.");
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Taille du panier : ");
    int taillePanier = scanner.nextInt();

    String[] noms = new String[taillePanier];
    double[] prix = new double[taillePanier];

    for(int i=0; i<taillePanier; i++) {

      System.out.print("Nom de l'accessoire : ");
      noms[i] = scanner.next();

      System.out.print("Prix HT : "); 
      prix[i] = scanner.nextDouble();

    }

    for(int i=0; i<taillePanier; i++) {
      afficherAccessoire(noms[i], prix[i]);
    }

    double total = 0;
    for(int i=0; i<taillePanier; i++) {
      total += prix[i];
    }

    System.out.println("Total : " + total);

    double min = prix[0];
    double max = prix[0];
    double moyenne = total/taillePanier;

    for(int i=1; i<taillePanier; i++) {
      if(prix[i] < min) {
        min = prix[i]; 
      }
      if(prix[i] > max) {
        max = prix[i];
      }
    }

    System.out.println("Prix minimum: " + min);
    System.out.println("Accessoire le moins cher: " + noms[indexOfMin(prix, min)]);

    System.out.println("Prix maximum: " + max);
    System.out.println("Accessoire le plus cher: " + noms[indexOfMax(prix, max)]);

    System.out.println("Prix moyen: " + moyenne);

  }

  public static int indexOfMin(double[] array, double min) {
    for(int i=0; i<array.length; i++) {
      if(array[i] == min) {
        return i;
      }
    }
    return -1;
  }

  public static int indexOfMax(double[] array, double max) {
    for(int i=0; i<array.length; i++) {
      if(array[i] == max) {
        return i;
      }
    }
    return -1;
  }

}
