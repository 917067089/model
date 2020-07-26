package com.imooc.model.decorator;
/**
 * 本来中的log()方法对字符串进行大写，装饰，然后在执行日志的功能，若已经日志功能有N个。则装饰后的字符串可能有N个去处，
 * 若按集成模式，编程，则需要编程N个具体的类，从中可知装饰器模式是采用动态编程的。所以了程序的规模
 * @author c_wangaimin-001
 *
 */
public class UpLogger extends Decorator {
	public UpLogger(ILogger logger) {
		super(logger);
	}
	@Override
	public void log(String msg) {
		msg = msg.toUpperCase();
		logger.log(msg);
	}

}
