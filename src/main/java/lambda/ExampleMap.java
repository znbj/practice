package lambda;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {

    private static Map<String, Integer> items = new HashMap<>();
    static {
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
    }
    public static void main(String[] args) {

        //java8之前
//        for (Map.Entry<String, Integer> stringIntegerEntry : items.entrySet()) {
//            System.out.println(stringIntegerEntry.getKey() + ":" + stringIntegerEntry.getValue());
//        }


        //lambda

        items.forEach((k,v)-> System.out.println(k + ":" + v));

    }
}
