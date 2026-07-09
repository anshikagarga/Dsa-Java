package Queue;
import java.util.*;

public class withJcf {


        public static void main(String[] args){
//            withLinked.Node.Queue q = new withLinked.Node.Queue();
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            System.out.println(q.remove());
            q.add(5);
            System.out.println(q.remove());
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }

    }

