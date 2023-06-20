package package1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class download_example {

	public static void main(String[] args) {

			//folder creation
	//options
		//pref
		//set values
		//desired capc
		//webdriver
		//verifiyinhg
		
		File  fl;
		fl=new File(UUID.randomUUID().toString());
		fl.mkdir();
		System.out.println(fl.getAbsolutePath());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srikanth\\OneDrive\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		Map<String, Object> pre= new HashMap();
		pre.put("profile.default_content_settings.popups", 0);
		pre.put("download.default_directory", fl.getAbsolutePath());
		op.setExperimentalOption("prefs", pre);
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, op);
		WebDriver wd = new ChromeDriver(cap);
		
		
		wd.get("https://the-internet.herokuapp.com/download");
		wd.manage().window().maximize();
		
		wd.findElement(By.xpath("//*[@id='content']/div/a[4]")).click();
		for(File fi : fl.listFiles())
		{
			System.out.println(fi.getAbsolutePath());
			
		}
		
		fl.delete();
	}

}
