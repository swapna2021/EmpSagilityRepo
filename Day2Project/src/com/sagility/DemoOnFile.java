package com.sagility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOnFile {

	public static void main(String[] args) throws IOException {
		
		File file=new File("input.txt");
//		StringBuffer sb=new StringBuffer();
//		int ch;
//		try {
//			FileInputStream fis=new FileInputStream(file);
//			
//			while((ch=fis.read())!=-1) {
//				sb.append((char)ch);
//				
//			}	
//			
//			System.out.println(sb);
//			
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		System.out.println("end of try catch");
		
		FileOutputStream fos=new FileOutputStream(file);
		String s="new string ";
		fos.write(s.getBytes());

	}

}
