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
		}
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
