public class Exercice4 {
    public static void main(String[]args){
        String chaine = "ceci est une chaine ;";

        if (chaine.endsWith("."))
            System.out.println("la chaine se termine par un point");
        else if (chaine.endsWith(";"))
            System.out.println("la chaine se termine par un point virgule");
        else
            System.out.println("Cette chaine ne se finit ni par point ni par point-virule");
    }
}
