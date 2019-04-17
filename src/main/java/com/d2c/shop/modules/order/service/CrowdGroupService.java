package com.d2c.shop.modules.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.d2c.shop.modules.order.model.CrowdGroupDO;

/**
 * @author BaiCai
 */
public interface CrowdGroupService extends IService<CrowdGroupDO> {

    int doAttend(Long id, String avatars);

    int doCancel(Long id, String avatars);

    void doSendCrowdCoupon(CrowdGroupDO crowdGroup);

}
