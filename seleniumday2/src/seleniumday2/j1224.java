package seleniumday2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class j1224 {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//FileHandler.copy(new File("E:\\a\\�½��ı��ĵ�.txt"),new File("E:\\a1\\5.txt"),".txt");//�����ļ�
		//FileHandler.createDir(new File("E:\\a2"));   //������Ŀ¼��ֻ�����������ļ���		
		//FileHandler.delete(new File("E:\\a2"));      //ɾ��Ŀ¼
		
		//ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\a.txt"));
	    //oos.writeObject("vjsnkjfkjs");	
	    FileOutputStream out=new FileOutputStream("E:\\a.txt");
        String str="�����˸�";	    
	    byte[] b=str.getBytes();
	    for(int i=0;i<b.length;i++){
	    	out.write(b[i]);
	    }
	    
		
	}
}
