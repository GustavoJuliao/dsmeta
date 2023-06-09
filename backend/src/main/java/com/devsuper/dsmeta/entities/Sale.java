package com.devsuper.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long saleID;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	
	public Sale() {
		
	}


	public Long getSaleID() {
		return saleID;
	}


	public void setSaleID(Long saleID) {
		this.saleID = saleID;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public Integer getVisited() {
		return visited;
	}


	public void setVisited(Integer visited) {
		this.visited = visited;
	}


	public Integer getDeals() {
		return deals;
	}


	public void setDeals(Integer deals) {
		this.deals = deals;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
