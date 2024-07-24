package practice7;

public class ComplexCalculator implements Calculable<ComplexNumber> {

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber num1Temp = (ComplexNumber) num1;
        ComplexNumber num2Temp = (ComplexNumber) num2;
        ComplexNumber complexNumber = new ComplexNumber(num1Temp.getReal() + num2Temp.getReal(),
                num1Temp.getImaginary() + num2Temp.getImaginary());

        return complexNumber;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getReal() - num2.getReal(), num1.getImaginary() - num2.getImaginary());
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginaryPart = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary())
                / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
