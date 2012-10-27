package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class TheatreActions {
	
	private List theatreList;

	public List getTheatreList() {
		return theatreList;
	}

	public void setTheatreList(List theatreList) {
		this.theatreList = theatreList;
	}

	public String listSites(){
		theatreList = BwikiTablesData.getRecords("Theatre");
		System.out.println("Its good..."+theatreList.size());
		
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
