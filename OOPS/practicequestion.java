package OOPS;

public class practicequestion {
   public  static void main(String args[]) {
        Student1 c = new Student1();
        c.name = "aman";
       System.out.println(c.name);

       vehicle obj1 = new car();
       obj1.print();

       vehicle obj2 = new vehicle();
       obj2.print();

       System.out.println(Book.count);
       Book b1 = new Book(150);
       Book b2 =  new Book(250);
       System.out.println(Book.count);

    }

//    class Student{
//        String name;
//        int marks;
//    }
}
class Student1{
    String name;
    int marks;
}

class vehicle{
    void print(){
        System.out.println("Base class(Vehicle");
    }
}
class car extends vehicle{
    void print(){
        System.out.println("Derived class(Car");
    }
}

class Book{
    int price;
    static int count;
    public Book(int price){
        this.price = price;
        count++;
    }}

