package Demo;

import java.lang.reflect.Method;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface info
{
	String id();
	String name();
	String supervisor();
	String date();
	String time();
	String version();
}
class author{
	@info(id="50",name="Unnisa",supervisor="Ahamed",date="20-11-1998",time="10:30",version="2.9")
	public void display() {}
}

public class Developer {
   public static void main(String[] args) throws NoSuchMethodException, SecurityException {
			
			author a = new author(); 
			//a.display();  
			   Method m = a.getClass().getMethod("display"); 
			 
			info i = m.getAnnotation(info.class);
			
			System.out.println("Author ID : " +i.id());
			System.out.println("Author Name: " +i.name());
			System.out.println("Supervisor Name: " +i.supervisor());
			System.out.println("Date: " +i.date());
			System.out.println("Time: " +i.time());
			System.out.println("Version: " +i.version());

		}


	
}




