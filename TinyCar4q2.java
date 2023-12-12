import java.util.Scanner;
public class TinyCar4q2 {

    public static void main(String[] args) {


        String[] nomsAccessoires = {"Casque", "Gants", "Chaussures", "Maillot", "Short"};


        double[] prixHT = new double[5];


        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<nomsAccessoires.length; i++) {
            System.out.print("Prix HT du " + nomsAccessoires[i] + " ? ");
            prixHT[i] = scanner.nextDouble();
        }


        for(int i=0; i<nomsAccessoires.length; i++) {
            System.out.println(nomsAccessoires[i] + " - " + prixHT[i] + " euros");
        }


    }
}

