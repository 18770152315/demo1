package seleniumday2;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class js1217 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // driver.get("https://www.cnblogs.com/");//��¼
	//	Select select=new Select(driver.findElement(By.id()));
        String url="F:\\�����ļ���\\�������\\�μ�\\selenium�̰�\\pop.html";
        driver.get(url);
        driver.findElement(By.id("goo")).click();
        String s=driver.getWindowHandle();
        String Url1="https://www.baidu.com/";
		Set<String> winandle=driver.getWindowHandles();
		for(String h:winandle){
			if(h.equals(s)){                  
				System.out.println("�ٶ�ҳ��");
				continue;
			}
			else{
				driver.switchTo().window(h);
				driver.findElement(By.id("kw")).sendKeys("ӣ������");
				//System.out.println("�ǰٶ�ҳ��");
				break;
			}
		}
	}

}
