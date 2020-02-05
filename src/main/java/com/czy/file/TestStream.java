package com.czy.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author yangyonglong
 * @version 1.0
 * @className TestStream
 * @date 2020-02-04 17:49
 **/
public class TestStream {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/yangyonglong/Documents/test/test.txt");

		//创建基于文件的输入流
		FileInputStream fis =new FileInputStream(f);
		//创建字节数组，其长度就是文件的长度
		byte[] all =new byte[(int) f.length()];
		//以字节流的形式读取文件所有内容
		try {
			fis.read(all);
			for (byte b : all) {
				//打印出来是65 66
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//每次使用完流，都应该进行关闭
			fis.close();
		}



	}
}
