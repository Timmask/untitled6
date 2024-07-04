package com.Temirlan.spring.mvc.entity;




import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class Employee {
    @Length(min = 2,message = "Name must be minimum 2 symbols")
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", departments=" + departments +
                ", carBrand='" + carBrand + '\'' +
                ", carBrands=" + carBrands +
                ", languages=" + Arrays.toString(languages) +
                ", languagesList=" + languagesList +
                '}';
    }

    public @Length(min = 2, message = "Name must be minimum 2 symbols") String getName() {
        return name;
    }

    public void setName(@Length(min = 2, message = "Name must be minimum 2 symbols") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "surname is required field") String getSurname() {
        return surname;
    }

    public void setSurname(@NotEmpty(message = "surname is required field") String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

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

    public Employee(String name, String surname, int salary, String department, Map<String, String> departments, String carBrand, Map<String, String> carBrands, String[] languages, Map<String, String> languagesList) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        this.departments = departments;
        this.carBrand = carBrand;
        this.carBrands = carBrands;
        this.languages = languages;
        this.languagesList = languagesList;
    }
}
