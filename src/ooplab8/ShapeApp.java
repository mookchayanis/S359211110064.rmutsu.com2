package ooplab8;

public class ShapeApp {
    public static void  main (String [] arge){
        Rectangle rectangle = new Rectangle(20,30);

        System.out.println(rectangle.findArea());

        Circle circle = new Circle(15);

        System.out.println(circle.findArea());

    }//main
}//class
