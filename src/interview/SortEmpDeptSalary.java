package interview;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpDeptSalary {

    public static void main(String[] args) {

        List<Employee>  employees =Arrays.asList(
                new Employee(1,"Subhash", "IT", BigDecimal.valueOf(33000.50)),
                new Employee(1,"Richa", "CSE", BigDecimal.valueOf(33000.50)),
                new Employee(1,"Subham", "ECE", BigDecimal.valueOf(334000.50)),
                new Employee(1,"Sumit", "IT", BigDecimal.valueOf(33000.50)),
                new Employee(1,"Suman", "IT", BigDecimal.valueOf(4444.444))
        );

        Collections.sort(employees, (o1,o2)-> o1.getSalary().compareTo(o2.getSalary()));

        List<Employee> sortedEmpyees =employees.stream().sorted(
                (o1, o2) -> {
                    int deptCom = o1.getDept().compareTo(o2.getDept());
                    return deptCom == 0 ? o1.getSalary().compareTo(o2.getSalary()) : deptCom;
                }
        ).collect(Collectors.toList());

        employees.stream().sorted(Comparator.comparing(Employee::getDept).thenComparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sortedEmpyees);

    }
}
