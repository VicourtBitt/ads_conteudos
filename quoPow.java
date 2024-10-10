import javax.swing.*;
public class quoPow {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
        int quo = num1 / num2;
        int pow = (int) Math.pow(num1, num2);
        JOptionPane.showMessageDialog(null, "O quociente do " + num1 + " e " + num2 + " é " + quo + "\n" + "A potencia de " + num1 + " elevado na " + num2 + " é " + pow);
    }
}
