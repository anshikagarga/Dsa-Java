package OOPsConcept;

public class student {
//    creating a new datatype
//      public static class studentclass{
//        String name;
//        int rno;
//        double percent;
//    }
    public static void fun(studentclass x){
        System.out.println(x.name);
        return;
    }
    public static void fun1(studentclass y){
        System.out.println(y.name);
        return;
    }


    public static void main(String[] args) {

        studentclass x = new studentclass(); // declaration
        x.name = "Raghav";
        x.rno = 34;
        x.percent = 74.8;
        System.out.println(x.name);
        x.name = "Rahul";
        System.out.println(x.name);
        fun(x);
        studentclass y = new studentclass(); // declaration
        y.name = "Akshit";
        y.rno = 4;
        y.percent = 97.2;
        fun1(y);
//        classes are blueprints & objects are real life entities.
//        classes -> user defined datatype . ek esa object create karna no of multiple attributes


    }
}
