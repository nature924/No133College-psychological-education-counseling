package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CepingjieguofenxiEntity;
import com.entity.view.CepingjieguofenxiView;

import com.service.CepingjieguofenxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 测评结果分析
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
@RestController
@RequestMapping("/cepingjieguofenxi")
public class CepingjieguofenxiController {
    @Autowired
    private CepingjieguofenxiService cepingjieguofenxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CepingjieguofenxiEntity cepingjieguofenxi, HttpServletRequest request){
        EntityWrapper<CepingjieguofenxiEntity> ew = new EntityWrapper<CepingjieguofenxiEntity>();
		PageUtils page = cepingjieguofenxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cepingjieguofenxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CepingjieguofenxiEntity cepingjieguofenxi, HttpServletRequest request){
        EntityWrapper<CepingjieguofenxiEntity> ew = new EntityWrapper<CepingjieguofenxiEntity>();
		PageUtils page = cepingjieguofenxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cepingjieguofenxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CepingjieguofenxiEntity cepingjieguofenxi){
       	EntityWrapper<CepingjieguofenxiEntity> ew = new EntityWrapper<CepingjieguofenxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( cepingjieguofenxi, "cepingjieguofenxi")); 
        return R.ok().put("data", cepingjieguofenxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CepingjieguofenxiEntity cepingjieguofenxi){
        EntityWrapper< CepingjieguofenxiEntity> ew = new EntityWrapper< CepingjieguofenxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( cepingjieguofenxi, "cepingjieguofenxi")); 
		CepingjieguofenxiView cepingjieguofenxiView =  cepingjieguofenxiService.selectView(ew);
		return R.ok("查询测评结果分析成功").put("data", cepingjieguofenxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CepingjieguofenxiEntity cepingjieguofenxi = cepingjieguofenxiService.selectById(id);
        return R.ok().put("data", cepingjieguofenxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CepingjieguofenxiEntity cepingjieguofenxi = cepingjieguofenxiService.selectById(id);
        return R.ok().put("data", cepingjieguofenxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CepingjieguofenxiEntity cepingjieguofenxi, HttpServletRequest request){
    	cepingjieguofenxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cepingjieguofenxi);
        cepingjieguofenxiService.insert(cepingjieguofenxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CepingjieguofenxiEntity cepingjieguofenxi, HttpServletRequest request){
    	cepingjieguofenxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cepingjieguofenxi);
        cepingjieguofenxiService.insert(cepingjieguofenxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CepingjieguofenxiEntity cepingjieguofenxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(cepingjieguofenxi);
        cepingjieguofenxiService.updateById(cepingjieguofenxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        cepingjieguofenxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CepingjieguofenxiEntity> wrapper = new EntityWrapper<CepingjieguofenxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = cepingjieguofenxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
