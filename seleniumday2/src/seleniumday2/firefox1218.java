package seleniumday2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class firefox1218 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin", "D:\\�������\\selenium�����\\��������\\firefox.exe");//��Ŀ�������
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.taobao.com/");//���Ա���ҳ
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[2]/div[1]/a[1]")).click();//�����¼��ť
		String win2=driver.getWindowHandle(); 
		Thread.sleep(2000);
		Set<String> win1=driver.getWindowHandles();
		for(String h:win1){
			if(h.equals(win2)){                  
				System.out.println("win1");
				continue;
			}
			else{
				driver.switchTo().window(h);
				System.out.println("win2");
				driver.findElement(By.xpath("//*[@id='J_QRCodeLogin']/div[5]/a[1]")).click();//��������¼
				break;
			}
		}
		driver.findElement(By.id("TPL_username_1")).sendKeys("18770152315");//��������
		 Thread.sleep(1000);
		driver.findElement(By.id("TPL_password_1")).sendKeys("16532652655");//�����˺�
		 Thread.sleep(5000);
		WebElement element=driver.findElement(By.id("nc_1_n1z"));
	    (new Actions(driver)).dragAndDropBy(element,258,20).perform();//�϶�����
	    Thread.sleep(3000);
	    driver.findElement(By.id("J_SubmitStatic")).click();
	}

}
