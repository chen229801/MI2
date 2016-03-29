package com.mi2.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("GOODS", "GOODS_ID", Goods.class);
		// Composite Primary Key order: GOODS_ID,GOODS_SMALL_TYPE_ID
		arp.addMapping("GOODS_ADAPTER_PHONE", "GOODS_ID,GOODS_SMALL_TYPE_ID", GoodsAdapterPhone.class);
		arp.addMapping("GOODS_ADDRIBUTE", "GOODS_ADDRIBUTE_ID", GoodsAddribute.class);
		arp.addMapping("GOODS_ADDRIBUTE_VAL", "GOODS_ADDRIBUTE_VAL_ID", GoodsAddributeVal.class);
		arp.addMapping("GOODS_ASSESS", "GOODS_ASSESS_ID", GoodsAssess.class);
		arp.addMapping("GOODS_BIG_TYPE", "GOODS_BIG_TYPE_ID", GoodsBigType.class);
		arp.addMapping("GOODS_COLOR", "GOODS_COLOR_ID", GoodsColor.class);
		arp.addMapping("GOODS_IMAGES", "GOODS_IMAGES_ID", GoodsImages.class);
		arp.addMapping("GOODS_SMALL_TYPE", "GOODS_SMALL_TYPE_ID", GoodsSmallType.class);
		// Composite Primary Key order: MENU_ID,ROLE_GROUP_ID
		arp.addMapping("GROUP_MENU", "MENU_ID,ROLE_GROUP_ID", GroupMenu.class);
		arp.addMapping("PHONE_MODEL", "MODEL_ID", PhoneModel.class);
		arp.addMapping("PHONE_SETMEAL", "PHONE_SETMEAL_ID", PhoneSetmeal.class);
		arp.addMapping("PHONE_SETMEAL_DETAIL", "PHONE_SETMEAL_DETAIL_ID", PhoneSetmealDetail.class);
		arp.addMapping("PHONE_VERSION", "PHONE_GOODS_ID", PhoneVersion.class);
		arp.addMapping("SYS_MENU", "MENU_ID", SysMenu.class);
		arp.addMapping("SYS_ROLE_GROUP", "ROLE_GROUP_ID", SysRoleGroup.class);
		arp.addMapping("USERS_BACKSTAGE", "USERS_BACKSTAGE_ID", UsersBackstage.class);
		arp.addMapping("USERS_DELIVERY_ADDRESS", "USERS_DELIVERY_ADDRESS_ID", UsersDeliveryAddress.class);
		arp.addMapping("USERS_FRONT", "USER_FRONT_ID", UsersFront.class);
		arp.addMapping("USERS_ORDERS", "ORDERS_ID", UsersOrders.class);
		arp.addMapping("USERS_ORDERS_DETAIL", "ORDERS_DETAILS_ID", UsersOrdersDetail.class);
		arp.addMapping("USERS_SHOPPINGCAR", "USERS_SHOPPING_ID", UsersShoppingcar.class);
		arp.addMapping("PHONE_GOODS_VIEW",PhoneGoodsView.class);
	}
}

