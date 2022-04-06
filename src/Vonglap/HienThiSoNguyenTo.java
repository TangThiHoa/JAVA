package Vonglap;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        String str = "Là SNT";
        int count = 1;
        int num = 2;
        while (count <= 20) {
            str = "Là SNT";
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    str = "Không phải là SNT ";
                    break;
                }
            }

            if (str.equals("Là SNT")) {
                System.out.println(num);
                count++;
            }
            num++;
        }

    }
}
