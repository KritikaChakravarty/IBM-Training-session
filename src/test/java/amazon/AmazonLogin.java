package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLogin {
	@Test
    public void verifylogin()
    {
    	WebDriver driver = new ChromeDriver();

    	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
    	//driver.findElement(By.xpath("//h2[text()='Shop for your baby by age']//parent::div//following-sibling::div[@class=\"a-cardui-footer\"]//child::a[text()='See more']")).click();
    	
    driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td/input[@type='checkbox']")).click();
    	
    }
}
