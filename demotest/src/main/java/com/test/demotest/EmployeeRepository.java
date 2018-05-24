package com.test.demotest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {
	
	
	List<Employee> emps;
	
	public EmployeeRepository() {
		emps =new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setName("Brajesh kumar");
		e1.setId(100);		
		Employee e2=new Employee();
		e2.setName("Sumati kumar");
		e2.setId(101);
		emps.add(e1);
		emps.add(e2);
		
	}
	public List<Employee> getEmployees(){
		
		
		return emps;
	}
		
		
	public Employee getEmployee(int id) {
		
		for(Employee e:emps) {
			
			if(e.getId()==id)
				return e;
		}
		return null;
	}
	public void create(Employee e) {
		emps.add(e)	;	
	}

}
