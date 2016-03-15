package com.base.model;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGoodsSmallType<M extends BaseGoodsSmallType<M>> extends Model<M> implements IBean {

	public void setGoodsSmallTypeId(java.math.BigDecimal goodsSmallTypeId) {
		set("GOODS_SMALL_TYPE_ID", goodsSmallTypeId);
	}

	public java.math.BigDecimal getGoodsSmallTypeId() {
		return get("GOODS_SMALL_TYPE_ID");
	}

	public void setGoodsBigTypeId(java.math.BigDecimal goodsBigTypeId) {
		set("GOODS_BIG_TYPE_ID", goodsBigTypeId);
	}

	public java.math.BigDecimal getGoodsBigTypeId() {
		return get("GOODS_BIG_TYPE_ID");
	}

	public void setGoodsSmallTypeName(java.lang.String goodsSmallTypeName) {
		set("GOODS_SMALL_TYPE_NAME", goodsSmallTypeName);
	}

	public java.lang.String getGoodsSmallTypeName() {
		return get("GOODS_SMALL_TYPE_NAME");
	}

}