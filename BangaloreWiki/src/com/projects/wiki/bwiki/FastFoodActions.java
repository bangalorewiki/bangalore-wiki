package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class FastFoodActions {
	
	private List fastFoodList;

	public String listSites(){
		fastFoodList = BwikiTablesData.getRecords("FastFood");
		System.out.println("Its good..."+fastFoodList.size());
		
		return "success";
	}
	
	public List getFastFoodList() {
		return fastFoodList;
	}

	public void setFastFoodList(List fastFoodList) {
		this.fastFoodList = fastFoodList;
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
