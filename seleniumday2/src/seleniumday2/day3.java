package seleniumday2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day3 {

	private static File screenShotFile;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cnblogs.com/");//��¼
        Thread.sleep(5000);
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.id("cate_item_2"))).perform();//��ͣ�����ĳ��
        driver.findElement(By.xpath("//*[@id='cate_content_block_2']/div[2]/ul/li[1]/a")).click();//���java
        WebElement e= driver.findElement(By.id("zzk_q"));
        e.click();//��������
	    e.sendKeys("java");//�������������java
	    driver.findElement(By.className("search_btn")).click();//������ҿ�  
	    Thread.sleep(8000);//����8�룬�����ֶ���֤
	    WebElement a=driver.findElement(By.id("CountOfResults"));
	    String number=a.getText();//����һ��String���͵ı��������ڱ����ȡ����ֵ
	    int now = Integer.parseInt(number);//ǿת���
	    if(now==0){
	    	File screenShotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShotFile, new File("D:/test.png"));
			System.out.println("�ѽ�ͼ");
	    }
	    else{
	    	System.out.println("�������Ϊ��"+number); 
	    }
	    driver.navigate().back();//����һ��
	}
}
