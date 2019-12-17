package springsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		//and find a way to generate a bean and call the method
		//in the bean
		//Person p = new Person();
		//p.showMessage();
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		Person personBean = (Person)context.getBean("personBean");
		personBean.showMessage();
		
	}
}
