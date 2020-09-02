package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manipal.assignment.spring_core_work.Line;
import com.manipal.assignment.spring_core_work.Triangle;

public class ShapeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		Line ln = (Line) context.getBean("line");
		System.out.println(ln);
		Triangle tr = (Triangle) context.getBean("triangle");
		System.out.println(tr);
	}

}
