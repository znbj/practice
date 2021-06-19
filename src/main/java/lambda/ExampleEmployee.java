package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleEmployee {


    private static List<Employee> employeeList = new ArrayList<>();


    static{
        employeeList.add(Employee.builder().name("Matt").salary(5000).office("New York").build());
        employeeList.add(Employee.builder().name("Steve").salary(6000).office("London").build());
        employeeList.add(Employee.builder().name("Carrie").salary(20000).office("New York").build());
        employeeList.add(Employee.builder().name("Peter").salary(7000).office("New York").build());
        employeeList.add(Employee.builder().name("Pat").salary(8000).office("London").build());
        employeeList.add(Employee.builder().name("Tammy").salary(29000).office("Shanghai").build());
    }


    public static void main(String[] args) {

        //anyMatch
        boolean london = employeeList.stream().anyMatch(employee -> employee.getOffice().equals("London"));
        System.out.println(london);



        //返回所有salary大于6000

        boolean b = employeeList.stream().allMatch(employee -> employee.getSalary() > 3000);
        System.out.println(b);


        //找出工资最高
        Optional<Employee> max = employeeList.stream().max(Comparator.comparingInt(e -> e.getSalary()));
        System.out.println(max);


        //返回姓名列表
        List<String> collect = employeeList.stream().map(employee -> employee.getName()).collect(Collectors.toList());
        System.out.println(collect);

        //list转map
        Map<String, Employee> collect1 = employeeList.stream().collect(Collectors.toMap((key -> key.getName()), (value -> value)));
        collect1.forEach((k, v) -> System.out.println(k + ":" + v));

        //统计办公室是New York的个数
        long new_york = employeeList.stream().filter(employee -> employee.getOffice().equals("New York")).count();
        System.out.println(new_york);


        //List转换为Set
        Set<String> collect2 = employeeList.stream().map(employee -> employee.getOffice()).collect(Collectors.toSet());
        System.out.println(collect2);
        boolean shangHai = collect2.add("Shanghai");
        System.out.println(shangHai);



        //查找办公室地点是New York的员工
        List<Employee> new_york1 = employeeList.stream().filter(employee -> employee.getOffice().equals("New York")).collect(Collectors.toList());
        System.out.println(new_york1);


        //按照工资的降序来列出员工信息
        List<Employee> collect3 = employeeList.stream().sorted((e1,e2)->Integer.compare(e2.getSalary(),e1.getSalary())).collect(Collectors.toList());
        System.out.println(collect3);


        //获取工资最高的前2条员工信息

        List<Employee> collect4 = employeeList.stream().sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary())).limit(2).collect(Collectors.toList());
        System.out.println(collect4);


        //获取平均工资
        OptionalDouble average = employeeList.stream().mapToInt(value -> value.getSalary()).average();
        System.out.println(average);


        //查找New York平均工资


        OptionalDouble new_york2 = employeeList.stream().filter(employee -> employee.getOffice().equals("New York")).mapToInt(value -> value.getSalary()).average();

        System.out.println(new_york2);
        
    }


}
