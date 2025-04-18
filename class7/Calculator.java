package oops.class7;

public class Calculator {

    int x;
    int y;

    //Constructor overload

    //non-parameterised constructor
    public Calculator()
    {
        System.out.println("Creating object : non parameterised constructor");
        //default values of x and y, if no value is passed then these values will be taken
        x = 10;
        y = 20;
    }


    public Calculator(int a, int b)
    {
        System.out.println("Creating object : Parameterised constructor");
        x = a;
        y = b;
    }


    //Method overloading

    public void sum(){
        System.out.println("sum : " + (x+y));
    }

    public int sum(int a){
        System.out.println("sum : " + (x+y+a));
        return x+y+a;
    }

    public double sum(int a, int b){
        System.out.println("sum : " + (x+y+a+b));
        return x+y+a+b;
    }
}
