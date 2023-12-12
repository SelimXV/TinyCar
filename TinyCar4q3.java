import java.util.Scanner;

public class TinyCar4q3 {

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


        double total = 0;
        for(int i=0; i<taillePanier; i++) {
            System.out.println(noms[i] + " - " + prix[i]);
            total += prix[i];
        }

        System.out.println("Total : " + total);

    }

}

