package ua.adeptius.spring.mvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.adeptius.spring.mvc.dao.EmployeeDao;
import ua.adeptius.spring.mvc.model.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Transactional
    public List<Employee> getEmployees(){
        return employeeDao.findAll();
    }
}
