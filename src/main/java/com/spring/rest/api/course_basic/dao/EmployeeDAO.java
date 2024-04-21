package com.spring.rest.api.course_basic.dao;

import com.spring.rest.api.course_basic.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
