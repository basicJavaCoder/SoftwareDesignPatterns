package MyCalculator;

class Percentage implements ICalc {

    @Override
    public int op(int num1, int num2) {

        return (100 * num1) / num2;

    }

}
