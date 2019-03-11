package io.renren.modules.oa.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.oa.entity.OaYinzsqEntity;

import java.util.Map;

/**
 * 
 *
 * @author tin
 * @email 286185834@qq.com
 * @date 2019-03-11 22:43:03
 */
public interface OaYinzsqService extends IService<OaYinzsqEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

