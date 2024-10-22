package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CepingjieguofenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CepingjieguofenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CepingjieguofenxiView;


/**
 * 测评结果分析
 *
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
public interface CepingjieguofenxiService extends IService<CepingjieguofenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CepingjieguofenxiVO> selectListVO(Wrapper<CepingjieguofenxiEntity> wrapper);
   	
   	CepingjieguofenxiVO selectVO(@Param("ew") Wrapper<CepingjieguofenxiEntity> wrapper);
   	
   	List<CepingjieguofenxiView> selectListView(Wrapper<CepingjieguofenxiEntity> wrapper);
   	
   	CepingjieguofenxiView selectView(@Param("ew") Wrapper<CepingjieguofenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CepingjieguofenxiEntity> wrapper);
   	
}

