package com.imooc.model.appearance;

import java.math.BigDecimal;

/**
 * 
 * @author Administrator
 *
 *1、从任意银行卡存钱
 *	1.1 void saveICBC();//向工商银行存钱
 *	1.2 void saveCCB();向建行存钱
 *2.从任意银行取钱
 *	2.1 boolean fetchICBS
 *	2.1 boolean fetchCCB
 *3.银行转账
 *	3.1 boolean fromICBCToCCB
 *	3.2 boolean fromCCBToICBC
 *4.显示金额
 *	4.1 显示ICBC
 *	4.2显示 CCB
 */
public class BankFacade {
	Bank b = new Bank("ICBC","10000",new BigDecimal("0"));//工行卡
	Bank b2 = new Bank("CCB","20000",new BigDecimal("0"));//健行卡
	void saveICBC(BigDecimal money) {
		b.save(money);
	}
	void saveCCB(BigDecimal money) {
		b2.save(money);
	}
	boolean fetchICBC(BigDecimal money) {
		return b.fetch(money);
	}
	boolean fetchCCB(BigDecimal money) {
		return b2.fetch(money);
	}
	
	boolean fromICBCToCCB(BigDecimal money) {
		boolean bo = b.fetch(money);
		if(bo==false) return false;
		b2.save(money);
		return true;
	}
	boolean fromCCBToICBC(BigDecimal money) {
		boolean bo = b2.fetch(money);
		if(bo==false) return false;
		b.save(money);
		return true;
	}
	
	void displayCIBS() {
		System.out.println(b.mark+"\t"+b.No+"\t"+b.getMoney());
	}
	
	void displayCCB() {
		System.out.println(b2.mark+"\t"+b2.No+"\t"+b2.getMoney());
	}
}
