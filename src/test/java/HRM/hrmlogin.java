package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



    public class hrmlogin extends BaseTest
    {
//    	WebDriver driver = new ChromeDriver();
//    	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//        WebElement username=driver.findElement(By.id("Email"));
//         username.clear();
//        username.sendKeys("admin@yourstore.com");
//      
//       WebElement password=  driver.findElement(By.id("Password"));
//        password.clear();
//        password.sendKeys("admin");
//       driver.findElement(By.className("buttons")).click();
       
  
    
    	
    	

       @Test
       public void verifyLogin() throws Exception {
           
           WebElement txt_Email = driver.findElement(By.xpath("//input[@id='Email']"));
           txt_Email.clear();
           txt_Email.sendKeys(conf.getEmail());
           
           
           
           driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();
           driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(conf.getPass());
           
           driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
           System.out.println("login test case'");
           
           Thread.sleep(4000);
           //validation step
           String actualTitle = driver.getTitle();
           System.out.println("Application Title after login: " + actualTitle);
           
           Thread.sleep(4000);
           //click on Logout
           
           driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
       }

   
    	
    }


