/**
 * 
 */
package com.projects.wiki.bwiki.db;

import java.util.Comparator;

public class Disco extends ParentData {
	private int no;
	private String name;
	private String contact_person;
	private String address;
	private String phone_no;
	private int capacity;
	private String rating;
	
	public Disco() {
		this.category = "Discos";
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
	public String getContact_person() {
		return contact_person;
	}
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public static Comparator<Disco> NameComparator = new Comparator<Disco>() {
		public int compare(Disco p1, Disco p2) {
			String str1 = p1.getName().toUpperCase();
			String str2 = p2.getName().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
	public static Comparator<Disco> CapacityComparator = new Comparator<Disco>() {
		public int compare(Disco p1, Disco p2) {
			
			int i1 = p1.getCapacity();
			int i2 = p2.getCapacity();
			
			// ascending order
			if(i1 > i2)
	            return 1;
	        else if(i1 < i2)
	            return -1;
	        else
	            return 0;
		}
	};
	
	public static Comparator<Disco> RatingComparator = new Comparator<Disco>() {
		public int compare(Disco p1, Disco p2) {
			
			String str1 = p1.getRating().toUpperCase();
			String str2 = p2.getRating().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
}
