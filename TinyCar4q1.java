public class TinyCar4q1 {

    public static void main(String[] args) {

        String[] nomsAccessoires = new String[5];
        double[] prixHT = new double[5];


        nomsAccessoires[0] = "Casque";
        nomsAccessoires[1] = "Gants";
        nomsAccessoires[2] = "Chaussures";
        nomsAccessoires[3] = "Maillot";
        nomsAccessoires[4] = "Short";

        prixHT[0] = 50;
        prixHT[1] = 30;
        prixHT[2] = 80;
        prixHT[3] = 60;
        prixHT[4] = 40;

        for(int i=0; i<nomsAccessoires.length; i++) {
            System.out.println(nomsAccessoires[i] + " - " + prixHT[i] + " euros");
        }
    }
}

