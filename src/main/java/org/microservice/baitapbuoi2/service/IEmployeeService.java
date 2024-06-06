package org.microservice.baitapbuoi2.service;

import org.microservice.baitapbuoi2.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    Employee findById(Integer id);

    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(Integer id);

    List<Employee> findByName(String empName);
}
