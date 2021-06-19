package lambda;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

    private static List<String> items = new ArrayList<>();

    static {
        items.add("A");
        items.add("BC");
        items.add("C");
        items.add("BD");
        items.add("E");
    }
    public static void main(String[] args) {

        //遍历
//        items.forEach(System.out::println);

        //过滤
        items.stream().filter(s -> !s.contains("A")).forEach(System.out::println);


    }
}
