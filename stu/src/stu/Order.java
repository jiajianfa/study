package stu;

import java.io.Serializable;

public class Order implements Serializable {
	
	/**
	 * serialVersionUID:TODO
	 *
	 * @since 1.0.0
	 */
	
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String orderNo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	

}
