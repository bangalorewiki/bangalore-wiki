/**
 * @author : Ananth Kumar C
 * @Creted on : 18-Oct-2012
 */
package com.projects.wiki.bwiki.db;

import java.util.Comparator;

public class BeautyParlor extends ParentData{
	private int no;
	private String address;
	private String email;
	private String contact;
	private int foot_falls;
	private String remarks;
	
	public BeautyParlor() {
		this.category = "Beauty Parlors";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getFoot_falls() {
		return foot_falls;
	}
	public void setFoot_falls(int foot_falls) {
		this.foot_falls = foot_falls;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public static Comparator<BeautyParlor> NameComparator = new Comparator<BeautyParlor>() {
		public int compare(BeautyParlor p1, BeautyParlor p2) {
			String str1 = p1.getName().toUpperCase();
			String str2 = p2.getName().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
	public static Comparator<BeautyParlor> FootfallComparator = new Comparator<BeautyParlor>() {
		public int compare(BeautyParlor p1, BeautyParlor p2) {
			
			int i1 = p1.getFoot_falls();
			int i2 = p2.getFoot_falls();
			// ascending order
			if(i1 > i2)
	            return 1;
	        else if(i1 < i2)
	            return -1;
	        else
	            return 0;
		}
	};
	
	public static Comparator<BeautyParlor> RatingComparator = new Comparator<BeautyParlor>() {
		public int compare(BeautyParlor p1, BeautyParlor p2) {
			
			String str1 = p1.getRating().toUpperCase();
			String str2 = p2.getRating().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
}
