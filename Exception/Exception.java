package Exceptionhandling;


	import java.util.Scanner;

	public class Exception {

		public static void main(String[] args)throws InsufficientBalanceException,IllegalBankTransactionExceptions {
			long id;
			double balance;
			double amount,amount1;
			double withdraw;
			for(int i=0;i<5;i++)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter id");
				id=sc.nextLong();
				System.out.println("enter balance amount");
				balance=sc.nextDouble();
				System.out.println("enter withdrawamount");
				amount=sc.nextDouble();
				
				if((balance<amount)||((balance==0)&&(amount>balance)))
				{
					throw new InsufficientBalanceException("insufficient balance");
				}
				if((amount<0)||(balance<amount))
				{
					throw new IllegalBankTransactionExceptions("illlegal bank transaction")
				
			}
				System.out.println("withdraw amount is:"+amount);
				System.out.println("total balance after withdrawl is"+(balance-amount));
				balance=balance-amount;
				System.out.println("enter deposite amount");
				amount1=sc.nextDouble();
				
				System.out.println("the deposited amount is"+amount1);
				System.out.println("total balance of deposit amount is"+(amount1+balance));
			// TODO Auto-generated method stub

		}

	}


}
