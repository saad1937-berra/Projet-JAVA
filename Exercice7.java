import java.util.Scanner;

public class Exercice7 {
    public static void main(String[]args) {
        Scanner entrer = new Scanner(System.in);
        while (true) {
            String calcul = entrer.nextLine();
            int longueur = calcul.length();
            System.out.println(longueur + " caractères");

            if (calcul.equals("exit")) {
                break;
            }
        }
        entrer.close();
    }
}
