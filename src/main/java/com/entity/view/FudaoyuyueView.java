package com.entity.view;

import com.entity.FudaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 辅导预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
@TableName("fudaoyuyue")
public class FudaoyuyueView  extends FudaoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FudaoyuyueView(){
	}
 
 	public FudaoyuyueView(FudaoyuyueEntity fudaoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, fudaoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
