package OOP;

import java.util.Scanner;

public class LopChuNhat {
    static double height;
    static double width ;
    public LopChuNhat () {
    }
    public LopChuNhat (double height , double width) {
        this.height = height;
        this.width = width;
    }
    public double getDt () {
        return this.height * this.width;
    }
    public double getCv() {
        return (this.height + this.width) * 2;
    }
    public String display() {
        return " hinh chu nhat : chieu dai " + height + " ;chieu rong " + width +" cv la: "+getCv() + "dt la : " + getDt();
    }
    public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        double cd = scanner.nextDouble();
        System.out.println("Nhap chieu rong");
        double cr = scanner.nextDouble();

        LopChuNhat hoa = new LopChuNhat(cd,cr);
        System.out.println("Display = "+hoa.display());




    }
}
