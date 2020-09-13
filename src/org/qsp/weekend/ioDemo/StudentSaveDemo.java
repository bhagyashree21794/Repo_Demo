package org.qsp.weekend.ioDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSaveDemo {
	public static void main(String [] args)
	{
		Student s=new Student();
		s.name="Ankur";
		s.dept="cs";
		s.roll=123;
		s.pecr=73.5;
		FileOutputStream fos;
		ObjectOutputStream ops;
		try {
			fos = new FileOutputStream("sData.txt");
			ops = new ObjectOutputStream(fos);
			ops.writeObject(s);
			ops.close();//to handle costly resource to avoid making program execution slow 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//creating file
		
		
		System.out.println("App end");
	}

}
