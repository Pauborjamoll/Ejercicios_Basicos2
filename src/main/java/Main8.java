import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        int prueba=-1;
        do {
            Scanner numero = new Scanner(System.in);
            System.out.println("Introduce un número");
            prueba= numero.nextInt();
        }
        while (prueba<0);
        System.out.println(prueba);
    }
}
