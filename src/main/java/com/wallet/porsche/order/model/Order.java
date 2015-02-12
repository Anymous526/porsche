package com.wallet.porsche.order.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Order implements Serializable{

	
	@Override
	public String toString() {
		return "Order [id=" + id + ", serialNo=" + serialNo + ", amount="
				+ amount + ", orderType=" + orderType + "]";
	}

	private static final long serialVersionUID = -5534891883554193405L;
	
	private String id;
	/**
	 * 流水号
	 */
	private String serialNo;
	/**
	 * 订单金额
	 */
	private BigDecimal amount;
	
	
	/**
	 * 订单类型
	 */
	private OrderType orderType;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	private enum OrderType{
		
	}
	
	

}
