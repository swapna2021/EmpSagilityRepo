package com.sagility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoOnObjecStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		

		Person p=new Person("Swapna","555555555",42);
		Person p1=new Person("Amit","66666666",45);
		File file=new File("input.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(p);
		os.writeObject(p1);
		os.close();
		fos.close();
		
		Person p2=new Person();
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream oi=new ObjectInputStream(fis);
		while((p2=(Person)(oi.readObject()))!=null)
			System.out.println(p2);
		
		oi.close();
		fis.close();
		
	}

}
