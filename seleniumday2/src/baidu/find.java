package baidu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Ѱ��Ԫ��λ��
public class find extends baidu{
   public static WebElement a;
	public void find1(){
		a= driver.findElement(By.className("mnav"));
	}
}
