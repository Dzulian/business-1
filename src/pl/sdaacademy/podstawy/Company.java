package pl.sdaacademy.podstawy;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Company {
    private Country country;
    private String companyName;
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        if ( employees == null ) {
            this.employees = new Employee[0];
        }
        else {
            this.employees = employees;
        }

    }

    public Company(Country country, String companyName) {
        this.country = country;
        this.companyName = companyName;
        this.employees = new Employee[0];
    }

    public Country getCountry() {
        return country;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String toString() {
        return companyName;
    }

    public Employee[] getRetiredEmployees(LocalDate date){
        Employee[] retiredEmployees = new Employee[employees.length];
        int counter = 0;
        for (Employee employee: this.employees) {
           if (employee.isRetired(getCountry(),date)) {
               retiredEmployees[counter]=employee;
               counter++;
           }
        }
        return Arrays.copyOf(retiredEmployees,counter);

    }
}
