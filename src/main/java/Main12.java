import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo");
        String longitud= numero.nextLine();
        System.out.println("El número introducido tiene "+longitud.length()+" cifras");
        }
    }
