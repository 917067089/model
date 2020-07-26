package com.imooc.model.decorator;

public abstract class Decorator1 implements ICook{
	ICook obj;
	public Decorator1(ICook obj) {
		this.obj=obj;
	}
}
