package com.projects.wiki.bwiki;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.projects.wiki.bwiki.db.Place;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class Sites {
	private List sitesList;

	public List<Place> getSightsList() {
		System.out.println("its getting called...");
		return sitesList;
	}

	public void setSightsList(List<Place> sightsList) {
		this.sitesList = sightsList;
	}

	public String listSites(){
		
		System.out.println("Its good...");
		
		sitesList = BwikiTablesData.getRecords("Place.hbm.xml");
		
		return "success";
	}
	
}
