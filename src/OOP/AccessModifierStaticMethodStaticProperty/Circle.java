package OOP.AccessModifierStaticMethodStaticProperty;

public class Circle {

    private double radius = 1.0;
    private String color = "red";


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAre (){
        return Math.PI*1.0;

    }
}
class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        circle.getRadius();
        System.out.println(circle.getRadius());
        circle.getAre();
        System.out.println(circle.getAre());
    }
}


