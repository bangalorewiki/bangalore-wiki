/**
 * 
 */
package com.projects.wiki.bwiki.db;

import java.util.Comparator;

/**
 * @author ntallapa
 *
 */
public class Theatre extends ParentData{
	
	private int no;
	private String name;
	private String address;
	private String pin_code; 
	private String contact_number; 
	private String contact_person; 
	private String rating; 
	private String language;
	
	public String getCategory() {
		this.category = "Movie Theatres";
		return category;
	}
	
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the pin_code
	 */
	public String getPin_code() {
		return pin_code;
	}
	/**
	 * @param pin_code the pin_code to set
	 */
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	/**
	 * @return the contact_number
	 */
	public String getContact_number() {
		return contact_number;
	}
	/**
	 * @param contact_number the contact_number to set
	 */
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	/**
	 * @return the contact_person
	 */
	public String getContact_person() {
		return contact_person;
	}
	/**
	 * @param contact_person the contact_person to set
	 */
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public static Comparator<Theatre> NameComparator = new Comparator<Theatre>() {
		public int compare(Theatre p1, Theatre p2) {
			String str1 = p1.getName().toUpperCase();
			String str2 = p2.getName().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
	public static Comparator<Theatre> RatingComparator = new Comparator<Theatre>() {
		public int compare(Theatre p1, Theatre p2) {
			
			String str1 = p1.getRating().toUpperCase();
			String str2 = p2.getRating().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};
	
	public static Comparator<Theatre> LanguageComparator = new Comparator<Theatre>() {
		public int compare(Theatre p1, Theatre p2) {
			String str1 = p1.getLanguage().toUpperCase();
			String str2 = p2.getLanguage().toUpperCase();
			// ascending order
			return str1.compareTo(str2);
		}
	};

}
