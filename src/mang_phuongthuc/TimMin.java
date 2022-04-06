package mang_phuongthuc;

import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int a []={12,13,68,90};
//        int min =a[0];
//        for (int i =0;i<a.length;i++){
//            if (a[i]< min){
//                min=a[i];
//            }
//        }
//        System.out.println(min);
//        int a []={4,76,84,79};
//        int max = a[0];
//        for (int i = 0;i< a.length;i++){
//            if (a[i]>max)
//                max = a[i];
//        }
//        Scanner scanner= new Scanner(System.in);
//        int []a = {13,24,54,36};
//        int min = a [3];
//        for (int i=0;i<a.length;i++){
//            if (a[i]<min){
//                min=a[i];
//            }
//        }
//        System.out.println("min la:"+ min);

//        int [] a={12,13,45,67};
//        int min = a[1];
//        for (int i= 0;i< a.length;i++) {
//            if (a[i] < min) {
//                min = a[i];
//            }
//        }
//        System.out.println(min);
        int [] a={100,68,86,29,79};
        System.out.println(timMin(a));
    }
    static int timMin(int[] arr) {
        int min = arr[1];
        for (int i = 0 ; i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
