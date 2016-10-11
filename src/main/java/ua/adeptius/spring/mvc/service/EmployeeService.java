package ua.adeptius.spring.mvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.adeptius.spring.mvc.dao.EmployeeDao;
import ua.adeptius.spring.mvc.model.Employee;
import ua.adeptius.spring.mvc.model.Position;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Transactional
    public List<Employee> getEmployees(){

        Employee employee = new Employee();
        employee.setName("Mary");
        employee.setPosition(Position.WAITER);
        employee.setSalary(25000.0F);
        employee.setSurname("Smith");
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee);

        Employee employee2 = new Employee();
        employee2.setName("Tom");
        employee2.setPosition(Position.WAITER);
        employee2.setSalary(30000.0F);
        employee2.setSurname("Smith");
        employeeList.add(employee2);

        return employeeList;
    }

    @Transactional
    public Employee getEmployeeByName(String employeeName) {
        Employee employee = new Employee();
        employee.setName(employeeName);
        employee.setPosition(Position.WAITER);
        employee.setSalary(((float) Math.random()*30)*1000.0F);
        employee.setSurname("Smith");
        return employee;
    }
}
