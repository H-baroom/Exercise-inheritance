//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape shape=new Shape("red",true);
        System.out.println(shape.isFilled());
        System.out.println(shape.getColor());
        shape.toString();
        System.out.println("##&&**************************************************&&##");
        Rectangle rectangle = new Rectangle(5,10,"green",false);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.isFilled());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println("##&&**************************************************&&##");
        Square square =new Square(7,"yellow",true);
        System.out.println(square.getSide());
        System.out.println(square.getWidth());
        System.out.println(square.getLength());
        System.out.println(square.isFilled());
        System.out.println(square.getColor());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println("##&&**************************************************&&##");
        Circle circle =new Circle(3,"blue",true);
        System.out.println(circle.getRadius());
        System.out.println(circle.isFilled());
        System.out.println(circle.getColor());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

    }
}