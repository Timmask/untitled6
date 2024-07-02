package com.Temirlan.spring.mvc.entity;



import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;


import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    @Size(min = 2,message = "Name must be minimum 2 symbols")
    private String name;

    @NotEmpty(message = "surname is required field")
    private String surname;
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String carBrand;
    private Map<String,String> carBrands;
    private String[] languages;
    private Map<String,String> languagesList;

    public Employee() {
        departments=new HashMap<>();
        departments.put("IT","Information technology");
        departments.put("HR","Human Resources");
        departments.put("Sales","Sales");

        carBrands=new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Mers","Mersedes");
        carBrands.put("Audi","Audi");

        languagesList = new HashMap<>();
        languagesList.put("English","EN");
        languagesList.put("Deutch","DE");
        languagesList.put("France","FR");

    }
}
