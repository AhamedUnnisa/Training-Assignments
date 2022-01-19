package Demo;
import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;

		@Retention(RetentionPolicy.RUNTIME)
		@Target(ElementType.METHOD)

		 @interface Test {
			String name();
		}
		class annotation
		{
			@Test(name="joe")
			public void animals()
			{
				System.out.println("Cat is an animal");
			}
			public static void main(String args[])throws Exception
			{
			annotation a = new annotation();
			a.animals();
			Method m=a.getClass().getMethod("animals");
			Test t=m.getAnnotation(Test.class);
			System.out.println("name is:"+t.name());
			}
		}


