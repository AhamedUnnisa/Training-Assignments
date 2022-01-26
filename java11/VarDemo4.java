package java11;


	interface myInt {
		int add(int a, int b);
	}
	class VarDemo4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			var v = (a,b) -> (a + b);
			System.out.println(v.add(2,3));
		}

	}


//var cannot be used with lambda expression