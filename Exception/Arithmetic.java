package Demo;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the first number:");
			a=sc.nextInt();
			
			System.out.println("enter the second number");
			b=sc.nextInt();
			c=a/b;
			System.out.println("result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:" +e);
			//System.out.println("Error:"+e);
		}
	

	}


}