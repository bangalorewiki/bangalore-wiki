package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class PizzaJointActions {
	
	private List pizzaJointList;

	public String listSites(){
		pizzaJointList = BwikiTablesData.getRecords("PizzaJoint");
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
