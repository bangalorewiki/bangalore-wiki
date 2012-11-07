/**
 * 
 */
package com.projects.wiki.bwiki.db;

import java.util.Comparator;

public class CoffeeBar extends ParentData{
	private int no;
	private String name;
	private String address;
	private String contact;
	private String contactPerson;
	private String rating;
	
	public CoffeeBar() {
		this.category = "Coffee Bars";
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public static Comparator<CoffeeBar> NameComparator = new Comparator<CoffeeBar>() {
		public int compare(CoffeeBar p1, CoffeeBar p2) {
			String str1 = p1.getName().toUpperCase();
			String str2 = p2.getName().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
	public static Comparator<CoffeeBar> RatingComparator = new Comparator<CoffeeBar>() {
		public int compare(CoffeeBar p1, CoffeeBar p2) {
			
			String str1 = p1.getRating().toUpperCase();
			String str2 = p2.getRating().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
}
