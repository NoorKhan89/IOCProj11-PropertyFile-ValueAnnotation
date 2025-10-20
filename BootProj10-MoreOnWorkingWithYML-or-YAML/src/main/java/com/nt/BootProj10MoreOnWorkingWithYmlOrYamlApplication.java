package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj10MoreOnWorkingWithYmlOrYamlApplication 
{

	public static void main(String[] args)
	{
		// Get IOC Container
	ConfigurableApplicationContext ctx=SpringApplication.run(BootProj10MoreOnWorkingWithYmlOrYamlApplication.class, args);
		
	// Get Spring Bean class obj ref
	Employee emp=ctx.getBean("emp",Employee.class);
	System.out.println("Employee Details :: "+emp);
	//Close the Container
	ctx.close();
	}

}
