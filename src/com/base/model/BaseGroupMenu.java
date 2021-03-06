package com.base.model;

import com.jfinal.plugin.activerecord.IBean;

/**
 * MyGenerated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGroupMenu<M extends BaseGroupMenu<M>> extends BaseModel<M> implements IBean {

	public final static String TABLE_NAME = "GROUP_MENU";

	public final static String SQL = "SELECT * FROM GROUP_MENU WHERE 1=1 ";

	public void setMenuId(java.math.BigDecimal menuId) {
		set("MENU_ID", menuId);
	}

	public java.math.BigDecimal getMenuId() {
		return get("MENU_ID");
	}

	public void setRoleGroupId(java.math.BigDecimal roleGroupId) {
		set("ROLE_GROUP_ID", roleGroupId);
	}

	public java.math.BigDecimal getRoleGroupId() {
		return get("ROLE_GROUP_ID");
	}

}
