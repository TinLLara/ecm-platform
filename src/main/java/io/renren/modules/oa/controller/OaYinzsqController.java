package io.renren.modules.oa.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.oa.entity.OaYinzsqEntity;
import io.renren.modules.oa.service.OaYinzsqService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author tin
 * @email 286185834@qq.com
 * @date 2019-03-11 22:43:03
 */
@RestController
@RequestMapping("oa/oayinzsq")
public class OaYinzsqController {
    @Autowired
    private OaYinzsqService oaYinzsqService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("oa:oayinzsq:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = oaYinzsqService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("oa:oayinzsq:info")
    public R info(@PathVariable("id") String id){
			OaYinzsqEntity oaYinzsq = oaYinzsqService.selectById(id);

        return R.ok().put("oaYinzsq", oaYinzsq);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("oa:oayinzsq:save")
    public R save(@RequestBody OaYinzsqEntity oaYinzsq){
			oaYinzsqService.insert(oaYinzsq);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("oa:oayinzsq:update")
    public R update(@RequestBody OaYinzsqEntity oaYinzsq){
			oaYinzsqService.updateById(oaYinzsq);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("oa:oayinzsq:delete")
    public R delete(@RequestBody String[] ids){
			oaYinzsqService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
