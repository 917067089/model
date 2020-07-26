package com.imooc.model.appearance;

public class Refrigerator {
	Container c = new Container();
	Freezer f = new Freezer();
	public void init() {
		c.init();f.init();
	}
	public void run() {
		c.run();f.run();
	}
	public void shutdown() {
		c.shutdown();f.shutdown();
	}
}
