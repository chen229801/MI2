package com.base.model;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGoodsAddributeVal<M extends BaseGoodsAddributeVal<M>> extends Model<M> implements IBean {

	public void setGoodsAddributeValId(java.math.BigDecimal goodsAddributeValId) {
		set("GOODS_ADDRIBUTE_VAL_ID", goodsAddributeValId);
	}

	public java.math.BigDecimal getGoodsAddributeValId() {
		return get("GOODS_ADDRIBUTE_VAL_ID");
	}

	public void setGoodsAddributeId(java.math.BigDecimal goodsAddributeId) {
		set("GOODS_ADDRIBUTE_ID", goodsAddributeId);
	}

	public java.math.BigDecimal getGoodsAddributeId() {
		return get("GOODS_ADDRIBUTE_ID");
	}

	public void setGoodsAddributeValName(java.lang.String goodsAddributeValName) {
		set("GOODS_ADDRIBUTE_VAL_NAME", goodsAddributeValName);
	}

	public java.lang.String getGoodsAddributeValName() {
		return get("GOODS_ADDRIBUTE_VAL_NAME");
	}

}