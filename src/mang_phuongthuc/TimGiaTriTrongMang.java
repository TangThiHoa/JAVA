package mang_phuongthuc;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] hocSinh={"hoa", "huong","hung","huy"};
        System.out.println("Nhập tên");
        String name=sc.nextLine();
        boolean check =false;
        for (int i = 0; i< hocSinh.length ; i++){
            if (hocSinh[i].equals(name)) {
                check=true;
                System.out.println(" nằm ở vị trí"+ " " + i);
                break;
            }


        }
        if ( !check) {
            System.out.println("không tìm thấy");
        }

    }
}
