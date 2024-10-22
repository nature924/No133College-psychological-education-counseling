package com.dao;

import com.entity.CepingjieguofenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CepingjieguofenxiVO;
import com.entity.view.CepingjieguofenxiView;


/**
 * 测评结果分析
 * 
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
public interface CepingjieguofenxiDao extends BaseMapper<CepingjieguofenxiEntity> {
	
	List<CepingjieguofenxiVO> selectListVO(@Param("ew") Wrapper<CepingjieguofenxiEntity> wrapper);
	
	CepingjieguofenxiVO selectVO(@Param("ew") Wrapper<CepingjieguofenxiEntity> wrapper);
	
	List<CepingjieguofenxiView> selectListView(@Param("ew") Wrapper<CepingjieguofenxiEntity> wrapper);

	List<CepingjieguofenxiView> selectListView(Pagination page,@Param("ew") Wrapper<CepingjieguofenxiEntity> wrapper);
	
	CepingjieguofenxiView selectView(@Param("ew") Wrapper<CepingjieguofenxiEntity> wrapper);
	
}
