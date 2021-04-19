import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner nproducto= new Scanner(System.in);
        System.out.println("¿Cuantos productos vendidos hay?");

        int cantidad = nproducto.nextInt();
        int suma=0;
        int [] Array = new int[cantidad];


        for (int i=0; i < cantidad; i++) {
            Scanner vproducto= new Scanner(System.in);
            System.out.println("Valor del producto número "+(i+1));
            Array[i] = vproducto.nextInt();
            suma+=Array[i];

        }
        System.out.println("Precio de todos los prductos: "+suma);
    }
}

