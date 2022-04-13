package Animail;

public class TestF {
    public static void main(String[] args) {
        Fruit [] fruits=new Fruit[2];
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for (Fruit ni : fruits){
            System.out.println(ni.howtoEat());;

        }
    }
}
