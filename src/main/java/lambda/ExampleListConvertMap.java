package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleListConvertMap {


    private static List<Person> personList = new ArrayList<>();

    static{
        personList.add(Person.builder().id(20).name("zhangsan").address("shanghai").build());
        personList.add(Person.builder().id(30).name("lisi").address("nanjing").build());
    }


    public static void main(String[] args) {
        //list  转map

        Map<Integer, String> collect = personList.stream().collect(Collectors.toMap((key -> key.getId()), (value -> value.getAddress())));
        collect.forEach((integer, s) -> System.out.println(integer + ":" + s));

    }
}
