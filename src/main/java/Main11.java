import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1= numero1.nextInt();

        Scanner numero2 = new Scanner(System.in);
        System.out.println("Introduce un número más grande");
        int num2= numero2.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println( (int)(Math.random() * (num2-1 - num1)) + (num1+1));

        }
    }
}
