package com.entity.model;

import com.entity.MessagesEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 留言板
 * 接收传参的实体类
 */
public class MessagesModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户名
	 */
	
	private String username;
		
	/**
	 * 留言内容
	 */
	
	private String content;
		
	/**
	 * 回复内容
	 */
	
	private String reply;
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
	}
				
	
	/**
	 * 设置：留言内容
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 获取：留言内容
	 */
	public String getContent() {
		return content;
	}
				
	
	/**
	 * 设置：回复内容
	 */
	 
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	/**
	 * 获取：回复内容
	 */
	public String getReply() {
		return reply;
	}
			
}
