package src.java;

public class _25_CompararString {
    public static void main(String[] args) {

        String str1 = "Hola Andres";
        String str2 = new String("Hola Andres");

        //Chequea si son el mismo objeto
        System.out.println("Son el mismo Objeto " + (str1 == str2)); //False pq mo son el mismo objeto

        //Cheque si son el mismo valor
        System.out.println("Tienen el mismo valor " + str1.equals(str2)); //True pq tienen el mismo valor

    }
}
