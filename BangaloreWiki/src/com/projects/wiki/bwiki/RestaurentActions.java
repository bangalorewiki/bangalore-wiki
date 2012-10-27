package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class RestaurentActions {
	
	private List restaurentList;

	public List getRestaurentList() {
		return restaurentList;
	}

	public void setRestaurentList(List restaurentList) {
		this.restaurentList = restaurentList;
	}

	public String listSites(){
		restaurentList = BwikiTablesData.getRecords("Restaurent");
		System.out.println("Its good..."+restaurentList.size());
		
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
