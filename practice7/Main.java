package practice7;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ConsoleLogger logger = new ConsoleLogger();
        ComplexCalculator calculator = new ComplexCalculator();
        LoggedComplexCalculator loggedCalculator = new LoggedComplexCalculator(logger, calculator);

        ComplexNumber num1 = new ComplexNumber(4, 5);
        ComplexNumber num2 = new ComplexNumber(3, -2);

        ComplexNumber addition = loggedCalculator.add(num1, num2);
        System.out.printf("(%s) + (%s) = %s\n\n", num1, num2, addition);

        ComplexNumber subtraction = loggedCalculator.subtract(num1, num2);
        System.out.printf("(%s) - (%s) = %s\n\n", num1, num2, subtraction);

        ComplexNumber multiplication = loggedCalculator.multiply(num1, num2);
        System.out.printf("(%s) * (%s) = %s\n\n", num1, num2, multiplication);

        ComplexNumber division = loggedCalculator.divide(num1, num2);
        System.out.printf("(%s) \\ (%s) = %s\n\n", num1, num2, division);

    }
}