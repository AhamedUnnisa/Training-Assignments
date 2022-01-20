package LambdaDemo;
		import java.util.ArrayList;
		import java.util.List;

		public class ThreadList {

			public static void main(String[] args) {
				
				List<Integer> num=new ArrayList<Integer>(){{
		            add(1);
		            add(20);
		            add(17);
		            add(8);
		            add(21);
		        }};
		        
		        Thread mylambda = new Thread(()->System.out.println(num));
		        mylambda.run();

	}

}
