package seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class j1218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="C:\\Users\\lalala\\Desktop\\selenium_html\\dragAndDrop.html";
        driver.get(url);
        Actions action=new Actions(driver);
        WebElement element=driver.findElement(By.id("drag"));
        WebElement target=driver.findElement(By.xpath("/html/body/h1"));
        (new Actions(driver)).dragAndDropBy(element,-183,-30).perform();	
//        for(int i=0;i<30;i++)
//        {
//        	action.dragAndDropBy(element, 10, 0).build().perform();
//        }
        
        
        
        
        
        
	}

}
