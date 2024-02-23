package codefinity.dao;

import codefinity.model.Employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EmployeeDao {
    Employee add(Employee employee);

    Employee getById(int id);

    List<Employee> getEmployeesHiredInASpecificTimeframe(LocalDate startDate, LocalDate endDate);

    List<Employee> getAll();

    List<Employee> getEmployeesWithSalaryMoreThan(Double salary);

    Employee setDepartmentById(int employeeId, int departmentId);

    Employee setRoleById(int employeeId, int roleId);

    Employee updateEmployee(int employeeId, Employee newEmployee);

    Double increaseEmployeesSalary(int employeeId, Double amount);

    Double increaseEmployeesSalary(int employeeId, int percent);

    Double decreaseEmployeesSalary(int employeeId, Double amount);

    Double decreaseEmployeesSalary(int employeeId, int percent);
}
