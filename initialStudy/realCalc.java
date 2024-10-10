public class realCalc {

    public int addition(int a, int b) {
        return a + b;
    }

    public int reduce(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String args[]) {
        int Number1;
        int Number2;
        String Operator;

        Number1 = Integer.parseInt(args[0]);
        Number2 = Integer.parseInt(args[1]);
        Operator = args[2];

        realCalc calc = new realCalc();

        switch (Operator) {
            case "+" -> {
                System.out.println("Sum of " + Number1 + " and " + Number2 + " is " + calc.addition(Number1, Number2));
            }
            case "-" -> {
                System.out.println("Difference of " + Number1 + " and " + Number2 + " is " + calc.reduce(Number1, Number2));
            }
            case "*" -> {
                System.out.println("Product of " + Number1 + " and " + Number2 + " is " + calc.multiply(Number1, Number2));
            }
            case "/" -> {
                System.out.println("Division of " + Number1 + " and " + Number2 + " is " + calc.divide(Number1, Number2));
            }
            default -> {
                System.out.println("Invalid operator");
            }
        }
    }
}
