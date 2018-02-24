package qsp.grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        DesiredCapabilities v=DesiredCapabilities.firefox();
				WebDriver driver=new RemoteWebDriver(v);
				driver.quit();
	}

}
