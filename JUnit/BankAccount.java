package io.javabrains;


	import java.util.Scanner; 
	public class BankAccount 
	{
		static int i;
		static double amount; 
		static double balance;
		public void withdraw(double balance,double amount) throws InsufficientFundsException 
		{ 
			if(amount>balance||balance<=0) 
			{ 
				throw new InsufficientFundsException("Insufficient Funds"); 
			} 
			System.out.println("The withdrawl amount is "+amount); 
			System.out.println("The total amount after withdraw is:"+(balance-amount)); 
		} 
	public static void main(String[] args)throws InsufficientFundsException 
	{
		for(i=0;i<4;i++) 
		{
		Scanner sc=new Scanner(System.in); 
		BankAccount result=new BankAccount(); 

		System.out.println("Enter Account type"); 
		String accounttype=sc.nextLine(); 
		
		if(accounttype.matches("savingsaccount"))
		{ 
		System.out.println("Enter Balance Amount"); 
		balance=sc.nextDouble(); 
		System.out.println("Enter withdraw amount"); 
		result.withdraw(balance,amount); 
		} 
		else 
		{
		System.out.println("It not a valid account type"); 
		}
		}
	}
	}

	class InsufficientFundsException extends Exception 
		{
			public InsufficientFundsException(String str) 
			{
				System.out.println(str); 
			}
		} 



