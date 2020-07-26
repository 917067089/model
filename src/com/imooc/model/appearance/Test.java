package com.imooc.model.appearance;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Test {
	@org.junit.Test
	public void test1() {
		Container c = new Container();//创建冷藏室对象
		Freezer f = new Freezer();//创建冷冻室对象
		c.init();f.init();//分别初始化仿真
		c.run();f.run();//分别运行仿真
		c.shutdown();f.shutdown();//分别关闭仿真
	}
	@org.junit.Test
	public void test2() {
		Refrigerator r = new Refrigerator();
		r.init();
		r.run();
		r.shutdown();
	}
	@org.junit.Test
	public void test3() {
		BankFacade fa = new BankFacade();
		fa.saveICBC(new BigDecimal(100));//向工行存100
		fa.displayCIBS();//显示工行信息
		fa.fetchICBC(new BigDecimal(10));//从工行取10元
		fa.displayCIBS();
		fa.fromICBCToCCB(new BigDecimal(50));//向建行转账50
		fa.displayCIBS();//显示工行
		fa.displayCCB();//显示建行
	}
	@org.junit.Test
	public void test4() {
		BankFacade2 fa = new BankFacade2();
		fa.save("ICBC",new BigDecimal(100));//向工行存100
		fa.display();//显示
		fa.save("CCB",new BigDecimal(200));//向建行存100
		fa.display();//显示
		fa.fromAndTo("ICBC",new BigDecimal(50),"CCB");//工行向建行转账50
		fa.display();//显示
	}
	@org.junit.Test
	public void test5() {
		System.out.println(" please input the text path of english");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		MyFacade fa = new MyFacade();
		int n = fa.getWordsNun(path);
		System.out.println("words num:"+n);
		int n2= fa.getWordsNoRepeatNum(path);
		System.out.println("words num no repeat:"+n2);
		Map<String,Integer> m = fa.getWordsAndTimes(path);
		System.out.println(m);
	}
}
