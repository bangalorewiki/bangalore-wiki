/**
 * @author : Ananth Kumar C
 * @Creted on : 18-Oct-2012
 */
package com.projects.wiki.bwiki.db;

import java.util.Comparator;

public class Club extends ParentData{
	private int no;
	private String name;
	private String address;
	private String pinCode;
	private String phoneNo;
	private String contactPerson;
	private int members;
	private String grade;
	
	public Club() {
		this.category = "Clubs";
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
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public static Comparator<Club> NameComparator = new Comparator<Club>() {
		public int compare(Club p1, Club p2) {
			String str1 = p1.getName().toUpperCase();
			String str2 = p2.getName().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
	public static Comparator<Club> FootfallComparator = new Comparator<Club>() {
		public int compare(Club p1, Club p2) {
			
			int i1 = p1.getMembers();
			int i2 = p2.getMembers();
			// ascending order
			if(i1 > i2)
	            return 1;
	        else if(i1 < i2)
	            return -1;
	        else
	            return 0;
		}
	};
	
	public static Comparator<Club> RatingComparator = new Comparator<Club>() {
		public int compare(Club p1, Club p2) {
			System.out.println();
			String str1 = p1.getGrade().toUpperCase();
			String str2 = p2.getGrade().toUpperCase();
			System.out.println(str1);
			// ascending order
			return str1.compareTo(str2);
		}
	};	
}
