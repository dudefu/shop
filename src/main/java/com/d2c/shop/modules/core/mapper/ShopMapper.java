package com.d2c.shop.modules.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.d2c.shop.modules.core.model.ShopDO;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author BaiCai
 */
public interface ShopMapper extends BaseMapper<ShopDO> {

    int updateBalance(@Param("id") Long id, @Param("balance") BigDecimal balance, @Param("frozen") BigDecimal frozen);

    int updateDeposit(@Param("id") Long id, @Param("deposit") BigDecimal deposit, @Param("recharge") BigDecimal recharge);

}
