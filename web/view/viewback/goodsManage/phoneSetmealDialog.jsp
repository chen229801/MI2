<%@ page import="com.jfinal.kit.JsonKit" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <i class="glyphicon glyphicon-remove font-size16"></i>
    </button>
    <img alt="弹出框" src="../../../images/back/diatopicon.png" style="vertical-align: middle">
    <span class="modal-title font-size16">增加手机套餐</span>
</div>
<form id="phoneSetmealDialogForm" class="form-horizontal" role="form" onsubmit="return phoneSetmealSubmit(this)">
    <input value="${phoneSetmeal.phone_setmeal_id}" name="phoneSetmeal.phone_setmeal_id" type="hidden">
    <div class="modal-body">
        <div class="tab-pane active">
            <fieldset>
                <legend class="m-b-xs font-size16"><span class="must-msg">1.</span>套餐基本信息:</legend>
                <table class="table dialog-table">
                    <tr>
                        <th style="width: 110px;"><span class="must-msg">*&nbsp;</span>所属手机类别:</th>
                        <td style="width: 210px;">
                            <select id="phoneSmallTypeId" name="phoneSetmeal.goods_small_type_id" class="form-control" required="required">
                                <option value="">--请选择--</option>
                                <c:forEach items="${goodsSmallTypeList}" var="gst">
                                    <option ${phoneSetmeal.goods_small_type_id==gst.goods_small_type_id?"selected":""} value="${gst.goods_small_type_id}">${gst.goods_small_type_name}</option>
                                </c:forEach>
                            </select>
                        </td>

                        <th style="width: 110px;"><span class="must-msg">*&nbsp;</span>手机套餐名称:</th>
                        <td>
                            <select name="phoneSetmeal.phone_setmeal_name" class="form-control" required="required">
                                <option value="">--请选择--</option>
                                <option ${phoneSetmeal.phone_setmeal_name=="必备套餐"?"selected":""} value="必备套餐">必备套餐</option>
                                <option ${phoneSetmeal.phone_setmeal_name=="实用套餐"?"selected":""} value="实用套餐">实用套餐</option>
                                <option ${phoneSetmeal.phone_setmeal_name=="全能套餐"?"selected":""} value="全能套餐">全能套餐</option>
                            </select>
                            <%--
                            <input value="${phoneSetmeal.phone_setmeal_name}" name="phoneSetmeal.phone_setmeal_name" type="text" class="form-control" placeholder="手机套餐名称" required="required" maxlength="64">
                            --%>
                        </td>
                    </tr>
                    <tr>
                        <th><span class="must-msg">*&nbsp;</span>当前套餐价格:</th>
                        <td>
                            <input value="${phoneSetmeal.setmeal_price}" name="phoneSetmeal.setmeal_price" type="text" class="form-control" placeholder="当前套餐总价" required="required" pattern="^\d+(\.\d+)?$">
                        </td>

                        <th><span class="must-msg">&nbsp;</span>套餐预览图片:</th>
                        <td>
                            <div class="input-group">
                                <input id="setmeal_preview_image" name="setmeal_preview_image" type="file" class="form-control" placeholder="套餐预览图" accept="image/*">
                                <span class="input-group-addon" style="padding: 1px 5px;">
                                    <img width="30" height="30" alt="套餐预览图" src="${pageContext.request.contextPath}${empty phoneSetmeal.setmeal_preview_image?"/images/avatar-160.png":phoneSetmeal.setmeal_preview_image}">
                                </span>
                            </div>
                        </td>
                    </tr>
                </table>
            </fieldset>
            <fieldset>
                <legend class="m-b-xs font-size16"><span class="must-msg">2.</span>套餐详情信息:</legend>
                <table class="table table-condensed table-bordered table-hover detail-table">
                    <thead>
                        <tr>
                            <th>序号</th>
                            <th>商品名称</th>
                            <th>库存(件)</th>
                            <th>现价(￥)</th>
                            <th>数量(件)</th>
                            <th>预览图片</th>
                            <th>
                                <button onclick="lookupGoodsInfo()" class="btn btn-xs btn-info" type="button">
                                    <i class="glyphicon glyphicon-plus font-size12"></i>
                                    <span>新增</span>
                                </button>
                            </th>
                        </tr>
                    </thead>
                    <tbody id="phoneSetmealGoodsBox">
                        <c:forEach items="${phoneSetmealGoodsList}" var="goods" varStatus="status">
                            <%
                                pageContext.setAttribute("goodsJson", JsonKit.toJson(pageContext.getAttribute("goods")));
                            %>
                            <tr goods_id='${goods.goods_id}' goods='${goodsJson}'>
                                <td>${status.count}</td>
                                <td>${goods.goods_name}</td>
                                <td>${goods.goods_stock}</td>
                                <td>${goods.goods_new_price}</td>
                                <td>
                                    <div class="input-group input-group-sm digital-setting">
                                        <span onclick="minusDigital(this)" class="input-group-addon">－</span>
                                        <input value="${goods.goods_num}" type="text" class="form-control" required readonly>
                                        <span onclick="plusDigital(this)" class="input-group-addon">＋</span>
                                    </div>
                                </td>
                                <td>
                                    <img alt="商品预览图" width="25" height="25" src="${pageContext.request.contextPath}${goods.goods_preview_image}?width=25&height=25"/>
                                </td>
                                <td>
                                    <button onclick="removeTableRow(this)" type="button" class="btn btn-xs btn-info">
                                        <i class="glyphicon glyphicon-floppy-remove font-size12"></i>
                                        <span>删除</span>
                                    </button>
                                </td>
                            </tr>
                        </c:forEach>
                        <!--
                        <tr goods=\'+goods+\'><td>'+goods.rownum_+'</td><td>'+goods.goods_name+'</td><td>'+goods.goods_stock+'</td><td>'+goods.goods_new_price+'</td><td><div class="input-group input-group-sm digital-setting"><span onclick="minusDigital(this)" class="input-group-addon">－</span><input value="1" type="text" class="form-control" required readonly><span onclick="plusDigital(this)" class="input-group-addon">＋</span></div></td><td><img alt="商品预览图" width="25" height="25" src="'+getLocationUrl()+goods.goods_preview_image+'"/></td><td><button onclick="removeTableRow(this)" type="button" class="btn btn-xs btn-info"><i class="glyphicon glyphicon-floppy-remove font-size12"></i><span>删除</span></button></td></tr>
                        -->
                    </tbody>
                </table>
            </fieldset>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-xs btn-info" data-dismiss="modal">
            <i class="glyphicon glyphicon-remove font-size12"></i>
            <span>关闭</span>
        </button>
        <button type="submit" class="btn btn-xs btn-info">
            <i class="glyphicon glyphicon-ok font-size12"></i>
            <span>提交</span>
        </button>
    </div>
</form>

<script type="text/javascript">
    $(function(){
        var command = '${command}';
        if(command=='showRequest'){
            disabledDialogForm('phoneSetmealDialogForm');
        }
    });

    function phoneSetmealSubmit(form){
        var trList = $('#phoneSetmealGoodsBox').children('tr');
        if(trList.length==0){
            toastr.info('套餐详情信息不能为空!');
            return false;
        }

        var setmeal_preview_imageObj = $('#setmeal_preview_image');
        //默认不存在文件上传
        var isExistFile = false;
        var fileElementIdList = new Array(1);
        if(setmeal_preview_imageObj.val()!='' && setmeal_preview_imageObj.val()!=undefined && setmeal_preview_imageObj.val() != null){
            fileElementIdList[0]= 'setmeal_preview_image';
            isExistFile = true;
        }

        var phoneSetmealGoodsList = [];
        trList.each(function(){
            var phoneSetmealGoods = $.parseJSON($(this).attr('goods'));
            phoneSetmealGoods.goods_num = parseInt($(this).find('input').val());
            phoneSetmealGoodsList.push(phoneSetmealGoods);
        });

        var param = $(form).formToJson();
        if(isExistFile){
            for(var index in phoneSetmealGoodsList){
                for(var attrName in phoneSetmealGoodsList[index]){
                    param['phoneSetmealGoodsList['+index+']['+attrName+']'] = phoneSetmealGoodsList[index][attrName];
                }
            }
        }else{
            param.phoneSetmealGoodsList = phoneSetmealGoodsList;
        }

        var command = '${command}';
        if(command=='addRequest'){
            if(isExistFile){
                callBatchFileUploadSubmit('/phoneSetmealCtrl/addFilesData',fileElementIdList,null,'phoneSetmealListBox',param);
            }else {
                callSubmit('/phoneSetmealCtrl/addData', null, 'phoneSetmealListBox', param);
            }
        }else if(command=='updateRequest'){
            if(isExistFile){
                callBatchFileUploadSubmit('/phoneSetmealCtrl/updateFilesData',fileElementIdList,null,'phoneSetmealListBox',param);
            }else{
                callSubmit('/phoneSetmealCtrl/updateData',null,'phoneSetmealListBox',param);
            }
        }
        return false;
    }

    //移除表的行
    function removeTableRow(removeBtn){
        $(removeBtn).parent('td').parent('tr').remove();
    }

    function lookupGoodsInfo(){
        var goodsSmallTypeId = $('#phoneSmallTypeId').val();
        if(goodsSmallTypeId==''){
            toastr.info('请先选择所属手机类别!!');
            return;
        }
        var service = '/goodsCtrl/getLookupDataByPage.action?phone_small_type_id='+goodsSmallTypeId;
        lookupBackPaginationBreak('my_pop_modal_lg',service,1,'pop_modal');
    }
</script>
