package practice7;

public class LoggedComplexCalculator extends ComplexCalculator {
    private final Loggable logger;
    private final Calculable<ComplexNumber> calculable;

    public LoggedComplexCalculator(Loggable logger, Calculable<ComplexNumber> calculable) {
        this.logger = logger;
        this.calculable = calculable;
    }

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        logger.log(String.format("Add (%s) to (%s)", num1, num2));
        return calculable.add(num1, num2);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        logger.log(String.format("Divide (%s) by (%s)", num1, num2));
        return calculable.divide(num1, num2);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        logger.log(String.format("Multiply (%s) by (%s)", num1, num2));
        return calculable.multiply(num1, num2);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        logger.log(String.format("Subtract (%s) by (%s)", num2, num1));
        return calculable.subtract(num1, num2);
    }

}
