package com.entity.model;

import com.entity.CepingjieguofenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 测评结果分析
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
public class CepingjieguofenxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 测试试卷
	 */
	
	private String ceshishijuan;
		
	/**
	 * 测试成绩
	 */
	
	private String ceshichengji;
		
	/**
	 * 测评结果分析
	 */
	
	private String cepingjieguofenxi;
		
	/**
	 * 测试日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ceshiriqi;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：测试试卷
	 */
	 
	public void setCeshishijuan(String ceshishijuan) {
		this.ceshishijuan = ceshishijuan;
	}
	
	/**
	 * 获取：测试试卷
	 */
	public String getCeshishijuan() {
		return ceshishijuan;
	}
				
	
	/**
	 * 设置：测试成绩
	 */
	 
	public void setCeshichengji(String ceshichengji) {
		this.ceshichengji = ceshichengji;
	}
	
	/**
	 * 获取：测试成绩
	 */
	public String getCeshichengji() {
		return ceshichengji;
	}
				
	
	/**
	 * 设置：测评结果分析
	 */
	 
	public void setCepingjieguofenxi(String cepingjieguofenxi) {
		this.cepingjieguofenxi = cepingjieguofenxi;
	}
	
	/**
	 * 获取：测评结果分析
	 */
	public String getCepingjieguofenxi() {
		return cepingjieguofenxi;
	}
				
	
	/**
	 * 设置：测试日期
	 */
	 
	public void setCeshiriqi(Date ceshiriqi) {
		this.ceshiriqi = ceshiriqi;
	}
	
	/**
	 * 获取：测试日期
	 */
	public Date getCeshiriqi() {
		return ceshiriqi;
	}
			
}
