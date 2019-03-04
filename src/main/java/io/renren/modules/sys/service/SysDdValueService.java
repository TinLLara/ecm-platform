package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.SysDdValueEntity;

import java.util.Map;

/**
 * 
 *
 * @author tin
 * @email 286185834@qq.com
 * @date 2019-03-01 11:49:45
 */
public interface SysDdValueService extends IService<SysDdValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

