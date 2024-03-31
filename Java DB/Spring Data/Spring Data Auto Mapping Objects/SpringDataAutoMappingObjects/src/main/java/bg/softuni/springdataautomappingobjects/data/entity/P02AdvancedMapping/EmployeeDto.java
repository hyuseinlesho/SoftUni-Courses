package bg.softuni.springdataautomappingobjects.data.entity.P02AdvancedMapping;

import java.math.BigDecimal;

public class EmployeeDto {
    private String firstName;
    private String lastName;
    private BigDecimal salary;

    public EmployeeDto() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("  - %s %s %.2f", firstName, lastName, salary);
    }
}
