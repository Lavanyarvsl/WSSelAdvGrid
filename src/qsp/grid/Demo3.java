package qsp.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo3 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		URL url= new URL("http://192.168.43.96:4444/wd/hub");
		
		//URL url= new URL("http://192.168.43.108:4444/wd/hub");
		
		DesiredCapabilities v=DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(url, v);
		//driver.get("https://www.google.co.in/");
		//driver.quit();

	}

}
