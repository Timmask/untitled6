package com.Temirlan.spring.mvc.entity;

import lombok.*;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String,String> departments;

    public Employee() {
        departments=new HashMap<>();
        departments.put("IT","Information technology");
        departments.put("HR","Human Resources");
        departments.put("Sales","Sales");
    }
}
