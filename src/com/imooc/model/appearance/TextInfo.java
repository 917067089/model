package com.imooc.model.appearance;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TextInfo {
	/**
	 * 用于计算字节缓冲区戴梦得字符串有多少个单词
	 * @param buf
	 * @return
	 */
	int getWordsNum(byte buf[]) {
		int sum =0;
		ByteArrayInputStream ba = new ByteArrayInputStream(buf);
		Scanner sc = new Scanner(ba);
		while(sc.hasNext()) {
			sum ++;
			sc.next();
		}
		return sum;
	}
	/**
	 * 用户计算多少个单词
	 * @param s
	 * @return
	 */
	int getWordsNum2(String s) {
		return getWordsNum(s.getBytes());
	}
	/**
	 * 用于就算字节缓冲区的字符串有多少个不重复的单词
	 * @param buf
	 * @return
	 */
	int getWordsNoRepeatNum(byte buf[]) {
		ByteArrayInputStream ba = new ByteArrayInputStream(buf);
		Set<String> s = new HashSet();
		Scanner sc = new Scanner(ba);
		while(sc.hasNext()) {
			s.add(sc.next());
		}
		return s.size();
	}
	/**
	 * 用于计算字符串有多少个不重复的单词
	 * @param s
	 * @return
	 */
	int getWordsNoRepatNum2(String s) {
		return getWordsNoRepeatNum(s.getBytes());
	}
	/**
	 * 用于计算字节缓存区的字符串有多少个不重复的单词
	 * @param buf
	 * @return
	 */
	Map<String,Integer> getWordsAndTimes(byte buf []){
		Map<String,Integer> m = new HashMap();
		ByteArrayInputStream ba = new ByteArrayInputStream(buf);
		Scanner sc = new Scanner(ba);
		while(sc.hasNext()) {
			String  word = sc.next();
			Integer iobj = m.get(word);
			if(iobj!=null) {
				iobj++;
				m.put(word, iobj);
			}else {
				m.put(word, new Integer(1));
			}
		}
		return m;
	}
	/**
	 * 用于计算字符串中有多少个不重复的单词及出现的次数
	 * @param s
	 * @return
	 */
	Map<String,Integer> getWordsAndTimes(String s){
		return getWordsAndTimes(s.getBytes());
	}
}
