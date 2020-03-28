package com.czy.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yangyonglong
 * @version 1.0
 * @className PrintWriterDemo
 * @date 2020-02-04 18:13
 **/
public class PrintWriterDemo {

	public static void main(String[] args) {
		File f = new File("/Users/yangyonglong/Documents/test/test1.txt");

		try {
			FileWriter fileWriter = new FileWriter(f);

			PrintWriter printWriter = new PrintWriter(fileWriter);

			printWriter.println("1111");
			printWriter.println("3fdassa范德萨范德萨发");
			printWriter.println("1113331");
			printWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
