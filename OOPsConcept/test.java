package OOPsConcept;

public class test {
    public static void main(String[] args) {
        car Car = new car();
//        Car.color = "Blue";
//        Car.speed = 40;
//        Car.brand = "Tata";
//        Car.year = 2020;
//        Car.model = "safari";

        Car.accelerate(1);
//        System.out.println(Car.speed);
        cat cat = new cat();

        animal dog = new dog(); //polymorphism
        dog.somesound();


    }
}
