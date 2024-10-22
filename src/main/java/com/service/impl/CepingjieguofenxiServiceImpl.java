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


import com.dao.CepingjieguofenxiDao;
import com.entity.CepingjieguofenxiEntity;
import com.service.CepingjieguofenxiService;
import com.entity.vo.CepingjieguofenxiVO;
import com.entity.view.CepingjieguofenxiView;

@Service("cepingjieguofenxiService")
public class CepingjieguofenxiServiceImpl extends ServiceImpl<CepingjieguofenxiDao, CepingjieguofenxiEntity> implements CepingjieguofenxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CepingjieguofenxiEntity> page = this.selectPage(
                new Query<CepingjieguofenxiEntity>(params).getPage(),
                new EntityWrapper<CepingjieguofenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CepingjieguofenxiEntity> wrapper) {
		  Page<CepingjieguofenxiView> page =new Query<CepingjieguofenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CepingjieguofenxiVO> selectListVO(Wrapper<CepingjieguofenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CepingjieguofenxiVO selectVO(Wrapper<CepingjieguofenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CepingjieguofenxiView> selectListView(Wrapper<CepingjieguofenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CepingjieguofenxiView selectView(Wrapper<CepingjieguofenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
