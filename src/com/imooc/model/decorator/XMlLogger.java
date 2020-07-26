package com.imooc.model.decorator;

import java.util.Date;

public class XMlLogger extends Decorator {

	public XMlLogger(ILogger logger) {
		super(logger);
	}

	@Override
	public void log(String msg) {
		String s="<msg>\r\n"+
				"<content>"+msg+"</content>\r\n"+
				"<times>"+new Date().toString()+"</times>\r\n"+
				"</msg>\r\n";
		logger.log(msg);
	}

}
