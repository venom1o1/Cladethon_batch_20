package com.zensar.scm.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer productId;
	private String productName;
	private String productDesc;
	private Double price;
	private Integer quantity;
	private Date createdDate;
	
	
}
