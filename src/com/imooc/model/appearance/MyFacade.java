package com.imooc.model.appearance;

import java.util.Map;

/**
 * 1、显示英文文本文件有多少个单词
 * 2、显示英文文本文件有多少个不重复的单词及出现的次数
 * 3、显示英文文本文件不重复单词及其内容出现的次数
 * @author c_wangaimin-001
 *
 */
public class MyFacade {
	ReadFile rd = new ReadFile();
	TextInfo te = new TextInfo();
	int getWordsNun(String strPath) {
		byte buf [] = rd.readFile(strPath);
		int n = te.getWordsNum(buf);
		return n;
	}
	int getWordsNoRepeatNum(String strPath) {
		byte buf [] = rd.readFile(strPath);
		int n = te.getWordsNoRepeatNum(buf);
		return n;
	}
	Map<String,Integer> getWordsAndTimes(String strPath){
		byte buf [] = rd.readFile(strPath);
		return te.getWordsAndTimes(buf);
	}
}
