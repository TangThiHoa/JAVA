package mang_phuongthuc;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
//        System.out.print("Nhap do F: ");
//        double doF = scanner.nextDouble();
//        double doC = (5.0 / 9) * (doF - 32);
//        System.out.print("Do C: "+ doC);
//        System.out.println("Nhap do C :");
//        double doC = scanner.nextDouble();
//        double doF = (5.0 / 9) * (doC + 32);
//        System.out.println("Do F :"+ doF);
        System.out.println("Nhap do F : ");
        double doF= scanner.nextDouble();
        double doC= (5.0 / 9) * (doF - 32);
        System.out.println("DoC"+ doC);
        }
    }
