package ua.adeptius.spring.mvc.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.adeptius.spring.mvc.model.Employee;
import ua.adeptius.spring.mvc.model.Position;
import ua.adeptius.spring.mvc.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class EmloyeeController {

    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String employees(Map<String, Object> model){
        model.put("employees", employeeService.getEmployees());
        return "employees";

//        Employee employee = new Employee();
//        employee.setName("Mary");
//        employee.setPosition(Position.WAITER);
//        employee.setSalary(25000.0F);
//        employee.setSurname("Smith");
//        List<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(employee);
//        model.put("employees", employeeList);
    }
}
