package io.renren.modules.sys.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.Query;
import io.renren.modules.sys.dao.SysDdValueDao;
import io.renren.modules.sys.entity.SysDdValueEntity;
import io.renren.modules.sys.service.SysDdValueService;
import org.springframework.stereotype.Service;
import java.util.Map;
import io.renren.common.utils.PageUtils;



@Service("sysDdValueService")
public class SysDdValueServiceImpl extends ServiceImpl<SysDdValueDao, SysDdValueEntity> implements SysDdValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SysDdValueEntity> page = this.selectPage(
                new Query<SysDdValueEntity>(params).getPage(),
                new EntityWrapper<SysDdValueEntity>()
        );

        return new PageUtils(page);
    }

}
