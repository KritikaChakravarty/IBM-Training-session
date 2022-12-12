package logexample;



import java.util.logging.Logger;


import org.junit.After;
import org.junit.Before;

public class BaseTest {
	Logger log;
	
	@Before
	public void launchBrowser()
	{
		Logger log = Logger.getLogger("Launch Browser");
		log.info("Launching an app");
	
		
		
	}
	
	
	
	@After()
	public void closeBrowser()
	{
	log.info("Closing an app");	
	}
}


