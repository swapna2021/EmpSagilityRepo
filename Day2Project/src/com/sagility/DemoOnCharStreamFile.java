package com.sagility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class DemoOnCharStreamFile {

	public static void main(String[] args)throws IOException {
		File file=new File("input.txt");
		FileWriter fw=new FileWriter(file);
		fw.write("Swapna Motupally");
		fw.close();
		
		FileReader fr=new FileReader(file);
		int ch;
		StringBuffer sbf=new StringBuffer();
		while((ch=fr.read())!=-1)
			sbf.append((char)ch);
		System.out.println(sbf);

	}

}
