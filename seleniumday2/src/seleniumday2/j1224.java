package seleniumday2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class j1224 {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//FileHandler.copy(new File("E:\\a\\新建文本文档.txt"),new File("E:\\a1\\5.txt"),".txt");//复制文件
		//FileHandler.createDir(new File("E:\\a2"));   //创建新目录，只能用来创建文件夹		
		//FileHandler.delete(new File("E:\\a2"));      //删除目录
		
		//ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\a.txt"));
	    //oos.writeObject("vjsnkjfkjs");	
	    FileOutputStream out=new FileOutputStream("E:\\a.txt");
        String str="第五人格";	    
	    byte[] b=str.getBytes();
	    for(int i=0;i<b.length;i++){
	    	out.write(b[i]);
	    }
	    
		
	}
}
