package com.entity.view;

import com.entity.ZuoyetijiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业提交
 * 后端返回视图实体辅助类
 */
@TableName("zuoyetijiao")
public class ZuoyetijiaoView  extends ZuoyetijiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyetijiaoView(){
	}
 
 	public ZuoyetijiaoView(ZuoyetijiaoEntity zuoyetijiaoEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyetijiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
