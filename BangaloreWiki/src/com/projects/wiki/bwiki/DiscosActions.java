package com.projects.wiki.bwiki;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.util.BwikiTablesData;

public class DiscosActions {
	
	private List discosList;
	
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
	
	public String listSites(){
		if(discosList == null) {
			discosList = BwikiTablesData.getRecords("Disco");
		}
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
