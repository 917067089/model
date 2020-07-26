package com.imooc.model.decorator;

public class PepperDecorator1 extends Decorator1 {//甲希望吃辣的

	public PepperDecorator1(ICook obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	private void addPerpper() {
		//
		System.out.println("添加辣油");
	}
	@Override
	public void cook() {
		// 实现甲地对所有菜菜都要添加辣椒
		addPerpper();
		obj.cook();
	}

}
