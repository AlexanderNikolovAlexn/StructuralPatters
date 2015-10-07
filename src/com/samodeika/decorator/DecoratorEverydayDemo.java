package com.samodeika.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DecoratorEverydayDemo {

	public static void main(String[] args) throws Exception {

		File file = new File("./output.txt");
		file.createNewFile();
		
		FileOutputStream oStream = new FileOutputStream(file);
		
		DataOutputStream doStream = new DataOutputStream(oStream);
		doStream.writeChars("text");
		
		doStream.close();
		oStream.close();
		
	}

}
