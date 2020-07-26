package com.imooc.model.decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class FileLogger implements ILogger {

	@Override
	public void log(String msg) {
		DataOutputStream dos=null;
		try {
			dos = new DataOutputStream(new FileOutputStream("F:\\workspace\\model\\src\\com\\imooc\\model\\decorator\\log.txt",true));
			dos.writeBytes(msg);
			dos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
