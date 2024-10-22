package com.dao;

import com.entity.XinlijiankangxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinlijiankangxuexiVO;
import com.entity.view.XinlijiankangxuexiView;


/**
 * 心理健康学习
 * 
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
public interface XinlijiankangxuexiDao extends BaseMapper<XinlijiankangxuexiEntity> {
	
	List<XinlijiankangxuexiVO> selectListVO(@Param("ew") Wrapper<XinlijiankangxuexiEntity> wrapper);
	
	XinlijiankangxuexiVO selectVO(@Param("ew") Wrapper<XinlijiankangxuexiEntity> wrapper);
	
	List<XinlijiankangxuexiView> selectListView(@Param("ew") Wrapper<XinlijiankangxuexiEntity> wrapper);

	List<XinlijiankangxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<XinlijiankangxuexiEntity> wrapper);
	
	XinlijiankangxuexiView selectView(@Param("ew") Wrapper<XinlijiankangxuexiEntity> wrapper);
	
}
