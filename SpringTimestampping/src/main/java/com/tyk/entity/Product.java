package com.tyk.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Product_Data")
public class Product {
	@Id
	private int productId;
	
	private String productName;
	
	private double productPrice;
	
	@CreationTimestamp
	@Column(name="Created_Date",updatable = false)
	private LocalDateTime createdDate;
	@UpdateTimestamp
	@Column(name="Updated_Date",insertable = false)
	private LocalDateTime updatedDate;
	

}
