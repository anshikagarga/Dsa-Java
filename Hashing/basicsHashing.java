package Hashing;
import java.util.*;

public class basicsHashing {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer>map = new HashMap<>();

        //Insert
        map.put("India", 150);
        map.put("china", 150);
        map.put("US" , 50);

        //Get - O(1)
        int population = map.get("India");
        System.out.println(population);

        //ContainsKey - O(1)
        System.out.println(map.containsKey("china"));//true

//        Remove
        System.out.println(map.remove("china"));

        //size
        System.out.println(map.size());

//        isEmpty
        map.clear();
        System.out.println(map.isEmpty());

        System.out.println(map);
        map.forEach((key,value) -> System.out.println(value));
    }
}
