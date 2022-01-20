package LambdaDemo;

interface Arithmetic{
	int operation(int a,int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		// addition operation
		Arithmetic addition=(a,b)->a+b;
		System.out.println("Addition is:" +addition.operation(10,30));
		//subtraction operation
		Arithmetic subtraction=(a,b)->a-b;
		System.out.println("Subtraction is:"+subtraction.operation(50,20));
		//division
		Arithmetic division=(a,b)->a/b;
		System.out.println("Subtraction is:"+division.operation(40,20));
		//multiplication
		Arithmetic mul=(a,b)->a*b;
		System.out.println("multiplication is:"+mul.operation(5,20));

	}

}
