package package1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPractise {
	WebDriver wd;
	

	@SuppressWarnings("deprecation")
	@Before
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srikanth\\OneDrive\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.get("https://courses.letskodeit.com/practice");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	@Test
	public void test() {
		System.out.println(wd.getTitle());
	wd.findElement(By.cssSelector("a[href='/login']")).click();
	String s= wd.getTitle();
	if (s.equalsIgnoreCase("LoginPage"))
	{
		System.out.println("loginpage opened");
		
	}
	boolean check = wd.findElement(By.cssSelector("input[class='form-control input-md']")).isEnabled();
	if(check==true)
	{
		System.out.println("eamil is enabled");
	}
	
	wd.findElement(By.xpath("input[@class='form-control input-md']")).click();
	wd.findElement(By.xpath("input[@class='form-control input-md']")).sendKeys("abc@gmail.com");
	wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("test");
	wd.findElement(By.xpath("//input[@value='Login']")).click();
	wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	String msg=wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[1]/span")).getText();
	System.out.println(msg);
	}
@After
public void close()
{
	

	}


}
