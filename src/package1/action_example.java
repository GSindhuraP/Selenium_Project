package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action_example {

	public static void main(String[] args) throws InterruptedException {
		//enter keys 
		//1.sendkeys(keys.Enter)
		//sendkeys(keys.control+ "A")
		//sendKeys(keys.Hord(keys.control,"a"
		//action class a.keydown,a.keyUp
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srikanth\\OneDrive\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://letsskodeit.com/automationpractice/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement we = wd.findElement(By.className("search-field"));
		we.sendKeys(Keys.CLEAR);
		we.sendKeys("Sofa");
		we.sendKeys(Keys.ENTER);
		WebElement we1 = wd.findElement(By.className("woocommerce-result-count"));
		System.out.println(we1.getText());
		WebElement we2 = wd.findElement(By.id("woocommerce-product-search-field-0"));
		we2.sendKeys(Keys.CONTROL + "a");
		we2.sendKeys(Keys.chord(Keys.CLEAR),"chair");
		we2.sendKeys(Keys.chord(Keys.CONTROL+"a"),(Keys.DELETE));
		we2.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
	}

}
