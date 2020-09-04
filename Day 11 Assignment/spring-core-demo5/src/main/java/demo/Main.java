package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manipal.spring_core_demo4.Employee;
import com.manipal.spring_core_demo4.Organization;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml"); 
		Organization org = (Organization) context.getBean("organization");
		System.out.println(org);
		
	}

}
