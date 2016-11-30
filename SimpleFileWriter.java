package Serilaization;

import java.io.FileWriter;

public class SimpleFileWriter{


	public static void main(String[] args) {
		try{  
			   FileWriter fw=new FileWriter("c:\\inoesis\\java1\\student1.txt");  
			   fw.write("my name is anil");  
			   fw.close();  
			  }catch(Exception e){System.out.println(e);}  
			  System.out.println("success");  

	}

}
