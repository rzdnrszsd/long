package com.czy.file;

import com.sun.tools.javac.util.StringUtils;

import java.io.*;

/**
 * @author yangyonglong
 * @version 1.0
 * @className FileReaderDemo
 * @date 2020-02-04 18:06
 **/
public class FileReaderDemo {
	public static void main(String[] args) {
		File f = new File("/Users/yangyonglong/Documents/test/test.txt");

		try {
			FileReader fileReader = new FileReader(f);
			BufferedReader bufferedReader  = new BufferedReader(fileReader);
			while (true){
				String s = bufferedReader.readLine();
				if(null==s){
					break;
				}
				System.out.println(s);
			}



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
