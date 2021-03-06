package com.mi2.model;

import com.base.model.BaseGoodsSmallType;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class GoodsSmallType extends BaseGoodsSmallType<GoodsSmallType> {
	public static final GoodsSmallType dao = new GoodsSmallType();

	/**
	 * 获得手机类型并携带该手机类型的最低价格的所有数据
	 * @return
     */
	public List<GoodsSmallType> getPhoneTypeCarryLowPriceAllData(GoodsSmallType t){
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("select gst2.*,gst1.phone_type_small_low_price from(select pm2.goods_small_type_id,min(pm1.phone_model_low_price) phone_type_small_low_price from (select pv.model_id,min(pv.phone_now_price) phone_model_low_price from phone_model pm,phone_version pv where pm.model_id=pv.model_id group by pv.model_id) pm1,phone_model pm2,goods_small_type gst where pm1.model_id=pm2.model_id and pm2.goods_small_type_id=gst.goods_small_type_id group by pm2.goods_small_type_id)gst1,goods_small_type gst2 where gst1.goods_small_type_id=gst2.goods_small_type_id ");
		List<Object> values = new ArrayList<>();
		if(null!=t && !t.getAttrs().isEmpty()){
			if(t.getGoodsSmallTypeId()!=null){
				sbSql.append(" and gst2.goods_small_type_id=?");
				values.add(t.getGoodsSmallTypeId());
			}
		}
		sbSql.append(" order by gst2.goods_small_type_name desc");
		return this.find(sbSql.toString(),values.toArray());
	}

	@Override
	public List<GoodsSmallType> getAllData(GoodsSmallType t) {
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("select * from goods_small_type gst where 1=1 ");
		ArrayList<Object> values = new ArrayList<>();
		if(t!=null&&!t.getAttrs().isEmpty()){
			if(t.getGoodsBigTypeId()!=null){
				sbSql.append(" and gst.goods_big_type_id=?");
				values.add(t.getGoodsBigTypeId());
			}
			if(t.get("isUse",false)){
				sbSql.append(" and exists(select pv.phone_goods_id from phone_model pm,phone_version pv where gst.goods_small_type_id=pm.goods_small_type_id and pm.model_id=pv.model_id) ");
			}
		}
		sbSql.append(" order by gst.goods_small_type_name desc");
		return this.find(sbSql.toString(),values.toArray());
	}

	public List<GoodsSmallType> getNotPhoneAllData(GoodsSmallType t) {
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("select * from goods_small_type gst where gst.goods_big_type_id<>1 ");
		ArrayList<Object> values = new ArrayList<>();
		if(t!=null&&!t.getAttrs().isEmpty()){
			if(t.getGoodsBigTypeId()!=null){
				sbSql.append(" and gst.goods_big_type_id=?");
				values.add(t.getGoodsBigTypeId());
			}
		}
		return this.find(sbSql.toString(),values.toArray());
	}

	@Override
	public Page<GoodsSmallType> getAllDataByPage(int pageNumber, int pageSize, GoodsSmallType goodsSmallType) {
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("from goods_small_type gst,goods_big_type gbt where gst.goods_big_type_id=gbt.goods_big_type_id ");
		ArrayList<Object> values = new ArrayList<>();
		if(goodsSmallType!=null&&!goodsSmallType.getAttrs().isEmpty()){
			if(StrKit.notBlank(goodsSmallType.getGoodsSmallTypeName())){
				sbSql.append(" and gst.goods_small_type_name like ?");
				values.add("%"+goodsSmallType.getGoodsSmallTypeName()+"%");
			}
			if(goodsSmallType.getGoodsBigTypeId()!=null){
				sbSql.append(" and gst.goods_big_type_id = ?");
				values.add(goodsSmallType.getGoodsBigTypeId());
			}
		}
		return this.paginate(pageNumber,pageSize,"select gbt.goods_bigl_type_name,gst.* ",sbSql.toString(),values.toArray());
	}
}
