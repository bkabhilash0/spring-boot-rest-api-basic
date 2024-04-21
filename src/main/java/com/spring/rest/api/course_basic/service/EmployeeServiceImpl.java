package com.spring.rest.api.course_basic.service;

import com.spring.rest.api.course_basic.dao.EmployeeDAO;
import com.spring.rest.api.course_basic.dao.EmployeeRepository;
import com.spring.rest.api.course_basic.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;
//    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return this.employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return this.employeeDAO.save(employee);
    }

    @Override
    public void deleteById(int id) {
        this.employeeDAO.deleteById(id);
    }
}
