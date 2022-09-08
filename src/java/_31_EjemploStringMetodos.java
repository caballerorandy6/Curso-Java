package src.java;

public class _31_EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length()); //Longitud del String
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //Convierte a Mayuscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); //Convierte a Minuscula
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres")); //Comparando Strings por valor
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres")); //Comparando String por valor ignorando las mayusculas y minusculas
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("Andres")); //Ordenando lexicografico. Si el resultado es 0 es pq son iguales.
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron")); //
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //Obtener caracter
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring() = " + nombre.substring(1)); //Obtener parte de un String
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(4, 6) = " + nombre.substring(4, 6));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length() - 1));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length() - 2));
    }
}
