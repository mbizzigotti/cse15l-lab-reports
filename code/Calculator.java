import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");

/*
            if (tokens.length == 3) {
                int operand1 = Integer.parseInt(tokens[0]);
                String operator = tokens[1];
                int operand2 = Integer.parseInt(tokens[2]);

                int result = performOperation(operand1, operator, operand2);
                System.out.println(result);
            } else {
                System.out.println("Invalid input format");
            }
*/
            if (tokens.length == 3 || (tokens.length == 2 && tokens[1].equals("sqrt"))) {
                int operand1 = Integer.parseInt(tokens[0]);
                String operator = tokens[1];
                int operand2 = tokens.length == 3 ? Integer.parseInt(tokens[2]) : 0;

                double result = performOperation(operand1, operator, operand2);
                System.out.println(result);
            } else {
                System.out.println("Invalid input format");
            }
        }
    }

    private static int performOperation(int operand1, String operator, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "sqrt":
                return (int) Math.sqrt(operand1);
/*
            case "sqrt":
                if (operand2 >= 0) {
                    return (int) Math.sqrt(operand2);
                } else {
                    System.out.println("Error: Cannot calculate square root of a negative number");
                    return 0;
                }
*/
            default:
                return 0;
        }
    }
}
