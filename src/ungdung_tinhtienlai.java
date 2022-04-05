import java.util.Scanner;

public class ungdung_tinhtienlai {
    public static void main(String[] args) {
        double gui;
        int thang=1;
        double lai=1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap tien gui ");
        gui = input.nextDouble();
        System.out.println("Nhap thang ");
        thang=input.nextInt();
        System.out.println("Nhap lai suat");
        lai=input.nextDouble();

        double laisuat =0;
        for (int i =0;i<thang;i++){
            laisuat+= gui*(lai/100)/12*thang;
        }
        System.out.println( "Lãi suất là : "+ laisuat );

    }
}
