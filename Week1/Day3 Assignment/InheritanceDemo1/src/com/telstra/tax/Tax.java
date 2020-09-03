package com.telstra.tax;

import com.telstra.emppack.Employee;
import com.telstra.emppack.Manager;
import com.telstra.emppack.Programmer;

public class Tax {

	public double calcTax(Employee emp) {
		double taxAmt = 0.0;
		if (emp instanceof Manager) {
			taxAmt = emp.getTax();

		} else if (emp instanceof Programmer) {
			taxAmt = emp.getTax();

		} else {
			taxAmt = emp.getTax();
		}

		return taxAmt;
	}

}
