package z0213;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flight.qunar.com/");
		driver.findElement(By.id("searchTypeSng")).click();
		
		
		
		
		driver.findElement(By.xpath("//*[@id='dfsForm']/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/dl/dd/ul/li[1]/a")).click();

		driver.findElement(By.xpath("//*[@id='dfsForm']/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/dl[1]/dd/ul/li[2]/a")).click();
		driver.findElement(By.className("btn_search")).click();
		
		
	}

}
