package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import io.renren.modules.sys.entity.SysDdValueEntity;
import io.renren.modules.sys.service.SysDdValueService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author tin
 * @email 286185834@qq.com
 * @date 2019-03-01 11:49:45
 */
@RestController
@RequestMapping("generator/sysddvalue")
public class SysDdValueController {
    @Autowired
    private SysDdValueService sysDdValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:dd:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysDdValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:dd:info")
    public R info(@PathVariable("id") Integer id){
			SysDdValueEntity sysDdValue = sysDdValueService.selectById(id);

        return R.ok().put("sysDdValue", sysDdValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:dd:save")
    public R save(@RequestBody SysDdValueEntity sysDdValue){
            sysDdValue.setCreateTime(new Date());
			sysDdValueService.insert(sysDdValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:dd:update")
    public R update(@RequestBody SysDdValueEntity sysDdValue){
			sysDdValueService.updateById(sysDdValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:dd:delete")
    public R delete(@RequestBody Integer[] ids){
			sysDdValueService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
