package com.imooc.model.decorator;
/**
 * 需求：
 * 菜谱发放全国，特定是通用性，没有考虑地域差异。假设：做白菜和大头菜，，甲希望吃辣的，乙地喜欢吃甜的
 * @author c_wangaimin-001
 *
 */
public interface ICook {
	void cook();//做菜
}
