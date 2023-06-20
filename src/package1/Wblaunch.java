package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wblaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\gecko\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();
		String url ="http://microsoft.com";
		wd.get(url);
		wd.wait(2000);
	}

}
