package com.entity.view;

import com.entity.ZuoyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业信息
 * 后端返回视图实体辅助类
 */
@TableName("zuoyexinxi")
public class ZuoyexinxiView  extends ZuoyexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyexinxiView(){
	}
 
 	public ZuoyexinxiView(ZuoyexinxiEntity zuoyexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
