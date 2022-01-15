package object;

abstract class Persistence
{
	abstract void persist();
}
class FilePersistence extends Persistence{
	void persist()
	{
		System.out.println("data saved in file");
	}
}
class DatabasePersistence extends Persistence{
	void persist() {
		System.out.println("data saved in database");
	}
}
public class Client extends Persistence{

	public static void main(String[] args) {
		Persistence obj=new Client();
		obj.persist();
	}
	void persist() {
		System.out.println("persist method from client");
	}
}


		// TODO Auto-generated method stub

	


