package java_Tongquat;

import java.util.Scanner;

public class PtBacNhat {
    public static void main(String[] args) {
        double a ;
        double b ;
        double c ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        a = scanner.nextDouble();
        System.out.println("nhap b");
        b = scanner.nextDouble();
        System.out.println("nhap c");
        c = scanner.nextDouble();
        double nghiem;
        if (a!=0) {
            nghiem = (c-b)/a;
            System.out.println(nghiem);
        }else {
            if (b==c) {
                System.out.println("phương trình vs nghiệm");
            }else {
                System.out.println("Vô nghiệm");
            }

        }


    }
}
