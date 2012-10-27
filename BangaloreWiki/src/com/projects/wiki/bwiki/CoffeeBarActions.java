package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class CoffeeBarActions {
	
	private List coffeeBarList;

	public List getCoffeeBarList() {
		return coffeeBarList;
	}

	public void setCoffeeBarList(List coffeeBarList) {
		this.coffeeBarList = coffeeBarList;
	}

	public String listSites(){
		coffeeBarList = BwikiTablesData.getRecords("CoffeeBar");
		System.out.println("Its good..."+coffeeBarList.size());
		
		return "success";
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
