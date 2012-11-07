package com.projects.wiki.bwiki;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.projects.wiki.bwiki.db.Place;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class SitesAction {

	private List siteList;

	private static Set<String> searchableFields = new HashSet<String>();

	/**
	 * @return the searchableFields
	 */
	public static Set<String> getSearchableFields() {
		return searchableFields;
	}

	/**
	 * @param searchableFields
	 *            the searchableFields to set
	 */
	public static void setSearchableFields(String sf) {
		searchableFields.add(sf);
	}

	public List getSiteList() {
		return siteList;
	}

	public void setSiteList(List siteList) {
		this.siteList = siteList;
	}

	public String listSites() {
		if (siteList == null) {
			siteList = BwikiTablesData.getRecords("Place");
		}
		Collections.sort(siteList, Place.PlaceNameComparator);
		return "success";
	}

	public String orderByDistance() {
		System.out.println("Ordering by distance ...");
		if (siteList == null) {
			siteList = BwikiTablesData.getRecords("Place");
		}
		Collections.sort(siteList, Place.PlaceDistanceComparator);
		return "success";
	}

	public String orderByRating() {
		System.out.println("Ordering by Rating ...");
		if (siteList == null) {
			siteList = BwikiTablesData.getRecords("Place");
		}
		Collections.sort(siteList, Place.PlaceRatingComparator);
		return "success";
	}

	public String orderByPlaceType() {
		System.out.println("Ordering by PlaceType...");
		if (siteList == null) {
			siteList = BwikiTablesData.getRecords("Place");
		}
		Collections.sort(siteList, Place.PlaceTypeComparator);
		return "success";
	}

	public String display() {
		return "success";
	}

	
}
