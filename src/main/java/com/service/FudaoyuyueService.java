package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FudaoyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FudaoyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FudaoyuyueView;


/**
 * 辅导预约
 *
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
public interface FudaoyuyueService extends IService<FudaoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FudaoyuyueVO> selectListVO(Wrapper<FudaoyuyueEntity> wrapper);
   	
   	FudaoyuyueVO selectVO(@Param("ew") Wrapper<FudaoyuyueEntity> wrapper);
   	
   	List<FudaoyuyueView> selectListView(Wrapper<FudaoyuyueEntity> wrapper);
   	
   	FudaoyuyueView selectView(@Param("ew") Wrapper<FudaoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FudaoyuyueEntity> wrapper);
   	
}

