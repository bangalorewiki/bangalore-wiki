package com.projects.wiki.bwiki;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class PizzaJointActions {
	
	private List pizzaJointList;

	private static Set<String> searchableFields = new HashSet<String>();
	
	/**
	 * @return the searchableFields
	 */
	public static Set<String> getSearchableFields() {
		return searchableFields;
	}
	
	/**
	 * @param searchableFields the searchableFields to set
	 */
	public static void setSearchableFields(String sf) {
		searchableFields.add(sf);
	}
	
	public String listSites(){
		if(pizzaJointList == null) {
			pizzaJointList = BwikiTablesData.getRecords("PizzaJoint");
		}
		System.out.println("Its good..."+pizzaJointList.size());
		
		return "success";
	}
	
	public List getPizzaJointList() {
		return pizzaJointList;
	}

	public void setPizzaJointList(List pizzaJointList) {
		this.pizzaJointList = pizzaJointList;
	}

	public String orderByDistance(){
		System.out.println("Ordering by distance ...");
		return "success";
	}
	
	public String orderByRating(){
		System.out.println("Ordering by Rating ...");
		return "success";
	}
	
	public String orderByPlaceType(){
		System.out.println("Ordering by PlaceType ...");
		return "success";
	}
	
	public String display(){
		return "success";
	}
}
