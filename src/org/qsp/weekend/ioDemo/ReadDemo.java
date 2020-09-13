package org.qsp.weekend.ioDemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadDemo {
	public static void main(String[] args){
		FileInputStream fis = null;	  
		try{
			fis= new FileInputStream("sData.txt");
			ObjectInputStream ois= new ObjectInputStream(fis); 
			Object o =ois.readObject();
			if(o instanceof Student){
				Student s = (Student) o;
				System.out.println("******");
				System.out.println(s.name + " " +s.dept +" "+s.pecr + " " + s.roll);
			}
			ois.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
