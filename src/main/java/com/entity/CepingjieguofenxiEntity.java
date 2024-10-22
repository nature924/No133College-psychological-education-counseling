package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 测评结果分析
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 11:33:59
 */
@TableName("cepingjieguofenxi")
public class CepingjieguofenxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CepingjieguofenxiEntity() {
		
	}
	
	public CepingjieguofenxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学生号
	 */
					
	private String xueshenghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ceshiriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学生号
	 */
	public void setXueshenghao(String xueshenghao) {
		this.xueshenghao = xueshenghao;
	}
	/**
	 * 获取：学生号
	 */
	public String getXueshenghao() {
		return xueshenghao;
	}
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
