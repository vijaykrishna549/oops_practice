package calculator;

public class AdvCalculator implements Calc{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return b - a;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return b / a;
    }
}
