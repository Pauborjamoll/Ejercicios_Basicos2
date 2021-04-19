import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe el precio");
        double precio = teclado.nextDouble();
        double iva = (precio*0.21);
        System.out.println("El precio total es:"+(precio+iva));
    }

}