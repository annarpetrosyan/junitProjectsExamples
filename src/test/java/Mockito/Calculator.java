package Mockito;

public class Calculator {
    private MathService mathService;

    public Calculator(MathService mathService) {
        this.mathService = mathService;
    }

    public int addAndMultiply(int a, int b, int c) {
        int sum = mathService.add(a, b);
        return mathService.multiply(sum, c);
    }
}
