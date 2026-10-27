import static java.util.Collections.replaceAll;

public class Main {
    public static boolean Palindromo (String texto) {
        texto = texto.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").replace(" ", "");

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--){
            invertido = invertido + texto.charAt(i);
        }
        return texto.equals(invertido);
    }
    public static void main (String[] args){

        System.out.println(Palindromo("¡A ti no, bonita!"));
    }
}

///*
// * Escribe una función que reciba un texto y retorne verdadero o
// * falso (Boolean) según sean o no palíndromos.
// * Un Palíndromo es una palabra o expresión que es igual si se lee
//  * de izquierda a derecha que de derecha a izquierda.
// * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
// * Ejemplo: Ana lleva al oso la avellana.
// */
