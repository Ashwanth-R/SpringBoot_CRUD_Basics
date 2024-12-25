package com.achu.Ems_Crud.repo;

import com.achu.Ems_Crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
