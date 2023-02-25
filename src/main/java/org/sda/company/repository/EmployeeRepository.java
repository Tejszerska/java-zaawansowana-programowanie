package org.sda.company.repository;

import org.sda.company.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private static Long id = 0L;
    private static final List<Employee> employees = new ArrayList<>();

    public Employee add(Employee employee) {
        id++;
        employee.setId(id);
        employees.add(employee);
        return employee;
    }

    public Employee remove(Employee employee) {
        employees.remove(employee);
        return employee;
    }
    public void removeByID(Long id) {
      var employee =   employees.stream().filter(e -> e.getId().equals(id)).toList();
      employees.remove(employee.get(0));
    }

    public List<Employee> findAll() {
        return employees;
    }
}
