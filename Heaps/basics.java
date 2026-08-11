package Heaps;
import java.util.*;

public class basics {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student o) {
            return this.rank - o.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue <Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 5)); //o(logn)
        pq.add(new Student("B", 15));
        pq.add(new Student("c", 7));
        pq.add(new Student("I", 75));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank); //o(1)
            pq.remove();//o(log n)
        }
    }
}
