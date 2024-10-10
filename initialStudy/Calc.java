public class Calc {
    
    public static void main(String args[]) {
        int Number;
        double Real, sum;
        String Text;

        Number = Integer.parseInt(args[0]);
        Real = Double.parseDouble(args[1]);
        Text = args[2];

        sum = Number + Real;
        System.out.println("Sum of " + Number + " and " + Real + " is " + sum);
        System.out.println("Text: " + Text);
    }
}
