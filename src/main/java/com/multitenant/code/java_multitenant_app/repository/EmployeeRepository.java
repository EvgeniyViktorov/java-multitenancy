package com.multitenant.code.java_multitenant_app.repository;

import com.multitenant.code.java_multitenant_app.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {}
