package com.spring.rest.api.course_basic.dao;

import com.spring.rest.api.course_basic.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
