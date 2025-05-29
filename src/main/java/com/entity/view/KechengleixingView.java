package com.entity.view;

import com.entity.KechengleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程类型
 * 后端返回视图实体辅助类
 */
@TableName("kechengleixing")
public class KechengleixingView  extends KechengleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengleixingView(){
	}
 
 	public KechengleixingView(KechengleixingEntity kechengleixingEntity){
 	try {
			BeanUtils.copyProperties(this, kechengleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
