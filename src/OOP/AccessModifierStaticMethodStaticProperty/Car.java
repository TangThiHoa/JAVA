package OOP.AccessModifierStaticMethodStaticProperty;

public class Car {
    public String name ;
    public String engine ;

    public static int numnerofCar;

    public Car(String name,String engine){
        this.name = name ;
        this.engine= engine;
        numnerofCar++;
    }
    public static void main(String[] args) {
        Car car1= new Car("Mazda 3 ","Skyactiv 3 ");
        System.out.println(Car.numnerofCar);
        Car car2= new Car("Mazda 6","Skyactiv 6 ");
        System.out.println(Car.numnerofCar);


    }
}
