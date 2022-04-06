package mang_phuongthuc;

import java.util.Scanner;

public class DaoNguoc_PhanTu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]a={10,20,30,50,60};
        int []moi= new int[a.length];
        for (int i=0;i< a.length;i++){
            int tg=moi[i];
            moi[i]= a[a.length-1-i];
            a[a.length-1]=tg;
        }
        for (int i=0;i< a.length;i++) {
            System.out.print(moi[i] + "\t");
        }

    }

}
