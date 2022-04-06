package Vonglap;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập a");
        int a = input.nextInt();
        System.out.println("Nhập b ");
        int b = input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0){
            System.out.println("No greatest common factor");
        }
        while (a!=b){
            if (a>b){
                a=a-b;

            }else b=b-a;
        }
        System.out.println("Greatest common factor :"+a );


    }
}
