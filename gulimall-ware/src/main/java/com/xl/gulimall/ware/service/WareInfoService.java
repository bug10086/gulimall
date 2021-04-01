package com.xl.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xl.common.utils.PageUtils;
import com.xl.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author xilieao
 * @email suiyueanhao@gmail.com
 * @date 2021-04-01 20:24:05
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

