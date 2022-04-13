package Animail;

public class Chicken extends Ani implements Edible{

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoEat() {
        return "Nuot";
    }
}
