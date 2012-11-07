/**
 * @author : Ananth Kumar C
 * @Creted on : 18-Oct-2012
 */
package com.projects.wiki.bwiki.db;

import java.util.Comparator;

public class BowlingAlley extends ParentData{
	private int no;
	private String name;
	private String address;
	private int footFalls;
	private String contact;
	private String contactPerson;
	private String rating;
	
	public BowlingAlley() {
		this.category = "Bowling Alleys";
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
	public int getFootFalls() {
		return footFalls;
	}
	public void setFootFalls(int footFalls) {
		this.footFalls = footFalls;
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
	
	public static Comparator<BowlingAlley> NameComparator = new Comparator<BowlingAlley>() {
		public int compare(BowlingAlley p1, BowlingAlley p2) {
			String str1 = p1.getName().toUpperCase();
			String str2 = p2.getName().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
	public static Comparator<BowlingAlley> FootfallComparator = new Comparator<BowlingAlley>() {
		public int compare(BowlingAlley p1, BowlingAlley p2) {
			
			int i1 = p1.getFootFalls();
			int i2 = p2.getFootFalls();
			// ascending order
			if(i1 > i2)
	            return 1;
	        else if(i1 < i2)
	            return -1;
	        else
	            return 0;
		}
	};
	
	public static Comparator<BowlingAlley> RatingComparator = new Comparator<BowlingAlley>() {
		public int compare(BowlingAlley p1, BowlingAlley p2) {
			System.out.println();
			String str1 = p1.getRating().toUpperCase();
			String str2 = p2.getRating().toUpperCase();
			System.out.println(str1);
			// ascending order
			return str1.compareTo(str2);
		}
	};	
}
