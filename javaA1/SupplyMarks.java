package code;
import java.util.Scanner;

public class SupplyMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first subject marks");
			int sub1=sc.nextInt();
			
			System.out.println("enter second subject marks");
			int sub2=sc.nextInt();
			
			System.out.println("enter third subject marks");
			int sub3=sc.nextInt();
			
		if(sub1>60 && sub2>60 && sub3>60)
		{
			System.out.println("Passed");
		}
		if(sub1+sub2>120 || sub2+sub3>120 || sub1+sub3>120)
		{
			System.out.println("promoted");
		}
		else 
		{
			System.out.println("fail");
		}
	}

}
}
