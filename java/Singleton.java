package object;

public class Singleton {
	
	  // public instance initialized when loading the class
	  private static final Singleton instance = new Singleton();
	 
	  private Singleton()
	  {
	    // private constructor
	  }
	  public static Singleton getInstance(){
	        return instance;
	    }
	}

