package src.java;

public class _27_EjemploStringConcatenacion {
    public static void main(String[] args) {
     String curso = "Programacion Java";
     String profesor = "Andres Guzman";

     String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        //concatenando String con numeros
        System.out.println(detalle + " " + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + " " + detalle);

        String detalle2 = curso.concat(" con ").concat(profesor);
        //detalle2 = curso.concat(" ".concat(profesor)); Tambien se puede hacer asi
        System.out.println(detalle2);
    }
}
