package com.entity.view;

import com.entity.CepingjieguofenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 测评结果分析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
@TableName("cepingjieguofenxi")
public class CepingjieguofenxiView  extends CepingjieguofenxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CepingjieguofenxiView(){
	}
 
 	public CepingjieguofenxiView(CepingjieguofenxiEntity cepingjieguofenxiEntity){
 	try {
			BeanUtils.copyProperties(this, cepingjieguofenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
