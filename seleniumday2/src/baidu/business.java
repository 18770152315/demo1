package baidu;
import baidu.*;

public class business extends opreation{	
	static opreation oprea=new opreation();
	public static void main(String[] args) throws InterruptedException{
		new baidu().open();//打开浏览器
		new find().find1();//寻找'新闻'元素
		Thread.sleep(1000);
        oprea.opera();//点击新闻
	
	}
}