public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    //Method with intentional error.
    public int multiply(int a, int b) {
        if (a > 99) {
            throw new IllegalArgumentException("Variable \"a\" should be less than 100");
        }
        return a / b;
    }

    public int calculateAreaOfCircle(int r){
        int area = (int) (Math.PI * r * r);
        return area;
    }

    public double convertToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be 0");
        }
        return (double)numerator / (double)denominator;
    }
}
