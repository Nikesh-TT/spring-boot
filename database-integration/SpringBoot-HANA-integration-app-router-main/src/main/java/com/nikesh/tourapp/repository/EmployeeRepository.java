package com.nikesh.tourapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.nikesh.tourapp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
}