import java.util.Scanner;

public class dientich_hcn {
    public static void main(String[] args) {
        int cd ;
        int cr ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài :");
        cd = scanner.nextInt();
        System.out.println("Nhập chiều rộng ");
        cr = scanner.nextInt();
        System.out.println( "Diện tích : "+ (cd*cr));

    }
}
