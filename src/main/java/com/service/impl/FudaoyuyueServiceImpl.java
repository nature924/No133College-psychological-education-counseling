package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FudaoyuyueDao;
import com.entity.FudaoyuyueEntity;
import com.service.FudaoyuyueService;
import com.entity.vo.FudaoyuyueVO;
import com.entity.view.FudaoyuyueView;

@Service("fudaoyuyueService")
public class FudaoyuyueServiceImpl extends ServiceImpl<FudaoyuyueDao, FudaoyuyueEntity> implements FudaoyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FudaoyuyueEntity> page = this.selectPage(
                new Query<FudaoyuyueEntity>(params).getPage(),
                new EntityWrapper<FudaoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FudaoyuyueEntity> wrapper) {
		  Page<FudaoyuyueView> page =new Query<FudaoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FudaoyuyueVO> selectListVO(Wrapper<FudaoyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FudaoyuyueVO selectVO(Wrapper<FudaoyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FudaoyuyueView> selectListView(Wrapper<FudaoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FudaoyuyueView selectView(Wrapper<FudaoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
