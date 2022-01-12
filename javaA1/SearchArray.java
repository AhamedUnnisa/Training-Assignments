package code;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[15]; int n, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("enter search element");
		n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		if(count>0)
			System.out.println("item found");
		else
			System.out.println("item not found");
	}

}
