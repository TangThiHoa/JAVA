package Animail;

public class AiT {
    public static void main(String[] args) {
        Ani[]ani=new Ani[2];
        ani[0]=new Chicken();
        ani [1]=new Tiger();
        for (Ani a : ani){
            System.out.println(a.makeSound());
        }
    }
}
