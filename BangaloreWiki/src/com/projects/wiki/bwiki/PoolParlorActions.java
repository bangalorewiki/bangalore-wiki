package com.projects.wiki.bwiki;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.db.PoolParlor;
import com.projects.wiki.bwiki.db.Pub;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class PoolParlorActions {
	
	private List poolParlorList;

	private static Set<String> searchableFields = new HashSet<String>();
	
	/**
	 * @return the searchableFields
	 */
	public static Set<String> getSearchableFields() {
		return searchableFields;
	}
	
	/**
	 * @param searchableFields the searchableFields to set
	 */
	public static void setSearchableFields(String sf) {
		searchableFields.add(sf);
	}
	
	public List getPoolParlorList() {
		return poolParlorList;
	}

	public void setPoolParlorList(List poolParlorList) {
		this.poolParlorList = poolParlorList;
	}

	public String listSites(){
		if(poolParlorList == null) {
			poolParlorList = BwikiTablesData.getRecords("PoolParlor");
		}
		Collections.sort(poolParlorList, PoolParlor.NameComparator);
		System.out.println("Its good..."+poolParlorList.size());
		
		return "success";
	}
	
	public String orderByCapacity(){
		System.out.println("Ordering by distance ...");
		if(poolParlorList == null) {
			poolParlorList = BwikiTablesData.getRecords("PoolParlor");
		}
		Collections.sort(poolParlorList, PoolParlor.CapacityComparator);
		return "success";
	}
	
	public String orderByRating(){
		System.out.println("Ordering by Rating ...");
		if(poolParlorList == null) {
			poolParlorList = BwikiTablesData.getRecords("PoolParlor");
		}
		Collections.sort(poolParlorList, PoolParlor.RatingComparator);
		return "success";
	}
	
	public String display(){
		return "success";
	}
}
