package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleMapping {


    private static List<Person> personList = new ArrayList<>();

    static {
        personList.add(Person.builder().id(10).name("apple").address("shanghai").build());
        personList.add(Person.builder().id(12).name("apple").address("wuhan").build());
        personList.add(Person.builder().id(16).name("apple").address("nanjing").build());
        personList.add(Person.builder().id(16).name("apple").address("nanjing").build());
    }

    //map 分组
    public static void main(String[] args) {
        Map<String, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(c -> c.getAddress()));

        System.out.println(collect);


    }

}
