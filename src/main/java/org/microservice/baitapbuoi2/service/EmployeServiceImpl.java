package org.microservice.baitapbuoi2.service;

import org.microservice.baitapbuoi2.Employee;
import org.microservice.baitapbuoi2.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeServiceImpl implements IEmployeeService{

    @Autowired
    private IEmployeeRepository iEmployeeRepository;
    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return iEmployeeRepository.findById(id).orElse(null);

    }

    @Override
    public Employee save(Employee employee) {
        return iEmployeeRepository.save(employee);

    }

    @Override
    public Employee update(Employee employee) {
        if (findById(employee.getEmpId()) == null)
        {
            throw new NoSuchElementException("Emp not exist");
        }
        return iEmployeeRepository.save(employee);
    }

    @Override
    public void delete(Integer id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findByName(String empName) {
        return iEmployeeRepository.findByEmpName(empName);

    }
}
