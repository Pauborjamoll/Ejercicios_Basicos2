import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Escribe un codigo ascii");

        int a = Integer.parseInt(data);
        char b = (char)(a);
        System.out.println(data + " = " + b);
    }

}