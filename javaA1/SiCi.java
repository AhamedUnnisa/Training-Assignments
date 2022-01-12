package code;

import java.util.Scanner;

public class SiCi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			double pr,rate,time,sim,com;
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the amount");
			pr=sc.nextDouble();
			System.out.println("enter the no.of years");
			time=sc.nextDouble();
			System.out.println("enter the rate of interest");
			rate=sc.nextDouble();
			sim=(pr*time*rate)/100;
			com=pr* Math.pow(1.0+rate/100.0,time)-pr;
			System.out.println("Simple Interest="+sim);
			System.out.println("Compound Interest="+com);
		}
	}

}
