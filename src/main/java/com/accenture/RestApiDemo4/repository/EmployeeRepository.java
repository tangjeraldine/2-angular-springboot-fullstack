package com.accenture.RestApiDemo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.RestApiDemo4.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
