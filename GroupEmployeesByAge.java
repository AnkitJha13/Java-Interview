package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class GroupEmployeesByAge {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Athena", 30),
                new Employee(2, "Levinho", 31),
                new Employee(3, "Mortal", 32),
                new Employee(4, "Mamba", 33),
                new Employee(5, "Scout", 34)
        );

        // Group employees by age
        Map<Integer, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        // Print the grouped employees
        map.forEach((key, value) -> {
            System.out.println("Age: " + key);
            System.out.println("List of employees: " + value);
        });
    }
}


// Output

Age: 32
List of employees: [Employee{id=3, name='Mortal', age=32}]
Age: 33
List of employees: [Employee{id=4, name='Mamba', age=33}]
Age: 34
List of employees: [Employee{id=5, name='Scout', age=34}]
Age: 30
List of employees: [Employee{id=1, name='Athena', age=30}]
Age: 31
List of employees: [Employee{id=2, name='Levinho', age=31}]
