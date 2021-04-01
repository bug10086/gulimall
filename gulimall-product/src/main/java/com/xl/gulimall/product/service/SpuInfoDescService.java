package com.xl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xl.common.utils.PageUtils;
import com.xl.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author xilieao
 * @email suiyueanhao@gmail.com
 * @date 2021-04-01 15:54:39
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

