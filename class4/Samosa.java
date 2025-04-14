package oops.class4;

public class Samosa {

    //properties/attributes/variables -> data members
    //instance variables / non-static variables
    int price;
    String model;
    String color;
    String shape;

    //behaviour/methods -> member methods
    //non-static methods / instance methods
    public void showColor(){
        System.out.println("color is : " + color);
    }

    public int getPrice(){
        System.out.println("Price is : " + price);
        return price;
    }
}
