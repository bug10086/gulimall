package com.xl.gulimall.member.dao;

import com.xl.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xilieao
 * @email suiyueanhao@gmail.com
 * @date 2021-04-01 17:57:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
