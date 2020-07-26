package com.imooc.model.decorator;

public abstract class Decorator implements ILogger {
	protected ILogger logger;
	public Decorator(ILogger logger) {
		this.logger=logger;
	}
}
