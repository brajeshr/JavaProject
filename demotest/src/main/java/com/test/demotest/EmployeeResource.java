package com.test.demotest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employees")
public class EmployeeResource {
	
	EmployeeRepository empRepo=new EmployeeRepository();
	 @GET
	 @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	 
	 public List<Employee> getEmployees() {
		
		return empRepo.getEmployees();
		 
	 }
	@GET
	@Path("employee/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employee getEmployee(@PathParam("id") int id) {
		return empRepo.getEmployee(id);
	}
	@POST 
	@Path("employee")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public  Employee  createEployee(Employee e) {
		System.out.println(e);
		empRepo.create(e);
		
		return e;
	}
	
	
}
