package AbstracClassVaInterface.KeThua;

public class Shape {

    public String color = "green";
    public boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }


    }

class Hoa {
    public  static  void main (String[] args){
        Shape hi = new Shape();
        System.out.println(hi);
        hi= new Shape(" blue ", false );
        System.out.println(hi);
    }

}


     class Circle extends Shape {
     private  double radius = 1.0 ;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

         public double getRadius() {
             return radius;
         }

         public void setRadius(double radius) {
             this.radius = radius;

         }
         public double getArea (){
        return  radius *radius* Math.PI ;

    }
    public  double getPrimater (){
        return 2 * radius*Math.PI;
    }

         @Override
         public String toString() {
             return "Circle{" +
                     "radius=" + radius +
                     '}';
         }
     }
     class Hu {
         public static void main(String[] args) {
             Shape Bi = new Shape();
             System.out.println(Bi);
             Bi = new Shape("red",true );
             System.out.println(Bi);
         }
     }
     class Rectangle extends Shape {
    private double width = 1.0 ;
    private double length = 1.0  ;
    public Rectangle (){

    }

         public Rectangle(double width, double length) {
             this.width = width;
             this.length = length;
         }

         public Rectangle(double side, double v, String color, boolean filled){
       }

         public double getWidth() {
             return width;
         }

         public void setWidth(double width) {
             this.width = width;
         }

         public double getLength() {
             return length;
         }

         public void setLength(double length) {
             this.length = length;
         }
         public double getArea (){
           return  length*width ;


         }
         public double getPerimeter (){
           return (length+width)*2 ;
         }

         @Override
         public String toString() {
             return "Rectangle{" +
                     "width=" + width +
                     ", length=" + length +
                     '}';
         }
     }class test {
    public static void main(String[] args) {
        Shape ki = new Shape();
        System.out.println(ki);
        ki = new Shape("yello ", true);
        System.out.println(ki);
    }

    class Square extends Rectangle {
private double side ;
        public Square() {
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public double getSide() {
            return getWidth();
        }

        public void setSide(double side) {
            setWidth(side);
            setLength(side);
        }

        @Override
        public void setWidth(double width) {
            setSide(width);
        }

        @Override
        public void setLength(double length) {
            setSide(length);
        }

        @Override
        public String toString() {
            return "A Square with side="
                    + getSide()
                    + ", which is a subclass of "
                    + super.toString();
        }
    }

    }





