package com.projects.wiki.bwiki;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.db.Club;
import com.projects.wiki.bwiki.db.FastFood;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class ClubActions {
	
	private List clubList;

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
		if(clubList == null) {
			clubList = BwikiTablesData.getRecords("Club");
		}
		Collections.sort(clubList, Club.NameComparator);
		System.out.println("Its good..."+clubList.size());
		
		return "success";
	}
	
	public List getClubList() {
		return clubList;
	}

	public void setClubList(List clubList) {
		this.clubList = clubList;
	}
	
	public String orderByRating(){
		System.out.println("Ordering by Rating ...");
		if(clubList == null) {
			clubList = BwikiTablesData.getRecords("Club");
		}
		Collections.sort(clubList, Club.RatingComparator);
		return "success";
	}
	
	public String orderByFootfall(){
		System.out.println("Ordering by PlaceType ...");
		if(clubList == null) {
			clubList = BwikiTablesData.getRecords("Club");
		}
		Collections.sort(clubList, Club.FootfallComparator);
		return "success";
	}
	
	public String display(){
		return "success";
	}
}
