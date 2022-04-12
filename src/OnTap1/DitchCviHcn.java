package OnTap1;

import java.util.Scanner;

public class DitchCviHcn {
    public DitchCviHcn() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        float a = sc.nextFloat();
        System.out.println("Nhap b : ");
        float b = sc.nextFloat();
        System.out.println("Dien Tich la : "+ (a*b));
        System.out.println(" Chu vi la : " + (a+b)*2);


    }
}
