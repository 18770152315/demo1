package baidu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu {
	public static WebDriver driver;
	public void open() {
		// TODO Auto-generated method stub
		//打开谷歌浏览器
        System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
        driver=new ChromeDriver();
		//输入网址，进入百度页面
		driver.get("https://www.baidu.com");
		
	}
}
