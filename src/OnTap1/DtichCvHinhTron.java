package OnTap1;

import java.util.Scanner;

public class DtichCvHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh : ");
        float r = sc.nextFloat();

        System.out.println("Dien tich la : "+ r*r*Math.PI + " " + "m2");
        System.out.println("Chu vi la : "+ r*r + " " + "m");

    }
}
