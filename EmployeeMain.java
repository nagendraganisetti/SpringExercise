package com.abc.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        Employee employee =(Employee) context.getBean("emp");
        
        System.out.println("Employee ID: "+employee.getEmployeeId());
        System.out.println("Employee name: "+employee.getEmployeeName());
        System.out.println("Employee salary: "+employee.getSalary());
        System.out.println("Employee BU: "+employee.getBusinessUnit());
        System.out.println("Employee age: "+employee.getAge());
        
	}

}