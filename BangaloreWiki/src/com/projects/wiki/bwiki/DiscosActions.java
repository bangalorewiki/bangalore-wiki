package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class DiscosActions {
	
	private List discosList;

	public String listSites(){
		discosList = BwikiTablesData.getRecords("Disco");
		System.out.println("Its good..."+discosList.size());
		
		return "success";
	}
	
	public List getDiscosList() {
		return discosList;
	}

	public void setDiscosList(List discosList) {
		this.discosList = discosList;
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
