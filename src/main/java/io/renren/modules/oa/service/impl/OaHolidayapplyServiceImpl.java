package io.renren.modules.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.oa.dao.OaHolidayapplyDao;
import io.renren.modules.oa.entity.OaHolidayapplyEntity;
import io.renren.modules.oa.service.OaHolidayapplyService;


@Service("oaHolidayapplyService")
public class OaHolidayapplyServiceImpl extends ServiceImpl<OaHolidayapplyDao, OaHolidayapplyEntity> implements OaHolidayapplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<OaHolidayapplyEntity> page = this.selectPage(
                new Query<OaHolidayapplyEntity>(params).getPage(),
                new EntityWrapper<OaHolidayapplyEntity>()
        );

        return new PageUtils(page);
    }

}
