package com.imooc.model.decorator;

public class Test {
	@org.junit.Test
	public void test1() throws Exception {
		ILogger existobj = new FileLogger();//已有的日志功能
		ILogger newobj = new XMlLogger(existobj);//新的日志装饰类，对exisobj装饰
		String strs[] = {"how","are","you"};
		for(String s:strs) {
			newobj.log(s);
			Thread.sleep(1000);
		}
		System.out.println("End");
	}
	@org.junit.Test
	public void test() {
		ICook ICook = new ICook()
		PepperDecorator1 obj = (PepperDecorator1) new ICook();
		 obj.cook();
	}
}
