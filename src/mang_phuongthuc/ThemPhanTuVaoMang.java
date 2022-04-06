package mang_phuongthuc;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < mang.length; i++) {
            System.out.println(" nhập phần tử thứ " + i + " của mảng");
            mang[i] = scanner.nextInt();
        }
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i] + "\t");
        }
        System.out.println("Nhập vị trí cần chèn");
        int viTri = scanner.nextInt();
        System.out.println("Nhập giá trị chèn");
        int giTri = scanner.nextInt();
        int[] mangMoi = new int[n - 1];

        for (int i = 0; i < viTri; i++) {
            mangMoi[i] = mang[i];
        }
        mangMoi[viTri] = giTri;
        for (int i = viTri ; i < mang.length; i++) {
            mangMoi[i] = mang[i+1];

        }
        for (int i = 0; i < mangMoi.length; i++) {
            System.out.println(mangMoi[i]);
        }


    }
}
