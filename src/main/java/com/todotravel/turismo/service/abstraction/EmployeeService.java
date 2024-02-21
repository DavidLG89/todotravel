package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getById(Long id);
    List<Employee> getAll();
    Employee create(Employee employee);
    Employee update(Employee employee);
    void deleteById(Long id);
}
