package com.entity.view;

import com.entity.JiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师
 * 后端返回视图实体辅助类
 */
@TableName("jiaoshi")
public class JiaoshiView  extends JiaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshiView(){
	}
 
 	public JiaoshiView(JiaoshiEntity jiaoshiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
