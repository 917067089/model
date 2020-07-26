package com.imooc.model.decorator;

public class Vegetable implements ICook {

	@Override
	public void cook() {
		// 做大白菜
		System.out.println("做大白菜");
	}

}
