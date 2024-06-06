package org.microservice.baitapbuoi2.controller;

import org.microservice.baitapbuoi2.Employee;
import org.microservice.baitapbuoi2.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> findAll()
    {
        return new ResponseEntity<>(iEmployeeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable("id") Integer id)
    {
        return new ResponseEntity<>(iEmployeeService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee)
    {
        return new ResponseEntity<>(iEmployeeService.save(employee), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Employee> update(@RequestBody Employee employee)
    {
        return new ResponseEntity<>(iEmployeeService.update(employee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id)
    {
        iEmployeeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/employees/{name}")
    public ResponseEntity<List<Employee>> findByName(@PathVariable("name") String name)
    {
        return new ResponseEntity<>(iEmployeeService.findByName(name), HttpStatus.OK);
    }
}
