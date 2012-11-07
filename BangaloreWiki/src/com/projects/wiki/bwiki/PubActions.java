package com.projects.wiki.bwiki;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.db.Place;
import com.projects.wiki.bwiki.db.Pub;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class PubActions {
	
	private List pubList;

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
	
	public List getPubList() {
		return pubList;
	}

	public void setPubList(List pubList) {
		this.pubList = pubList;
	}

	public String listSites(){
		if(pubList == null) {
			pubList = BwikiTablesData.getRecords("Pub");
		}
		Collections.sort(pubList, Pub.NameComparator);
		System.out.println("Its good...(Pub) "+pubList.size());
		
		return "success";
	}
	
	public String orderByRating(){
		System.out.println("Ordering by Rating ...");
		if(pubList == null) {
			pubList = BwikiTablesData.getRecords("Pub");
		}
		Collections.sort(pubList, Pub.RatingComparator);
		return "success";
	}
	
	public String orderByCapacity(){
		System.out.println("Ordering by Capacity...");
		if(pubList == null) {
			pubList = BwikiTablesData.getRecords("Pub");
		}
		Collections.sort(pubList, Pub.CapacityComparator);
		return "success";
	}
	
	public String display(){
		return "success";
	}
}
