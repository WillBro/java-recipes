package am.willi.marshaling.file.employee.model;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    String firstName;
    String lastName;
    String title;
    int salary;
    Date hireDate;
}
