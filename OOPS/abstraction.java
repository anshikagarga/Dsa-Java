package OOPS;

public class abstraction {
    public static  void main(String []args) {
        horse h = new horse();
        h.eat();
        h.walk();
        chiken ch = new chiken();
        ch.walk();
        Mustang m = new Mustang();
//        animal -> horse -> Mustang
    }

}
abstract class Animal{

//    constructor
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("Animal is eating");
    }
    abstract void walk();
}

class horse extends Animal{

    horse(){
        System.out.println("Horse constructor called");
    }

    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}


class Mustang extends horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}


class chiken extends Animal{

    void changeColor(){
        color = "yellow";
    }

    void walk(){
        System.out.println("walks on 2 legs");
    }
}


