package com.entity.view;

import com.entity.XinlijiankangxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 心理健康学习
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
@TableName("xinlijiankangxuexi")
public class XinlijiankangxuexiView  extends XinlijiankangxuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinlijiankangxuexiView(){
	}
 
 	public XinlijiankangxuexiView(XinlijiankangxuexiEntity xinlijiankangxuexiEntity){
 	try {
			BeanUtils.copyProperties(this, xinlijiankangxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
