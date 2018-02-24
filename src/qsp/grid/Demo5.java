package qsp.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo5 {

	public static void main(String[] args) throws MalformedURLException 
	{
		//URL url=new URL("http://localhost:4444/wd/hub");
	   URL url=new URL("http://192.168.43.138:4444/wd/hub");
	   DesiredCapabilities dc=new DesiredCapabilities();
	   dc.setBrowserName("chrome");
       dc.setVersion("63");
       dc.setPlatform(Platform.WINDOWS);
	   WebDriver driver=new RemoteWebDriver(url,dc);
	   driver.get("https://www.google.co.in/");

	}

}
