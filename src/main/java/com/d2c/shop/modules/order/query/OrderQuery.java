package com.d2c.shop.modules.order.query;

import com.d2c.shop.common.api.annotation.Condition;
import com.d2c.shop.common.api.base.BaseQuery;
import com.d2c.shop.common.api.emuns.ConditionEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author BaiCai
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderQuery extends BaseQuery {

    @Condition(condition = ConditionEnum.EQ)
    @ApiModelProperty(value = "店铺ID")
    private Long shopId;
    @Condition(condition = ConditionEnum.EQ)
    @ApiModelProperty(value = "订单号")
    private String sn;
    @Condition(condition = ConditionEnum.EQ)
    @ApiModelProperty(value = "类型")
    private String type;
    @Condition(condition = ConditionEnum.EQ)
    @ApiModelProperty(value = "状态")
    private String status;
    @Condition(condition = ConditionEnum.EQ)
    @ApiModelProperty(value = "会员ID")
    private Long memberId;
    @Condition(condition = ConditionEnum.EQ)
    @ApiModelProperty(value = "会员账号")
    private String memberAccount;
    @Condition(condition = ConditionEnum.EQ)
    @ApiModelProperty(value = "店铺名称")
    private String shopName;
    @Condition(condition = ConditionEnum.LE, field = "expire_date")
    @ApiModelProperty(value = "过期时间止")
    public Date expireDateR;

}
