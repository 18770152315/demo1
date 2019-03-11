package seleniumday2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;


public class s1210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String url="http://baidu.com";//百度界面
		
		String ur2="https://www.v2ex.com/";
		
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");//打开目标浏览器
		WebDriver driver=new ChromeDriver();
		driver.get(ur2);
		
		//driver.findElement(By.className("tab_current")).click();;
		driver.findElement(By.linkText("程序员")).click();
		List<WebElement> elements= driver.findElements(By.className("page_normal"));
        String a=elements.get(3).getText();
        int now = Integer.parseInt(a);
        if(now==5)
        {
        	System.out.println("正确");
        }
        else{
        	System.out.println("失败");
        }
        
			//elements.get(3).click();
		
	

		
//      String ur3="https://mail.126.com/";
//		List<WebElement> e2= driver.findElements(By.className("count_livid"));
//		String a=e2.get(1).getText();
//		int b = Integer.parseInt(a);
//		System.out.println("点赞为"+b);
	
		//List<WebElement> elements= driver.findElements(By.className("tab"));
		//elements.get(0).click();
		//List<WebElement> elements2=driver.findElements(By.class("top"));                                        
        
	}

}
