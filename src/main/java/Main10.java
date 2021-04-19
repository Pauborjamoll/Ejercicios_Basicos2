import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner dias = new Scanner(System.in);
        System.out.println("Introduce el numero de la semana");
        int dia = dias.nextInt();
        String tipoDia;
        switch (dia) {
            case 1:
                tipoDia = "Laboral";
                break;
            case 2:
                tipoDia = "Laboral";
                break;
            case 3:
                tipoDia = "Laboral";
                break;
            case 4:
                tipoDia = "Laboral";
                break;
            case 5:
                tipoDia = "Laboral";
                break;
            case 6:
                tipoDia = "No laboral";
                break;
            case 7:
                tipoDia = "No laboral";
                break;
            default:
                tipoDia = "Introduce el nombre del dia correctamente";
                break;
        }
        System.out.println("El dia introducido es "+tipoDia);



        }

    }
