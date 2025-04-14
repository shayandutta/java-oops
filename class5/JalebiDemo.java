package oops.class5;

public class JalebiDemo {
    public static void main(String[] args) {

        //new Jalebi(); //even if no reference variable exists, still on running the main method, the constructor gets invoked automatically
        Jalebi j1 = new Jalebi(500, "Green Jalebi");
//        j1.price = 5;
//        j1.name = "Green Jalebi";j1.showPrice(); //method ko call karna parta hai, but constructor automatically call hota hai


        Jalebi j2 = new Jalebi(1000, "Red Jalebi");
//        j2.price = 10;
//        j2.name = "Red Jalebi";
//        j2.showPrice();


    }
}
