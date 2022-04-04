import java.util.Scanner;

public class chiso_cannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight , height , bmi ;
        System.out.println("Nhập chiều cao :");
        height = scanner.nextDouble();

        System.out.println("Nhập cân nặng :");
        weight = scanner.nextDouble();
        bmi= weight/Math.pow(height,2);
        System.out.println( "bmi = " +bmi);

        if (bmi<18){
            System.out.println("gầy quá ta , ăn nhiều vào");
        }else if (bmi<25.0) {
            System.out.println("Xịn quá ta");
        }else if ( bmi<30.0){
            System.out.println("Bếu quá , ăn ít thui ");
        }



    }
}
