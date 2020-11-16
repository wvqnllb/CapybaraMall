package com.wvqnllb.capybaramall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author ninan
 * @email nicnanchim@gmail.com
 * @date 2020-11-16 11:18:56
 */
@Data
@TableName("mq_message")
public class MqMessageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 消息id
	 */
	private String messageId;
	/**
	 * json数据
	 */
	private String content;
	/**
	 * 发送到哪个交换机
	 */
	private String toExchane;
	/**
	 * 路由键
	 */
	private String routingKey;
	/**
	 * 发送数据的类型
	 */
	private String classType;
	/**
	 * 0-已抵达 1-错误抵达
	 */
	private Integer messageStatus;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
