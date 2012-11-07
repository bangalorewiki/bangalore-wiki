package com.projects.wiki.bwiki;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.db.Place;
import com.projects.wiki.bwiki.db.Theatre;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class TheatreActions {
	
	private List theatreList;
	
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
	public List getTheatreList() {
		return theatreList;
	}

	public void setTheatreList(List theatreList) {
		this.theatreList = theatreList;
	}

	public String listSites(){
		if(theatreList == null) {
			theatreList = BwikiTablesData.getRecords("Theatre");
		}
		Collections.sort(theatreList, Theatre.NameComparator);
		System.out.println("Its good..."+theatreList.size());
		
		return "success";
	}
	
	public String orderByRating(){
		System.out.println("Ordering by Rating ...");
		if(theatreList == null) {
			theatreList = BwikiTablesData.getRecords("Theatre");
		}
		Collections.sort(theatreList, Theatre.RatingComparator);
		return "success";
	}
	
	public String orderByLanguage(){
		System.out.println("Ordering by PlaceLanguage ...");
		if(theatreList == null) {
			theatreList = BwikiTablesData.getRecords("Theatre");
		}
		Collections.sort(theatreList, Theatre.LanguageComparator);
		return "success";
	}
	
	public String display(){
		return "success";
	}
}
