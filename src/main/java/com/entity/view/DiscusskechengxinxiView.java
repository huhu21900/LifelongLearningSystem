package com.entity.view;

import com.entity.DiscusskechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程信息评论表
 */
@TableName("discusskechengxinxi")
public class DiscusskechengxinxiView  extends DiscusskechengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskechengxinxiView(){
	}
 
 	public DiscusskechengxinxiView(DiscusskechengxinxiEntity discusskechengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusskechengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
