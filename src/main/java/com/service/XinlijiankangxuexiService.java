package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinlijiankangxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinlijiankangxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinlijiankangxuexiView;


/**
 * 心理健康学习
 *
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
public interface XinlijiankangxuexiService extends IService<XinlijiankangxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinlijiankangxuexiVO> selectListVO(Wrapper<XinlijiankangxuexiEntity> wrapper);
   	
   	XinlijiankangxuexiVO selectVO(@Param("ew") Wrapper<XinlijiankangxuexiEntity> wrapper);
   	
   	List<XinlijiankangxuexiView> selectListView(Wrapper<XinlijiankangxuexiEntity> wrapper);
   	
   	XinlijiankangxuexiView selectView(@Param("ew") Wrapper<XinlijiankangxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinlijiankangxuexiEntity> wrapper);
   	
}

