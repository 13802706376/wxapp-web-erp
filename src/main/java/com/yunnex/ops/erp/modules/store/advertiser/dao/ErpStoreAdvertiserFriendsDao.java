package com.yunnex.ops.erp.modules.store.advertiser.dao;

import org.apache.ibatis.annotations.Param;

import com.yunnex.ops.erp.common.persistence.CrudDao;
import com.yunnex.ops.erp.common.persistence.annotation.MyBatisDao;
import com.yunnex.ops.erp.modules.store.advertiser.entity.ErpStoreAdvertiserFriends;

/**
 * 朋友圈广告主开通资料DAO接口
 * @author yunnex
 * @version 2017-12-09
 */
@MyBatisDao
public interface ErpStoreAdvertiserFriendsDao extends CrudDao<ErpStoreAdvertiserFriends> {
	
    ErpStoreAdvertiserFriends getAdvInfo(@Param("erpStoreInfoId") String erpStoreInfoId, 
                                         @Param("shopId") String shopId, @Param("isMain") Integer isMain);
    
}