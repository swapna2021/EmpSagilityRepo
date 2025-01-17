package com.sagility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws AgeNotSufficientException, IOException {
		
		Person p1=new Person("Swapna","999999999",13);
		
		if(p1.getAge()<18)
			throw new AgeNotSufficientException("Not eligible");
		
		else
		{
			File file=new File("input.txt");
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p1);
			System.out.println("Person added successfully to file");
			oos.close();
			fos.close();
			
		}
		

	}

}
