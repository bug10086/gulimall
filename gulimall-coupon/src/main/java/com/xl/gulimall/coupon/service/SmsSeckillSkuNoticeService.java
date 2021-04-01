package com.xl.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xl.common.utils.PageUtils;
import com.xl.gulimall.coupon.entity.SmsSeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author xilieao
 * @email suiyueanhao@gmail.com
 * @date 2021-04-01 17:42:52
 */
public interface SmsSeckillSkuNoticeService extends IService<SmsSeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

