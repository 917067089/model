package com.imooc.model.decorator;

public class SugarDecorator1 extends Decorator1 {

	public SugarDecorator1(ICook obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	private void addSugar() {
		System.out.println("添加白糖");
	}

	@Override
	public void cook() {
		// 实现乙地对所有菜的添加白糖
		addSugar();
		obj.cook();
	}

}
