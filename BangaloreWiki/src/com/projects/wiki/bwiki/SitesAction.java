package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class SitesAction {
	
	private List siteList;

	public List getSiteList() {
		return siteList;
	}
	public void setSiteList(List siteList) {
		this.siteList = siteList;
	}

	public String listSites(){
		System.out.println("Its good...");
		siteList = BwikiTablesData.getRecords("Place");
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
