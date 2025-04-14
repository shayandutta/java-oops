package oops.class1;

class Start
{
    public static void main(String args[]){
        System.out.println("Printing something");

        //ek object create karne ki jarurat par gayi
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        pen1.color = "blue";
        pen1.price = 21.50;

        pen1.model = "3 rupee one";
        pen2.model = "5 rupee one";


        System.out.println(pen1.model);
        System.out.println(pen1.color);
        System.out.println(pen1.price);

        System.out.println(pen2.model);
        System.out.println(pen2.color);
        System.out.println(pen2.price);

        pen1.write();
        pen2.write();
    }
}
