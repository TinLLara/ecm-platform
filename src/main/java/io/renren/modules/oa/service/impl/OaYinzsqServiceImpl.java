package io.renren.modules.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.oa.dao.OaYinzsqDao;
import io.renren.modules.oa.entity.OaYinzsqEntity;
import io.renren.modules.oa.service.OaYinzsqService;


@Service("oaYinzsqService")
public class OaYinzsqServiceImpl extends ServiceImpl<OaYinzsqDao, OaYinzsqEntity> implements OaYinzsqService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<OaYinzsqEntity> page = this.selectPage(
                new Query<OaYinzsqEntity>(params).getPage(),
                new EntityWrapper<OaYinzsqEntity>()
        );

        return new PageUtils(page);
    }

}
