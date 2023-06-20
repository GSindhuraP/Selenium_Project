package package1;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rdbuttonexample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd= new ChromeDriver();
		java.util.List<WebElement> li;
		wd.get("https://courses.letskodeit.com/practice");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	String we = wd.findElement(By.xpath("//input[@id='bmwradio']")).getAttribute("value");
	wd.findElement(By.xpath("//input[@id='bmwradio']")).getText();
		Thread.sleep(1000);
		wd.findElement(By.xpath("//input[@id='benzradio']")).click();
		wd.findElement(By.xpath("//input[@id='hondaradio']")).click();
	 li =wd .findElements(By.xpath("//input[@name='cars']  [@type='radio']"));
	 int s=li.size();
		System.out.println(li.size());
		for(int i=0;i<=s-1;i++)
		{
			System.out.println(li.get(i).getText());
		}
		
	}

}
