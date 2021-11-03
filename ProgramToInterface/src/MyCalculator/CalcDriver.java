package MyCalculator;

public class CalcDriver {

 public static void main(String[] args) {

  Multiply mult = new Multiply();
  System.out.println("Multiplication: " + mult.op(4, 6));

  Remainder remain = new Remainder();
  System.out.println("Remainder: " + remain.op(24, 7));

  Divide newDivide = new Divide();
  System.out.println("Division: " + newDivide.op(666, 3));

  Subtract newSub = new Subtract();
  System.out.println("Subtraction: " + newSub.op(333, 100));

  Add newAdd = new Add();
  System.out.println("Addition: " + newAdd.op(66, 88));

  Percentage newPerc = new Percentage();
  System.out.println("Percentage: " + newPerc.op(3, 9) + "%");

 }

}
