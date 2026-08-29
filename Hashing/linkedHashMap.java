package Hashing;
import java.util.*;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> llm = new LinkedHashMap<>();
        llm.put("India",105);
        llm.put("USA",150);
        llm.put("China",100);

        System.out.println(llm);
    }
}
