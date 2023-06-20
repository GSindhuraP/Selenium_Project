package package1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class responseTest {

	public static void main(String[] args) throws MalformedURLException, IOException {



		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srikanth\\OneDrive\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver wd=(WebDriver) new ChromeDriver();
		wd.get("https://www.tutorialspoint.com/questions/index.php");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			wd.manage().window().maximize();
			 HttpURLConnection c=
				      (HttpURLConnection)new URL("https://www.tutorialspoint.com/questions/index.php").openConnection();
				      // set the HEAD request with setRequestMethod
				      c.setRequestMethod("HEAD");
				      // connection started and get response code
				      c.connect();
				      int r = c.getResponseCode();
				      System.out.println("Http response code: " + r);
				     
		
		

}
}
