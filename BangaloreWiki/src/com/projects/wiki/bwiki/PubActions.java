package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class PubActions {
	
	private List pubList;

	public List getPubList() {
		return pubList;
	}

	public void setPubList(List pubList) {
		this.pubList = pubList;
	}

	public String listSites(){
		pubList = BwikiTablesData.getRecords("Pub");
		System.out.println("Its good..."+pubList.size());
		
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
