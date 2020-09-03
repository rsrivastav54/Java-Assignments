package com.telstra.opack;

import com.telstra.emppack.Employee;
import com.telstra.emppack.Manager;
import com.telstra.emppack.Programmer;
import com.telstra.insurance.Insurance;
import com.telstra.tax.Tax;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(100, "Poorvika", 60000);
		System.out.println(e1.getDetails());

		Manager m1 = new Manager(200, "Shreya", 70000, "HR", 10);
		System.out.println(m1.getDetails());
		// Base class constructors are evoked first then the child class constructor is
		// evoked

		// Virtual Method Invocation in Java

		Employee emp = new Manager(201, "Neil", 70000, "IT", 5);
		// Giving base class reference and creating object of derived class
		// Can access

		System.out.println(emp.getDetails());
		// getDetails of manager class will be invoked because instance of manager class
		// is created
		// however, emp can access only overridden methods

		Manager manager = (Manager) emp;
		System.out.println(manager.getDeptName() + manager.getEmpCount());
		// Now we can access all features of manager class

		// Its Usage -> To form a heterogeneous array of employees
		Tax tax = new Tax();

		Insurance ins = new Insurance();

		Employee[] emparr = new Employee[4];

		emparr[0] = new Employee(101, "xxx", 40000);
		emparr[1] = new Manager(202, "yyy", 75000, "HR", 15);
		emparr[2] = new Manager(203, "zzz", 75000, "Finance", 15);
		emparr[3] = new Programmer(300, "AAA", 60000, 3, "Java");

		System.out.println("Printing details of the employees");
		for (Employee emp1 : emparr) {
			System.out.println(emp1.getDetails());
			System.out.println("Tax = " + tax.calcTax(emp1) + ", Premium = " + ins.calcPremium(emp1));
		}
	}

}
