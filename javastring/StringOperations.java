package string;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java String pool refers to collections of Strings which are stored in heap memory";
		
		System.out.println(str1);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.replace('a' , '$'));
		System.out.println(str1.contains("collection"));
		System.out.println(str1.matches("(.*)java string pool refers to collections of strings which are stored in heap memory(.*)"));

	}

}
