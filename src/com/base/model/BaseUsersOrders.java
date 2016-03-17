package com.base.model;

import com.jfinal.plugin.activerecord.IBean;

/**
 * MyGenerated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUsersOrders<M extends BaseUsersOrders<M>> extends BaseModel<M> implements IBean {

	public final static String TABLE_NAME = "USERS_ORDERS";

	public final static String SQL = "SELECT * FROM USERS_ORDERS WHERE 1=1 ";

	public void setOrdersId(java.math.BigDecimal ordersId) {
		set("ORDERS_ID", ordersId);
	}

	public java.math.BigDecimal getOrdersId() {
		return get("ORDERS_ID");
	}

	public void setUserFrontId(java.math.BigDecimal userFrontId) {
		set("USER_FRONT_ID", userFrontId);
	}

	public java.math.BigDecimal getUserFrontId() {
		return get("USER_FRONT_ID");
	}

	public void setUserOrdersId(java.math.BigDecimal userOrdersId) {
		set("USER_ORDERS_ID", userOrdersId);
	}

	public java.math.BigDecimal getUserOrdersId() {
		return get("USER_ORDERS_ID");
	}

	public void setOrdersTime(java.util.Date ordersTime) {
		set("ORDERS_TIME", ordersTime);
	}

	public java.util.Date getOrdersTime() {
		return get("ORDERS_TIME");
	}

	public void setOrdersAddress(java.lang.String ordersAddress) {
		set("ORDERS_ADDRESS", ordersAddress);
	}

	public java.lang.String getOrdersAddress() {
		return get("ORDERS_ADDRESS");
	}

	public void setTelephone(java.lang.String telephone) {
		set("TELEPHONE", telephone);
	}

	public java.lang.String getTelephone() {
		return get("TELEPHONE");
	}

	public void setGoodsSum(java.math.BigDecimal goodsSum) {
		set("GOODS_SUM", goodsSum);
	}

	public java.math.BigDecimal getGoodsSum() {
		return get("GOODS_SUM");
	}

	public void setSumMoney(java.math.BigDecimal sumMoney) {
		set("SUM_MONEY", sumMoney);
	}

	public java.math.BigDecimal getSumMoney() {
		return get("SUM_MONEY");
	}

	public void setOrdersStatus(java.math.BigDecimal ordersStatus) {
		set("ORDERS_STATUS", ordersStatus);
	}

	public java.math.BigDecimal getOrdersStatus() {
		return get("ORDERS_STATUS");
	}

	public void setDiscountAmount(java.math.BigDecimal discountAmount) {
		set("DISCOUNT_AMOUNT", discountAmount);
	}

	public java.math.BigDecimal getDiscountAmount() {
		return get("DISCOUNT_AMOUNT");
	}

	public void setGoodsFreight(java.math.BigDecimal goodsFreight) {
		set("GOODS_FREIGHT", goodsFreight);
	}

	public java.math.BigDecimal getGoodsFreight() {
		return get("GOODS_FREIGHT");
	}

	public void setPaymentMoney(java.math.BigDecimal paymentMoney) {
		set("PAYMENT_MONEY", paymentMoney);
	}

	public java.math.BigDecimal getPaymentMoney() {
		return get("PAYMENT_MONEY");
	}

	public void setName(java.lang.String name) {
		set("NAME", name);
	}

	public java.lang.String getName() {
		return get("NAME");
	}

}
