package com.mi2.model;

import com.base.model.BaseGoods;
import com.jfinal.plugin.activerecord.Page;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Goods extends BaseGoods<Goods>{
	public static final Goods dao = new Goods();

	//手机商品分页查询
	public Page<Goods> getPhoneGoodsDataByPage(int pageNumber, int pageSize, Goods goods) {

		return null;
	}

	//其他商品分页查询
	public Page<Goods> getOtherGoodsDataByPage(int pageNumber, int pageSize, Goods goods) {
		return null;
	}
}
