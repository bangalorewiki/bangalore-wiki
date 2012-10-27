package com.projects.wiki.bwiki;

import java.util.List;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class PoolParlorActions {
	
	private List poolParlorList;

	public List getPoolParlorList() {
		return poolParlorList;
	}

	public void setPoolParlorList(List poolParlorList) {
		this.poolParlorList = poolParlorList;
	}

	public String listSites(){
		poolParlorList = BwikiTablesData.getRecords("PoolParlor");
		System.out.println("Its good..."+poolParlorList.size());
		
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
