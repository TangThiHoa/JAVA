package OOP;

import java.util.Scanner;

public class LopHinhTron {
    double banKinh ;

    public LopHinhTron() {
    }

    public LopHinhTron(double banKinh) {
        this.banKinh = banKinh;

    }

    public double getDt() {
        return this.banKinh*2*Math.PI;
    }

    public double getCv() {
        return this.banKinh*2;
    }
    String display () {
        return "Hinh tron co ban kinh la : " + (int)banKinh + ";  diện tich  "+ getDt() + " chu vi "+ getCv();
    }

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Nhap ban kinh ");
            double bK= sc.nextDouble();


            LopHinhTron hoa = new LopHinhTron(bK);
            System.out.println("Display = "+ hoa.display());





    }
}
