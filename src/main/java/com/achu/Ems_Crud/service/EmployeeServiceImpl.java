package com.achu.Ems_Crud.service;

import com.achu.Ems_Crud.dto.EmployeeDto;
import com.achu.Ems_Crud.entity.Employee;
import com.achu.Ems_Crud.mapper.EmployeeMapper;
import com.achu.Ems_Crud.repo.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee createEmployee = employeeRepo.save(employee);
        return EmployeeMapper.mapToEmployeeDto(createEmployee);
    }
}
