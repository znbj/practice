package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleFilterMap {


    private static Map<Integer, String> map_ = new HashMap<>();

    static{
        map_.put(1, "linode.com");
        map_.put(2, "heroku.com");
        map_.put(3, "digitalocean.com");
        map_.put(4, "aws.amazon.com");
    }

    public static void main(String[] args) {


        String collect = map_.entrySet().stream().filter("heroku.com"::equals).map(Map.Entry::getValue).collect(Collectors.joining());
        System.out.println(collect);


    }




}
