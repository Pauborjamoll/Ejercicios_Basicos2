import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        String contraseña= "12345678";
        int intentos= 3;
        String comparar;
        for (int i = 1; i < intentos; i++) {

            Scanner contra = new Scanner(System.in);
            System.out.println("Introduce la contraseña");
            comparar = contra.nextLine();
            if (comparar.equals(contraseña)){
                System.out.println("Correcto ,enhorabuena");
                break;
            }
            else {

                System.out.println("Contraseña incorrecta, intentos restantes: "+(intentos-i));
            }

        }}}


