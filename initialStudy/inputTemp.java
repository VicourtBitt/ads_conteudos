// The import statement works similiar to Python's import statement or JavaScript's
// import statement. It allows you to import classes from other packages. In this case,
// everything in Java is a class. ".*" means import everything from the package.
import javax.swing.*;

public class inputTemp {
    
    public static void main(String args[]) {
        int n1, n2;
        double r1, r2, sum;

        // JOptionPane.showInputDialog() is a command that will display a dialog box
        // that the user can input data into. The data is then stored in the variable
        // Works similiar as Python input() function, it even returns a string, so, you'll
        // need to convert it to the desired type.
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another integer"));


        // parseInt is a method that converts a string to an integer
        // parseDouble is a method that converts a string to a double (float similar)
        r1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a real number"));
        r2 = Double.parseDouble(JOptionPane.showInputDialog("Enter another real number"));

        sum = n1 + r1;
        System.out.println("Sum of " + n1 + " and " + r1 + " is " + sum);

        sum = n2 + r2;
        System.out.println("Sum of " + n2 + " and " + r2 + " is " + sum);
    }
}
