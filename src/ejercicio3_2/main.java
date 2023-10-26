package ejercicio3_2;

public class main {
    public static void main(String args[]) {
        cadena cadena = new cadena(15);
        int longitud = cadena.cadenaInicial.length();
        System.out.println("La longitud del String es = " + longitud);

        String cadenaSinEspacios = cadena.cadenaInicial.trim();
        System.out.println("El String sin espacios en blanco = " + cadenaSinEspacios);

        String cadenaMayuscula = cadenaSinEspacios.toUpperCase();
        System.out.println("El String en mayúscula = " + cadenaMayuscula);

        String cadenaConcatenada = cadenaMayuscula.concat("12345");
        System.out.println("El String concatenado = " + cadenaConcatenada);

        String cadenaExtraida = cadenaConcatenada.substring(24,31);
        System.out.println("El String extraído = " + cadenaExtraida);

        String cadenaReemplazada = cadenaExtraida.replace("O","X");
        System.out.println("El String reemplazado = " + cadenaReemplazada);

        boolean comparacion = cadenaReemplazada.equals("Programación");
        System.out.println("Los String son iguales = " + comparacion);
    }
}

