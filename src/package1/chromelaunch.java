package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromelaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srikanth\\OneDrive\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://google.com");
	wd.manage().window().maximize();
	}

}
