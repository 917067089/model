package com.imooc.model.appearance;

import java.io.File;
import java.io.FileInputStream;

public class ReadFile {
	public byte[] readFile(String strPath) {
		byte buf[] = null;
		File f = new File(strPath);
		long len = f.length();
		buf = new byte[(int) len];
		try {
			FileInputStream in = new FileInputStream(strPath);
			in.read(buf);
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buf;
	}
	public String readFile2(String strPath) {
		byte buf [] = readFile(strPath);
		String s = new String(buf);
		return s;
	}
}
