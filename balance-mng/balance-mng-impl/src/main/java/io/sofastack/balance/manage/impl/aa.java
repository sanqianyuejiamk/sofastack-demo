//package io.sofastack.balance.manage.impl;
//
///**
// * @author mengka
// * @version 2021/4/16
// * @since
// */
//public class aa {
//
//    def strs = ["com.aliyun.fsi.insurance.agrmtexecution.claim.facade.request.ReadClaimRequest"] as String[];
//    def value = [paramter.get("param")] as Object[];
//    com.aliyun.fsi.insurance.risk.base.util.ServiceUtil serviceUtil = (com.aliyun.fsi.insurance.risk.base.util.ServiceUtil)paramter.get("serviceUtil");
//    java.lang.Object o=serviceUtil.excuteService("com.aliyun.fsi.insurance.agrmtexecution.claim.facade.ClaimFacade","readClaim",strs,value);
//    java.util.List<String> sList=new java.util.ArrayList<String>();
//    java.math.BigDecimal claitLossMoney=new java.math.BigDecimal(0);
//return o.getData();
//if(!org.springframework.util.CollectionUtils.isEmpty(o.getData().claimedItems)){
//        java.util.List<Object> claimedItemsList = o.getData.claimedItems;
//        for(int i=0;i<claimedItemsList.size();i++){
//            String clmItemNo=claimedItemsList.get(i).clmItemNo;
//            if(clmItemNo.equals(value.clmItemNo[0])){
//                claitLossMoney=claimedItemsList.get(i).claitLossMoney;
//                break;
//            }
//        }
//    }
//return claitLossMoney;
//
//
//    def strs = ["com.aliyun.fsi.insurance.agrmtexecution.claim.facade.request.ReadClaimRequest"] as String[];
//
//    com.alibaba.fastjson.JSONObject jsonObject=new com.alibaba.fastjson.JSONObject();
//jsonObject.put("clmItemNo",paramter.get("clmItemNo"));
//jsonObject.put("clmedApplNo",paramter.get("clmedApplNo"));
//jsonObject.put("claimedItems",paramter.get("claimedItems"));
//    def objs = [jsonObject] as Object[];
//
//    com.aliyun.fsi.insurance.risk.base.util.ServiceUtil serviceUtil = (com.aliyun.fsi.insurance.risk.base.util.ServiceUtil)paramter.get("serviceUtil");
//    java.lang.Object o=serviceUtil.excuteService("com.aliyun.fsi.insurance.agrmtexecution.claim.facade.ClaimFacade","readClaim",strs,objs);
//    java.util.List<String> sList=new java.util.ArrayList<String>();
//    java.math.BigDecimal claitLossMoney=new java.math.BigDecimal(0);
//return o.getData();
//if(!org.springframework.util.CollectionUtils.isEmpty(o.getData().claimedItems)){
//        java.util.List<Object> claimedItemsList = o.getData.claimedItems;
//        for(int i=0;i<claimedItemsList.size();i++){
//            String clmItemNo=claimedItemsList.get(i).clmItemNo;
//            if(clmItemNo.equals(objs.clmItemNo[0])){
//                claitLossMoney=claimedItemsList.get(i).claitLossMoney;
//                break;
//            }
//        }
//    }
//return claitLossMoney;
//
//}
