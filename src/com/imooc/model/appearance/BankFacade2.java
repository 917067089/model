package com.imooc.model.appearance;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BankFacade2 {
	Bank b = new Bank("ICBC","10000",new BigDecimal("0"));//工行卡
	Bank b2 = new Bank("CCB","20000",new BigDecimal("0"));//健行卡
	Map<String,Bank> m = new HashMap<String, Bank>();
	BankFacade2(){
		m.put("ICBC", b);
		m.put("CCB", b2);
	}
	void save(String mark,BigDecimal money){
		Bank bank = m.get(mark);
		bank.save(money);
	}
	boolean fetch(String mark,BigDecimal money) {
		Bank bank = m.get(mark);
		return bank.fetch(money);
	}
	
	boolean fromAndTo(String mark,BigDecimal money,String mark2) {
		Bank bank = m.get(mark);
		boolean b = bank.fetch(money);
		if(b == false)return false;
		Bank to =m.get(mark2);
		to.save(money);
		return true;
	}
	void display() {
		Set<String> set = m.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Bank bank = m.get(key);
			System.out.println(bank.getMark()+"\t"+bank.getNo()+"\t"+bank.getMoney());
		}
	}
}
