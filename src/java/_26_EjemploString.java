package src.java;

public class _26_EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        // En Java ningun objeto es igual (comparando referencias) false
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        // Los valores de los objetos si pueden ser iguales (comparando valor) true
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        /*esIgual = curso.equalsIgnoreCase(curso2); Este metodo ignora las mayusculas y minusculas
        System.out.println(esIgual);*/

        //Cuando se crean dos objetos de tipo String de forma literal, Java para optimizar asigna el valor del primer objeto al otro
        // Por eso cuando se comparan dos objetos por referencia creados de forma literal el resultado es true
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
