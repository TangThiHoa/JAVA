package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return (b*b-4*a*c);
    }
    public double getRoot1() {
        return -b+ Math.pow(getDiscriminant(),0.5)/2*a;
    }
    public double getRoot2() {
        return -b- Math.pow(getDiscriminant(),0.5)/2*a;

    }
    public double getRit() {
        return -b/2*a;

    }

    @Override
    public String toString() {
        return "phương trình vô nghiệm";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = sc.nextDouble();
        System.out.println("Nhập b ");
        double b = sc.nextDouble();
        System.out.println("Nhập c ");
        double c = sc.nextDouble();


        QuadraticEquation pTrinhBac2=new QuadraticEquation(a,b,c);
        double hoa = pTrinhBac2.getDiscriminant();
        if (hoa>0){
            System.out.println("getRoot1 =" + pTrinhBac2.getRoot1());
            System.out.println("getRoot2 =" + pTrinhBac2.getRoot2());

        }else if (hoa==0){
            System.out.println("Phương trình có một nghiệm " + pTrinhBac2.getRit());

        }
        else  {
            System.out.println("String tosTring = " +pTrinhBac2.toString());

        }


}
}
