package com.imooc.model.appearance;

import java.math.BigDecimal;

/*
 * 利用外观模式封装银行业务
为减少问题规模，我们仅模拟一个人（小张）的银行业务功能.假设小张有两张银行卡：分别是中国银行和中国建设银行的银行卡。我们仿真实现的包括如下：功能：
1可以向任意银行可存钱。
2：可以从任意的银行卡取钱
3可以从一张银行卡向另一个张银行卡转账
//银行功能类
*/
public class Bank {
	String mark;//银行标识
	String No;//银行账号
	BigDecimal money;//余额
	public Bank(String mark,String No,BigDecimal money){
		this.mark=mark;
		this.No=No;
		this.money=money;
	}
	//存钱
	public void save(BigDecimal value) {
		money = money.add(value);
	}
	//取钱
	public boolean fetch(BigDecimal value) {
		if(money.compareTo(value) > -1) {
			money = money.subtract(value);
		}else {
			return false;
		}
		return true;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
}
