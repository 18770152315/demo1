package baidu;
import baidu.*;

public class business extends opreation{	
	static opreation oprea=new opreation();
	public static void main(String[] args) throws InterruptedException{
		new baidu().open();//�������
		new find().find1();//Ѱ��'����'Ԫ��
		Thread.sleep(1000);
        oprea.opera();//�������
	
	}
}