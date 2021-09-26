package com.tcs.eas.rest.apis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;

/**
 * 
 * @author 44745
 *
 */
@ApiModel
public class Inventory implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6820844333408498994L;

	private int inventoryid;
	
	private int productid;

	private int minquantity;

	private int availablequantity;

	public Inventory() {
		
	}
	
	
	public Inventory(int inventoryid, int productid, int minquantity, int availablequantity) {
		super();
		this.inventoryid = inventoryid;
		this.productid = productid;
		this.minquantity = minquantity;
		this.availablequantity = availablequantity;
	}


	/**
	 * @return the inventoryid
	 */
	public int getInventoryid() {
		return inventoryid;
	}

	/**
	 * @param inventoryid the inventoryid to set
	 */
	public void setInventoryid(int inventoryid) {
		this.inventoryid = inventoryid;
	}

	/**
	 * @return the productid
	 */
	public int getProductid() {
		return productid;
	}

	/**
	 * @param productid the productid to set
	 */
	public void setProductid(int productid) {
		this.productid = productid;
	}

	/**
	 * @return the minquantity
	 */
	public int getMinquantity() {
		return minquantity;
	}

	/**
	 * @param minquantity the minquantity to set
	 */
	public void setMinquantity(int minquantity) {
		this.minquantity = minquantity;
	}

	/**
	 * @return the availablequantity
	 */
	public int getAvailablequantity() {
		return availablequantity;
	}

	/**
	 * @param availablequantity the availablequantity to set
	 */
	public void setAvailablequantity(int availablequantity) {
		this.availablequantity = availablequantity;
	}
	
	
	
		
}
