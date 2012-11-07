/**
 * 
 */
package com.projects.wiki.bwiki.db;

import java.util.Comparator;

public class Pub extends ParentData{
	private int no;
	private String name;
	private String address;
	private String contact;
	private int capacity;
	private String rating;
	
	public Pub() {
		this.category = "Pubs";
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
	
	public static Comparator<Pub> NameComparator = new Comparator<Pub>() {
		public int compare(Pub p1, Pub p2) {
			String str1 = p1.getName().toUpperCase();
			String str2 = p2.getName().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
	public static Comparator<Pub> CapacityComparator = new Comparator<Pub>() {
		public int compare(Pub p1, Pub p2) {
			
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
	
	public static Comparator<Pub> RatingComparator = new Comparator<Pub>() {
		public int compare(Pub p1, Pub p2) {
			
			String str1 = p1.getRating().toUpperCase();
			String str2 = p2.getRating().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
}
