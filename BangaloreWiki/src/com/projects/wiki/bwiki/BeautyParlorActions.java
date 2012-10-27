package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class BeautyParlorActions {
	
	private List parlorList;

	public List getParlorList() {
		return parlorList;
	}

	public void setParlorList(List parlorList) {
		this.parlorList = parlorList;
	}

	public String listSites(){
		parlorList = BwikiTablesData.getRecords("BeautyParlor");
		System.out.println("Its good..."+parlorList.size());
		
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
