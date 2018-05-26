package mock.service.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mock.service.model.Employee;

@RestController
@RequestMapping("/rest/db")
public class EmployeeController {

	
    @GetMapping("/{userid}")
    public Employee getEmployee(@PathVariable("userid") final int userid) {
    	Map<Integer,Employee> empMap = new HashMap<Integer,Employee>();
    	Employee emp1 = new Employee(1,"Marco","8A","SSE");
    	Employee emp2 = new Employee(2,"Harry","6A","TL");
    	Employee emp3 = new Employee(3,"Jim","6B","BA");
    	Employee emp4 = new Employee(4,"Carl","7B","TM");
    	Employee emp5 = new Employee(5,"Jack","5B","AM");
    	    	
    	empMap.put(1,emp1);
    	empMap.put(2,emp2);
    	empMap.put(3,emp3);
    	empMap.put(4,emp4);
    	empMap.put(5,emp5);
    	
       	return empMap.get(userid);
        
    }

    

}