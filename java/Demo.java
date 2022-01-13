package object;

 public class Demo {
	void call()
	{
		System.out.println("calling");
	}
	abstract void playmusic()
	{
		System.out.println("playing music");
	}

	public static void main(String[] args) {
		Demo d1=new Demo();
				d1.call();
				Demo d2=new Demo();
				d2.playmusic();
		// TODO Auto-generated method stub

	}

}
