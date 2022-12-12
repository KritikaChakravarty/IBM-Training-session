package amazon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


public class DragDrop {

    WebDriver driver;

    @BeforeTest
    public void launchApp() throws Exception {

        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();

    }

    @AfterTest
    public void closeApp() throws Exception {

        Thread.sleep(5000);
        driver.close();

    }

    @Test
    public void verifyRightClickTest() {

        // Create an Object of Actions class

        Actions act = new Actions(driver);

        WebElement myframe = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager')]"));
        driver.switchTo().frame(myframe);
       // driver.switchTo().frame("//iframe[contains(@data-src,'photo-manager')]");

        WebElement src = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement tgt = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content ui-state-default')]"));
        
        act.dragAndDrop(src, tgt).perform();;
        
    }

   



}
