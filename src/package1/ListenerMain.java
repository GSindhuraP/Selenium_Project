package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerMain extends ListenerExample{

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		@SuppressWarnings("deprecation")
		EventFiringWebDriver eventRecorder = new EventFiringWebDriver(wd);
		ListenerExample ecap = new ListenerExample();
		eventRecorder.register(ecap);
		wd.get("https://courses.letskodeit.com/practice");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		eventRecorder.findElement(By.cssSelector("button#openwindow")).click();
		

	}

}
