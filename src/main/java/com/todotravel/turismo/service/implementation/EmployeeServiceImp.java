package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.Employee;
import com.todotravel.turismo.repository.EmployeeRepository;
import com.todotravel.turismo.service.abstraction.EmployeeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Override
    public Employee getById(Long id) throws EntityNotFoundException {
        return employeeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El servicio de hotel con id: " + id + " no existe en base de datos"));
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
