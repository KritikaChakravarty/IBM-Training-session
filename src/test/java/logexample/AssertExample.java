package logexample;

public class AssertExample {
	
	public static void Assert(String Actual,String Expected)
	{
	  if(Actual.equals(Expected))
	  {
		  System.out.println("validation pass");
	  }
	  else {
		  System.out.println("validation failed, actual value:" + Actual);
         
	  }
	}


}