package io.renren.modules.oa.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.oa.entity.OaHolidayapplyEntity;

import java.util.Map;

/**
 * 请休假信息表
 *
 * @author tin
 * @email 286185834@qq.com
 * @date 2019-03-06 22:54:53
 */
public interface OaHolidayapplyService extends IService<OaHolidayapplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

