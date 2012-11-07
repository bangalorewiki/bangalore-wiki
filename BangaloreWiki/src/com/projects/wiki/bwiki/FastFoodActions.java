package com.projects.wiki.bwiki;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.db.FastFood;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class FastFoodActions {
	
	private List fastFoodList;

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
		if(fastFoodList == null) {
			fastFoodList = BwikiTablesData.getRecords("FastFood");
		}
		Collections.sort(fastFoodList, FastFood.NameComparator);
		System.out.println("Its good..."+fastFoodList.size());
		
		return "success";
	}
	
	public List getFastFoodList() {
		return fastFoodList;
	}

	public void setFastFoodList(List fastFoodList) {
		this.fastFoodList = fastFoodList;
	}

	public String orderByRating(){
		System.out.println("Ordering by Rating ...");
		if(fastFoodList == null) {
			fastFoodList = BwikiTablesData.getRecords("FastFood");
		}
		Collections.sort(fastFoodList, FastFood.RatingComparator);
		return "success";
	}
	
	public String orderByFootfall(){
		System.out.println("Ordering by PlaceType ...");
		if(fastFoodList == null) {
			fastFoodList = BwikiTablesData.getRecords("FastFood");
		}
		Collections.sort(fastFoodList, FastFood.FootfallComparator);
		return "success";
	}
	
	public String display(){
		return "success";
	}
}
