package com.base.model;

import com.jfinal.plugin.activerecord.IBean;

/**
 * MyGenerated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGoodsAddribute<M extends BaseGoodsAddribute<M>> extends BaseModel<M> implements IBean {

	public final static String TABLE_NAME = "GOODS_ADDRIBUTE";

	public final static String SQL = "SELECT * FROM GOODS_ADDRIBUTE WHERE 1=1 ";

	public void setGoodsAddributeId(java.math.BigDecimal goodsAddributeId) {
		set("GOODS_ADDRIBUTE_ID", goodsAddributeId);
	}

	public java.math.BigDecimal getGoodsAddributeId() {
		return get("GOODS_ADDRIBUTE_ID");
	}

	public void setGoodsAddributeName(java.lang.String goodsAddributeName) {
		set("GOODS_ADDRIBUTE_NAME", goodsAddributeName);
	}

	public java.lang.String getGoodsAddributeName() {
		return get("GOODS_ADDRIBUTE_NAME");
	}

}
