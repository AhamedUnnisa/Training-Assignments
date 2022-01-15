package Exceptionhandling;
import java.util.Scanner;

public class unsupportedexception {

	public static void main(String[] args) {
		
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
				catch(UnsupportedOperationException ae)
				{
			
					System.out.println(ae);
					//System.out.println("Error:"+e);
				}
			
			}
		

	}


