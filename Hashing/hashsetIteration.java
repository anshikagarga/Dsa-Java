package Hashing;
import java.util.*;

public class hashsetIteration {
    public static void main(String[] args) {
        HashSet<String>cities = new HashSet<>();
        cities.add("London");
        cities.add("New York");
        cities.add("Paris");
        cities.add("San Francisco");
//        Iterator<String> it = cities.iterator();
//        while (it.hasNext()) {
//            String city = it.next();
//            System.out.println(city);
//        }

        for(String city:cities){
            System.out.println(city);
        }
    }
}
