package mang_phuongthuc;

import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={12,13,68,90};
        int max =a[0];
        for (int i =0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);


    }
}
