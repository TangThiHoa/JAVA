package OOP;

public class Fan {
    public final int SLOW = 1 , MEDIUM= 2  ,  FAST = 3 ;
    private int speet = SLOW ;
    private boolean on = false;
    public double radius = 5 ;
    public String color = "blue ";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeet() {
        return speet;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

//    public static void main(String[] args) {
//
//    }
}
