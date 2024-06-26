package springcoreprj.SpringCorePrj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(EmpConfig.class);
//    	Hello h=(Hello) context.getBean("hello");
//    	System.out.println("using h bean instance"+h.sayHello());
//    	
//    	Hello h1=(Hello) context.getBean("hello");
//    	System.out.println("using h1 bean instance"+h1.sayHello());
    	
    	Employee e=(Employee) context.getBean(Employee.class);
    	System.out.println(e);
//    	
//    	Employee e1=(Employee) context.getBean("emp1");
//    	System.out.println(e1);
//    	
//    	Employee e2=(Employee) context.getBean("emp2");
//    	System.out.println(e2);
    	
//    	Order ord1=(Order) context.getBean("ord");
//    	System.out.println(ord1);
    	
    	
    	
    	
    }
}
