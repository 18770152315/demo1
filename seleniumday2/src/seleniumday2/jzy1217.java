package seleniumday2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jzy1217 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.baidu.com");//1
        
       
        String a=driver.findElement(By.xpath("//*[@id='u1']/a[7]")).getText();
        if(a.equals("µÇÂ¼")){
        	driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();
    	    Thread.sleep(2000);
    		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__footerULoginBtn']")).click();//2
    		driver.findElement(By.id("TANGRAM__PSP_10__userName")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.id("TANGRAM__PSP_10__password")).click();
    		Set<Cookie>b=driver.manage().getCookies();
    		for(Cookie s:b){
            System.out.println(s.getName());
            System.out.println(s.getValue());
    	    }
        }
        else{
        	System.out.println("Î´µÇÂ¼");
        	
    		Set<Cookie>b=driver.manage().getCookies();
    		for(Cookie s:b){
            System.out.println(s.getName());
            System.out.println(s.getValue());
        	
        }	
	}
	}
	}
