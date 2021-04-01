package com.xl.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xl.common.utils.PageUtils;
import com.xl.gulimall.coupon.entity.SmsCouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author xilieao
 * @email suiyueanhao@gmail.com
 * @date 2021-04-01 17:42:53
 */
public interface SmsCouponService extends IService<SmsCouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

