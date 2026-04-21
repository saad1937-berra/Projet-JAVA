import java.util.Scanner;

public class Exercice8 {
    public static void main(String[]args){
        Scanner entrer = new Scanner(System.in);

        while (true){
            String saisie = entrer.nextLine();
            int longueur = saisie.length();
            System.out.println(longueur + "caractères");

            if (saisie.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}
