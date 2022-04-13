package AbstracClassVaInterface.Interface.KeThua;

public class HinhTron {
    public double radius ;
    public String Color ;
    public HinhTron (){
    }
    public HinhTron(double radius, String color) {
        this.radius = radius;
        Color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "radius=" + radius +
                ", Color='" + Color + '\'' +
                '}';
    }
}
class HinhTru extends HinhTron {
    private double hight ;
    public HinhTru (){
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight  ) {
        this.hight = hight;
    }
    public double TheTich (){
        return Math.PI * radius * radius * hight ;
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "radius=" + radius +
                ", Color='" + Color + '\'' +
                ", hight=" + hight +
                '}';
    }

}
 class Hi {
     public static void main(String[] args) {
         HinhTron ki = new HinhTron();
         System.out.println(ki);
         ki = new HinhTron(12,"red");
         System.out.println(ki.getRadius());

     }


 }

