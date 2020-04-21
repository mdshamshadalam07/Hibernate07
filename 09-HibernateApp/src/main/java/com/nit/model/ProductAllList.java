package com.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prodtab")

public class ProductAllList {
@Id
@Column(name="prodid")
private Integer ProdId;

@Column(name="prodcode")
private String ProdCode;

@Column(name="prodcost")
private Double ProdCost;

public ProductAllList() {
	super();
}

public Integer getProdId() {
	return ProdId;
}

public void setProdId(Integer prodId) {
	ProdId = prodId;
}

public String getProdCode() {
	return ProdCode;
}

public void setProdCode(String prodCode) {
	ProdCode = prodCode;
}

public Double getProdCost() {
	return ProdCost;
}

public void setProdCost(Double prodCost) {
	ProdCost = prodCost;
}

@Override
public String toString() {
	return "ProductAllList [ProdId=" + ProdId + ", ProdCode=" + ProdCode + ", ProdCost=" + ProdCost + "]";
}
}
