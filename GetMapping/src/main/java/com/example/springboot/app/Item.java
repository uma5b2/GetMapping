package com.example.springboot.app;

public class Item 
{
	private int itemNo;
	private String itemDesc;
	private float itemPrice;
	public Item(int itemNo, String itemDesc, float itemPrice) {
		super();
		this.itemNo = itemNo;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	

}
