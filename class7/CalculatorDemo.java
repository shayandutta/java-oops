package oops.class7;

public class CalculatorDemo {
    public static void main(String[] args) {
        //making objects out of overloaded constructors
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(200, 100);


        c1.sum();
        int result = c1.sum(4);
        c1.sum(5,6);
        System.out.println(result);

        c2.sum();
        c2.sum(10);
        c2.sum(10,20);
    }
}
