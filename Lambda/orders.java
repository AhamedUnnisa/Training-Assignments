package LambdaDemo;
import java.util.*;
import java.lang.annotation.*;
import java.util.stream.Stream;
public class orders {
	float price;
	String ordername;
	String orderaddress;
	String orderstatus;
	public orders(float price,String ordername,String orderaddress,String orderstatus)
	{
		this.price=price;
		this.ordername=ordername;
		this.orderaddress=orderaddress;
		this.orderstatus=orderstatus;
	}
	public static void main(String[] args) 
	{
		ArrayList<orders> list=new ArrayList<orders>();
		list.add(new orders(10000,"OneplusPhone","Visakhapatnam","ACCEPTED"));
		list.add(new orders(20000,"MiA1 Phone","Hyderabad","COMPLETED"));
		list.add(new orders(40000,"SamsungPhone","Bangalore","ACCEPTED"));
		list.add(new orders(650000,"iPhone","Chennai","ACCEPTED"));
		list.add(new orders(18000,"LGPhone","Mumbai","COMPLETED"));
		
		Stream<orders> filtereddata=list.stream().filter(o->o.price>10000);
		
		filtereddata.forEach
		(
				orders ->{
					System.out.println(orders.ordername+":"+orders.price);
					System.out.println(orders.orderstatus);
					
				});
	}
	
}


