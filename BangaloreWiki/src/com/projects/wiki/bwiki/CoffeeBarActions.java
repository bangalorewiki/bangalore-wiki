package com.projects.wiki.bwiki;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.db.CoffeeBar;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class CoffeeBarActions {
	
	private List coffeeBarList;

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
	
	public List getCoffeeBarList() {
		return coffeeBarList;
	}

	public void setCoffeeBarList(List coffeeBarList) {
		this.coffeeBarList = coffeeBarList;
	}

	public String listSites(){
		if(coffeeBarList == null) {
			coffeeBarList = BwikiTablesData.getRecords("CoffeeBar");
		}
		Collections.sort(coffeeBarList, CoffeeBar.NameComparator);
		System.out.println("Its good..."+coffeeBarList.size());
		
		return "success";
	}
	
	public String orderByRating(){
		System.out.println("Ordering by Rating ...");
		if(coffeeBarList == null) {
			coffeeBarList = BwikiTablesData.getRecords("CoffeeBar");
		}
		Collections.sort(coffeeBarList, CoffeeBar.RatingComparator);
		return "success";
	}
	
	public String display(){
		return "success";
	}
}
