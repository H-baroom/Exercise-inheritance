public class Square extends Rectangle{

    Square(){

    }
    Square(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    Square(double side,String color,boolean filled ){
        super.setLength(side);
        super.setWidth(side);
        setColor(color);
        setFilled(filled);
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide() {
        return super.getLength();
    }


    public String toString() {
        return "Square{" +
                "Area = "+ super.getArea()+
                "Perimeter = "+super.getPerimeter()+
                '}';
    }
}
