package com.base.model;

import com.jfinal.plugin.activerecord.IBean;

/**
 * MyGenerated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGoodsAssess<M extends BaseGoodsAssess<M>> extends BaseModel<M> implements IBean {

	public final static String TABLE_NAME = "GOODS_ASSESS";

	public final static String SQL = "SELECT * FROM GOODS_ASSESS WHERE 1=1 ";

	public void setGoodsAssessId(java.math.BigDecimal goodsAssessId) {
		set("GOODS_ASSESS_ID", goodsAssessId);
	}

	public java.math.BigDecimal getGoodsAssessId() {
		return get("GOODS_ASSESS_ID");
	}

	public void setOrdersDetailsId(java.math.BigDecimal ordersDetailsId) {
		set("ORDERS_DETAILS_ID", ordersDetailsId);
	}

	public java.math.BigDecimal getOrdersDetailsId() {
		return get("ORDERS_DETAILS_ID");
	}

	public void setAssessContent(java.lang.String assessContent) {
		set("ASSESS_CONTENT", assessContent);
	}

	public java.lang.String getAssessContent() {
		return get("ASSESS_CONTENT");
	}

}
