package logexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogTest extends BaseTest {

	String Actual="iphone 14";
	String Expected="iphone 14 pro max";
	
	@Test
	public void login()
	
	{
		AssertExample.Assert(Actual, Expected);
	}
	
	
}
