package OOP.AccessModifierStaticMethodStaticProperty;

public class Student {
    //    sử dụng phương thức Static Method
    private int Mssv;
    private String name;
    private String que;
    private static String truong = "HUAF";

    public Student() {
    }

    public Student(int mssv, String name, String que) {
        Mssv = mssv;
        this.name = name;
        this.que = que;
    }

    static void change() {
        truong = " codegym";
    }

    void HienThi() {
        System.out.println(Mssv + " " + name + " " + que + " " + truong);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(123, "Đoàn Thị Hường ", "Hà Tĩnh" ) ;
        s1.HienThi();
        Student s2 = new Student(133, " Tăng Thị Hoa", "Nghệ An");
        s2.HienThi();
        Student s3 = new Student(154, " Trần Đình Tuệ", "Hà Tĩnh");
        s3.HienThi();


    }
}







//    public static void main(String[] args) {
//
//    }

