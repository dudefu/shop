package com.d2c.shop.modules.core.service.impl;

import com.d2c.shop.common.api.base.BaseService;
import com.d2c.shop.modules.core.mapper.ShopFlowMapper;
import com.d2c.shop.modules.core.model.ShopFlowDO;
import com.d2c.shop.modules.core.service.ShopFlowService;
import com.d2c.shop.modules.core.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author BaiCai
 */
@Service
public class ShopFlowServiceImpl extends BaseService<ShopFlowMapper, ShopFlowDO> implements ShopFlowService {

    @Autowired
    private ShopService shopService;

    @Override
    @Transactional
    public int doFlowing(ShopFlowDO shopFlow, BigDecimal balance, BigDecimal frozen) {
        this.save(shopFlow);
        return shopService.updateBalance(shopFlow.getShopId(), balance, frozen);
    }

}
