package OOP;

public class Fan {
    public final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speet = SLOW;
    private boolean on = false;
    public double radius = 5;
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

    public void setSpeet(int speet) {
        this.speet = speet;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString() {
        if (on == true) {
            return "Thong tin quat : " + this.speet + " "+ this.color + this.radius + "Quat bat ";
        } else {
            return "Thong tin quat : " + this.color + this.radius + "Quat bat ";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeet(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeet(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2);


    }
}
