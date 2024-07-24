package practice7;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        String formattedReal = String.format("%.2f", real);
        String formattedImaginary = String.format("%.2f", imaginary);

        if (imaginary >= 0) {
            return formattedReal + " + " + formattedImaginary + "i";
        } else {
            return formattedReal + " - " + String.format("%.2f", -imaginary) + "i";
        }
    }

}
