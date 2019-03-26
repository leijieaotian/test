package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.GoodsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品管理
 * 
 * @author tiger
 * @email 357683271@qq.com
 * @date 2019-03-06 19:52:59
 */
@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity> {
	
}
