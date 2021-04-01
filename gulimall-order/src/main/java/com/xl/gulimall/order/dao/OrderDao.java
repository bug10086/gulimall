package com.xl.gulimall.order.dao;

import com.xl.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xilieao
 * @email suiyueanhao@gmail.com
 * @date 2021-04-01 20:15:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
