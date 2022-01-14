package string;
import java.lang.String;

public class Stringbuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
			StringBuilder sb=new StringBuilder("StringBuilder");
			sb.append("is a peer class of string");
			sb.append("that a provides much of" );
			sb.append("the functionality of strings");
			
				System.out.println(sb);
				


	
	StringBuilder sb1=new StringBuilder("It is used to  at the specific index position");
	sb1.insert(14, "insert text");
	System.out.println(sb1);
	
	
	StringBuilder sb2=new StringBuilder("This method returns the reversed object on which it was called");
	System.out.println("string:" +sb2);
	
	System.out.println("reverse:" +sb2.reverse());

}
}
