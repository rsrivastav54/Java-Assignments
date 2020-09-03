package com.telstra.insurance;

import com.telstra.emppack.Employee;
import com.telstra.emppack.Manager;
import com.telstra.emppack.Programmer;

public class Insurance {
	public double calcPremium(Employee emp) {
		double premium = 0.0;
		if (emp instanceof Manager) {
			premium = emp.getPremium();

		} else if (emp instanceof Programmer) {
			premium = emp.getPremium();

		} else {
			premium = emp.getPremium();
		}

		return premium;
	}


}
