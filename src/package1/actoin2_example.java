package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actoin2_example {
	
/*	 // Select the Current Address using CTRL + A
    actions.keyDown(Keys.CONTROL);
    actions.sendKeys("a");
    actions.keyUp(Keys.CONTROL);
    actions.build().perform();
    
    // Copy the Current Address using CTRL + C
    actions.keyDown(Keys.CONTROL);
    actions.sendKeys("c");
    actions.keyUp(Keys.CONTROL);
    actions.build().perform();
    
    //Press the TAB Key to Switch Focus to Permanent Address
    actions.sendKeys(Keys.TAB);
    actions.build().perform();
    
    //Paste the Address in the Permanent Address field using CTRL + V
    actions.keyDown(Keys.CONTROL);
    actions.sendKeys("v");
    actions.keyUp(Keys.CONTROL);
    actions.build().perform();
    
    
    //Compare Text of current Address and Permanent Address
    WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
    assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
    
    */
    
	public static void main(String[] args)
	{
		
		WebDriver wd=new ChromeDriver();
		wd.get("https://demoqa.com/text-box");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		WebElement we =wd.findElement(By.xpath("//input[@id='userName']"));
		Actions a = new Actions(wd);
		we.sendKeys("dsds");
		a.sendKeys(Keys.CONTROL + "a");
		a.keyDown(Keys.CLEAR);
	a.moveToElement(we).sendKeys("vikhyath");
	a.build().perform();
	
	
		
		
	}

}
