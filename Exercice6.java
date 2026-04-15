public class Exercice6 {
    public static void main(String[]args){
        String chaine = "BONJOUR MONSIEUR. ";

        if (!chaine.equals(chaine.toUpperCase())) {
            System.out.println(chaine.toUpperCase());
        } else {
            System.out.println("La chaîne ne contient aucune minuscule.");
        }
    }
}
