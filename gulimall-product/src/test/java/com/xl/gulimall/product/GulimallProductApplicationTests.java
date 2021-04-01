package com.xl.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xl.gulimall.product.entity.BrandEntity;
import com.xl.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	private BrandService brandService;

	@Test
	void contextLoads() {
		List<BrandEntity> id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
		System.out.println(id);
	}

}
