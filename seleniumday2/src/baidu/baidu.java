package baidu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu {
	public static WebDriver driver;
	public void open() {
		// TODO Auto-generated method stub
		//�򿪹ȸ������
        System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
        driver=new ChromeDriver();
		//������ַ������ٶ�ҳ��
		driver.get("https://www.baidu.com");
		
	}
}
