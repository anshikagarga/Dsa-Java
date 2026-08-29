package Hashing;
import java.util.*;

public class hasshset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(4);
        System.out.println(hs);

        hs.remove(2);

        if(hs.contains(2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        hs.clear();

        System.out.println(hs.size());
    }
}
