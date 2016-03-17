package com.mi2.model;

import com.base.model.BaseGoodsBigType;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class GoodsBigType extends BaseGoodsBigType<GoodsBigType> {
	public static final GoodsBigType dao = new GoodsBigType();

	@Override
	public List<GoodsBigType> getAllData(GoodsBigType goodsBigType) {
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("select * from goods_big_type gbt where 1=1 ");
		return this.find(sbSql.toString());
	}

	@Override
	public Page<GoodsBigType> getAllDataByPage(int pageNumber, int pageSize, GoodsBigType goodsBigType) {
		StringBuilder sbSql = new StringBuilder();
		sbSql.append("from goods_big_type gbt where 1=1 ");
		ArrayList<Object> values = new ArrayList<>();
		if(goodsBigType!=null&&!goodsBigType.getAttrs().isEmpty()){
			if(StrKit.notBlank(goodsBigType.getGoodsBiglTypeName())){
				sbSql.append(" and gbt.goods_bigl_type_name like ?");
				values.add("%"+goodsBigType.getGoodsBiglTypeName()+"%");
			}
		}
		return this.paginate(pageNumber,pageSize,"select * ",sbSql.toString(),values.toArray());
	}
}
