import java.util.Scanner;

public class hienthi_20so_nguyento {
    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập num");
        num= scanner.nextInt();
        int N=2;
        String text = " ";
        while (count < num ) {
            if (N == 2) {
                text = text + " " + N;
                N++;
                count++;
            } else {
                int a = 0;
                for (int i = 2; i < N; i++) {
                    if (N%i == 0) {
                        a++;
                        N++;
                        break;
                    }
                }
                if (a == 0) {
                    text = text + " " + N;
                    N++;
                    count++;
                }
            }
        }
        System.out.println("số nguyên tố"+ text);




    }
}
