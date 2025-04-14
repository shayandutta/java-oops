package oops.class4;

public class Demo {
    public static void main(String[] args) {
        System.out.println("we are working here");
        //ek samose ki jarurat par gayi (we have to create a samosa)
        //we want object of samosa


        //memory have been allocated to both the objects and default values have been put inside, as we haven't put any value inside it
        Samosa s1 = new Samosa();
        Samosa s2 = new Samosa();

        s1.price = 5;
        s2.price = 10;

        s1.color = "brown";
        s2.color = "white";

        s1.model = "tel samosa";
        s2.model = "dry samosa";

        s1.shape = "triangle";
        s2.shape = "square";


        //since we are returning price inside getPrice() member method so we can store the prices using this method for both s1 and s2 inside price and price1 variables.
        int price = s1.getPrice();
        s1.showColor();

        int price1 = s2.getPrice();
        s2.showColor();

        int total = price + price1;
        System.out.println(total);
    }
}
