public class Exercice2 {
    public static void main (String[] args){
        String chaine = "ceci est une chaine de caractère qui permet de changer les e en u et les i en u";
        String chan1 = chaine.replace('e','u');
        String resultat = chan1.replace('i','u');

        System.out.println(resultat);
    }
}
