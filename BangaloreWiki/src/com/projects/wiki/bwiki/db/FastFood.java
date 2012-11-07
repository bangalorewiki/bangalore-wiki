/**
 * @author : Ananth Kumar C
 * @Creted on : 18-Oct-2012
 */
package com.projects.wiki.bwiki.db;

import java.util.Comparator;

public class FastFood extends ParentData{
	private int no;
	private String name;
	private String address;
	private String contact;
	private String pincode;
	private String rating;
	private int footfalls;
	private String contactPerson;
	
	public FastFood() {
		this.category = "Fast Food Centers";
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getFootfalls() {
		return footfalls;
	}
	public void setFootfalls(int footfalls) {
		this.footfalls = footfalls;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	public static Comparator<FastFood> NameComparator = new Comparator<FastFood>() {
		public int compare(FastFood p1, FastFood p2) {
			String str1 = p1.getName().toUpperCase();
			String str2 = p2.getName().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
	public static Comparator<FastFood> FootfallComparator = new Comparator<FastFood>() {
		public int compare(FastFood p1, FastFood p2) {
			
			int i1 = p1.getFootfalls();
			int i2 = p2.getFootfalls();
			// ascending order
			if(i1 > i2)
	            return 1;
	        else if(i1 < i2)
	            return -1;
	        else
	            return 0;
		}
	};
	
	public static Comparator<FastFood> RatingComparator = new Comparator<FastFood>() {
		public int compare(FastFood p1, FastFood p2) {
			
			String str1 = p1.getRating().toUpperCase();
			String str2 = p2.getRating().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
}
