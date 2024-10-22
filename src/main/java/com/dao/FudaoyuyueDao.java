package com.dao;

import com.entity.FudaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FudaoyuyueVO;
import com.entity.view.FudaoyuyueView;


/**
 * 辅导预约
 * 
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
public interface FudaoyuyueDao extends BaseMapper<FudaoyuyueEntity> {
	
	List<FudaoyuyueVO> selectListVO(@Param("ew") Wrapper<FudaoyuyueEntity> wrapper);
	
	FudaoyuyueVO selectVO(@Param("ew") Wrapper<FudaoyuyueEntity> wrapper);
	
	List<FudaoyuyueView> selectListView(@Param("ew") Wrapper<FudaoyuyueEntity> wrapper);

	List<FudaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<FudaoyuyueEntity> wrapper);
	
	FudaoyuyueView selectView(@Param("ew") Wrapper<FudaoyuyueEntity> wrapper);
	
}
