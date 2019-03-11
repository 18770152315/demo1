package testbaidu;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class baidu {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
      WebDriver driver;
      ChromeOptions options=new ChromeOptions();
      options.addArguments("C:\\Users\\lalala\\AppData\\Local\\Google\\Chrome\\User Data");
	  DesiredCapabilities capabilities =DesiredCapabilities.chrome();
	  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	  driver=new RemoteWebDriver(new URL("http://192.168.43.102:4444/wd/hub"),capabilities);
	  driver.get("http://www.baidu.com");
	 
	}

}
