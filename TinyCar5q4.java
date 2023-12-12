import java.util.Scanner;

public class TinyCar5q4 {



  public static double moyennePrix(double[] prix){
    double total = 0;
    for(int i = 0; i < prix.length; i++) {
      total += prix[i];
    }
    return total / prix.length;
  }

  public static double prixMin(double[] prix){
    double min = prix[0];
    for(int i = 1; i < prix.length; i++) {
      if(prix[i] < min) {
        min = prix[i];
      }
    }
    return min;
  }

  public static double prixMax(double[] prix){
    double max = prix[0];
    for(int i = 1; i < prix.length; i++) {
      if(prix[i] > max) {
        max = prix[i];
      }
    }
    return max;
  }


  public static void main(String[] args) {



    double moy = moyennePrix(prix);
    double min = prixMin(prix);
    double max = prixMax(prix);


  }

}
