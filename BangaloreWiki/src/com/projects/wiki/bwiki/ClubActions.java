package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class ClubActions {
	
	private List clubList;

	public String listSites(){
		clubList = BwikiTablesData.getRecords("Club");
		System.out.println("Its good..."+clubList.size());
		
		return "success";
	}
	
	public List getClubList() {
		return clubList;
	}

	public void setClubList(List clubList) {
		this.clubList = clubList;
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
