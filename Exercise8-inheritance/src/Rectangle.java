public class Rectangle extends Shape{
    private double width =1;
    private double length=1;

    Rectangle(){

    }

    Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }


    Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.length=length;
        this.width=width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public double getArea(){
        return getLength() * getWidth();
    }

    public double getPerimeter(){
        return 2 *(getLength()+getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "Area = "+ getArea()+
                "Perimeter = "+getPerimeter()+
                '}';
    }
}
