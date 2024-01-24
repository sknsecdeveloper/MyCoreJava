package javatechie;

import design.builder.Student;
import javatechie.java8interview.Employee;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrooupByTest {

    public static void main(String[] args) {

        int[] arr = {1,1,2,1,4,14,3,3};

        System.out.println("Max value : "+Arrays.stream(arr).max().getAsInt());


        Map<Integer, List<Integer>> listMapTest =Arrays.stream(arr).mapToObj(n -> (Integer.valueOf(n))).
                collect(Collectors.groupingBy(c->c));
        System.out.println(listMapTest);

        Map<Integer, Long> integerIntegerMap = Arrays.stream(arr).mapToObj(c-> Integer.valueOf(c)).collect(Collectors.
                groupingBy(c->c, Collectors.counting()));
        integerIntegerMap.entrySet().stream()
                        .forEach((e)-> System.out.println(e.getKey()+" --- "+e.getValue()));





        listMapTest.forEach((a,b) -> System.out.println(a+" ===== " +b));



        String str = "subhash arnab";
        Map.Entry<Character, Long> mapCount =   str
                .chars().mapToObj(c->Character.valueOf((char)c)).collect(
                        Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting() )
                ).entrySet().stream()
                        .filter(e -> e.getValue()==1L).findFirst().get();
        System.out.println(mapCount.getKey()+" CHAR MIN COUNT  "+mapCount.getValue());

       /* Arrays.asList(new Student()).stream().collect(Collectors.groupingBy(s-> s.getDepartment(),
                Collectors.mapping(s -> s.getRollNo(), Collectors.toList())));*/


        List<Employee> employees = Arrays.asList(
                new Employee(1, "subhash1", 3323.3),
                new Employee(2, "subhash2", 3333.3),
                new Employee(1, "subhash4", 3433.3),
                new Employee(2, "subhash10", 3333.3),
                new Employee(1, "subhash0", 3333.3)
        );

        employees.stream().collect(Collectors.groupingBy(emp -> emp.getId())).entrySet().forEach(entry -> System.out.println(entry.getKey()+"     "+entry.getValue()));

        Map<Double, List<String>> salaryNamelist =  employees.stream().collect(Collectors.groupingBy(e-> e.getSalary(), Collectors.mapping(emp -> emp.getName(), Collectors.toList())));




    }
}
