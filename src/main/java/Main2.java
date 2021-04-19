import javax.swing.JOptionPane;

public class Main2 {

    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Introduce un carácter");

        for (int i = 0; i < data.length(); i++){
            int a = data.charAt(i);
            System.out.println(data + " = " + a);
        }
    }

}