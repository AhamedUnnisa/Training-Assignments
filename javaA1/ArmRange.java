package code;

import java.util.Scanner;

public class ArmRange {
	
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 
    	 int a=sc.nextInt();
    	 int b=sc.nextInt();
    	 
    	 
    	 findArmstrong(a,b);
     }
    	 
		// TODO Auto-generated method stub
	static void findArmstrong(int a, int b) {
			for(int i=a;i<=b;i++) {
				int num=i;
			    int sum=0;
			
			while(num>0) {
				int r=num%10;
				sum=sum+(r*r*r);
				num=num/10;		
			}
			if(sum==i) {
				System.out.println(sum);
			}
				
			}
		}

	}


