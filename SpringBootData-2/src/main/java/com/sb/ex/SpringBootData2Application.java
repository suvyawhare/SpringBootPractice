package com.sb.ex;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootData2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cacxt=SpringApplication.run(SpringBootData2Application.class, args);

		EmployeeRepo erepo = cacxt.getBean(EmployeeRepo.class);

		//EmployeeDetails employeeDetails=new EmployeeDetails();
		/*
		 * employeeDetails.setEmployeeId("IBM-3");
		 * 
		 * employeeDetails.setEmployeeName("Anil");
		 * 
		 * employeeDetails.setEmployeeProfile("Tester");
		 */
		Optional<EmployeeDetails> opt=erepo.findById("IBM-1");

		if(opt.isPresent()) {
			EmployeeDetails e=opt.get();
			System.out.println(e);
		}

		try {
			erepo.deleteById("IBM-3");
			System.out.println("ID is deleted");
		}
		catch(Exception e){
			System.out.println("ID not found for deletion");	
		}


		Iterable<EmployeeDetails> list=erepo.findAll();

		System.out.println("All employees list :");
		list.forEach(entity->{
			System.out.println(entity);
		});



		System.out.println("Find By Name : ");
		
		EmployeeDetails opt3=erepo.findByEmployeeName("Neel");
		if(null!=opt3) {
			System.out.println("By Name Result: "+opt3);
		}
		else {
			System.out.println("Employee Not found by name");
		}


		cacxt.close();

	}

}
