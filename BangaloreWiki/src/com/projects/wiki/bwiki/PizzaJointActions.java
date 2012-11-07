package com.projects.wiki.bwiki;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.db.PizzaJoint;
import com.projects.wiki.bwiki.db.PoolParlor;
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
		Collections.sort(pizzaJointList, PizzaJoint.NameComparator);
		System.out.println("Its good..."+pizzaJointList.size());
		
		return "success";
	}
	
	public List getPizzaJointList() {
		return pizzaJointList;
	}

	public void setPizzaJointList(List pizzaJointList) {
		this.pizzaJointList = pizzaJointList;
	}

	public String orderByCapacity(){
		System.out.println("Ordering by capacity ...");
		if(pizzaJointList == null) {
			pizzaJointList = BwikiTablesData.getRecords("PizzaJoint");
		}
		Collections.sort(pizzaJointList, PizzaJoint.CapacityComparator);
		return "success";
	}
	
	public String orderByRating(){
		System.out.println("Ordering by Rating ...");
		if(pizzaJointList == null) {
			pizzaJointList = BwikiTablesData.getRecords("PizzaJoint");
		}
		Collections.sort(pizzaJointList, PizzaJoint.RatingComparator);
		return "success";
	}
	
	public String display(){
		return "success";
	}
}
