package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdnElemnts {

	public static void main(String[] args) {
		boolean val;
	WebDriver wd= new ChromeDriver();
	wd.get("https://courses.letskodeit.com/practice");
	wd.manage().window().maximize();;
	wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 val = wd.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
	System.out.println(val);
	wd.findElement(By.cssSelector("input#hide-textbox")).click();
val = wd.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
	System.out.println(val);
	
	
	}

}
