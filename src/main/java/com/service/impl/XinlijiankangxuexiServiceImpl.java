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


import com.dao.XinlijiankangxuexiDao;
import com.entity.XinlijiankangxuexiEntity;
import com.service.XinlijiankangxuexiService;
import com.entity.vo.XinlijiankangxuexiVO;
import com.entity.view.XinlijiankangxuexiView;

@Service("xinlijiankangxuexiService")
public class XinlijiankangxuexiServiceImpl extends ServiceImpl<XinlijiankangxuexiDao, XinlijiankangxuexiEntity> implements XinlijiankangxuexiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinlijiankangxuexiEntity> page = this.selectPage(
                new Query<XinlijiankangxuexiEntity>(params).getPage(),
                new EntityWrapper<XinlijiankangxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinlijiankangxuexiEntity> wrapper) {
		  Page<XinlijiankangxuexiView> page =new Query<XinlijiankangxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinlijiankangxuexiVO> selectListVO(Wrapper<XinlijiankangxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinlijiankangxuexiVO selectVO(Wrapper<XinlijiankangxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinlijiankangxuexiView> selectListView(Wrapper<XinlijiankangxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinlijiankangxuexiView selectView(Wrapper<XinlijiankangxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
