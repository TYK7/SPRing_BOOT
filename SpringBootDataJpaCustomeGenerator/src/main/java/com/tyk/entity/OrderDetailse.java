package com.tyk.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
@Data
@Entity
@Table(name="ORDER_DETAILS")
public class OrderDetailse {
	@Id
	@Column(name="ORDER_ID")
	private String orderId;
	@Column(name="ORDER_BY")
	private String orderBy;
	
	@CreationTimestamp
	@Column(name="ORDER_PLACED_DATE",updatable = false)
	private LocalDate orderDate;

}
