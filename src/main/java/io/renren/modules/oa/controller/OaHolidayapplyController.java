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

import io.renren.modules.oa.entity.OaHolidayapplyEntity;
import io.renren.modules.oa.service.OaHolidayapplyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 请休假信息表
 *
 * @author tin
 * @email 286185834@qq.com
 * @date 2019-03-06 22:54:53
 */
@RestController
@RequestMapping("oa/oaholidayapply")
public class OaHolidayapplyController {
    @Autowired
    private OaHolidayapplyService oaHolidayapplyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("oa:oaholidayapply:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = oaHolidayapplyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{happlyid}")
    @RequiresPermissions("oa:oaholidayapply:info")
    public R info(@PathVariable("happlyid") String happlyid){
			OaHolidayapplyEntity oaHolidayapply = oaHolidayapplyService.selectById(happlyid);

        return R.ok().put("oaHolidayapply", oaHolidayapply);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("oa:oaholidayapply:save")
    public R save(@RequestBody OaHolidayapplyEntity oaHolidayapply){
			oaHolidayapplyService.insert(oaHolidayapply);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("oa:oaholidayapply:update")
    public R update(@RequestBody OaHolidayapplyEntity oaHolidayapply){
			oaHolidayapplyService.updateById(oaHolidayapply);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("oa:oaholidayapply:delete")
    public R delete(@RequestBody String[] happlyids){
			oaHolidayapplyService.deleteBatchIds(Arrays.asList(happlyids));

        return R.ok();
    }

}
