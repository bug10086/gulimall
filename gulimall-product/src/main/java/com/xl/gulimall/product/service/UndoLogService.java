package com.xl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xl.common.utils.PageUtils;
import com.xl.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xilieao
 * @email suiyueanhao@gmail.com
 * @date 2021-04-01 15:54:39
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

