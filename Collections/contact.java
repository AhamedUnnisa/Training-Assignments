package Demo;
import java.util.*;


public class contact {
	int phonenumber;
	String name,Email,gender;
	public contact(String name,String Email,String gender)
	{
		this.name=name;
		this.Email=Email;
		this.gender=gender;
	}

	public static void main(String[] args, Object m) {
		TreeMap<Integer,contact> tm=new TreeMap<Integer,contact>(Collections.reverseOrder());
        contact c1=new contact("rahima","ahamed@gmail.com","female");
        contact c2=new contact("shaima","sufia@gmail.com","female");
        contact c3=new contact("rio","rio@gmail.com","male");
        contact c4=new contact("john","joh@gmail.com","male");
        tm.put(123456,c1);
        tm.put(123457,c2);
        tm.put(123458,c3);
        tm.put(123459,c4);
        for(Map.Entry<Integer,contact> m1:tm.entrySet())
        {
        	
			int Key=m1.getKey();
        	contact b=m1.getValue();
        	System.out.println(Key+ "phonenumber");
        	System.out.println(b.name+" "+b.Email+" "+b.gender);
        	System.out.printf("%d %s %s %s",Key,b.name,b.Email,b.gender);
        }
	}

}
