/**
 * @author : Ananth Kumar C
 * @Creted on : 18-Oct-2012
 */
package com.projects.wiki.bwiki.db;

public class Restaurent extends ParentData{
	private int no;
	private String name;
	private String address;
	private String pincode;
	private int contact;
	private String rating;
	private String footfalls;
	
	public Restaurent() {
		this.category = "Restaurants";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getFootfalls() {
		return footfalls;
	}
	public void setFootfalls(String footfalls) {
		this.footfalls = footfalls;
	}
}
