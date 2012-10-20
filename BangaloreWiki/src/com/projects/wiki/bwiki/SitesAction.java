package com.projects.wiki.bwiki;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.projects.wiki.bwiki.db.Place;
import com.projects.wiki.bwiki.util.BwikiTablesData;

public class SitesAction {
	private List siteList;

	public List getSiteList() {
		return siteList;
	}
	public void setSiteList(List siteList) {
		this.siteList = siteList;
	}

	public String listSites(){
		
		System.out.println("Its good...");
		
		siteList = BwikiTablesData.getRecords("Place.hbm.xml");
		
		return "success";
	}
}
