package Circle;

public class Circle {
    private double radius;
    public Circle(){
        this.radius = 0;
    } 
    public void setRadius(double value){
        this.radius = value;
    }
    public double getArea(){
        double area = 3.1415 * (this.radius*this.radius);
        return  area;
    }
    public double getCircumference(){
        double circum = 2 * 3.1415 * this.radius;
        return circum;
    }


}
