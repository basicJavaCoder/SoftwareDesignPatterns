package MyCalculator;

class Calculator {
    private final ICalc calc;

    public Calculator(ICalc calc) {

        this.calc = calc;

    }

    public int calculate(int num1, int num2) {

        return calc.op(num1,num2);

    }

}



