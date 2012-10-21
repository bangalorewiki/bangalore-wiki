package com.projects.wiki.bwiki;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.Version;
import org.apache.struts2.ServletActionContext;

import com.projects.wiki.bwiki.db.ParentData;
import com.projects.wiki.bwiki.util.BwikiTablesData;
import com.projects.wiki.bwiki.util.SearchConstants;

public class BWikiCatalog {
	private static List<ParentData> sitesList;
	private static List<ParentData> theatreList;
	private static List searchResults = new ArrayList();

	private static Analyzer luceneAnalyzer = null;
	private static Directory luceneDir = null;

	public List<ParentData> getSitesList() {
		return sitesList;
	}

	public static void setSitesList(List<ParentData> sl) {
		sitesList = sl;
	}

	/**
	 * @return the theatreList
	 */
	public List<ParentData> getTheatreList() {
		return theatreList;
	}

	/**
	 * @param theatreList the theatreList to set
	 */
	public static void setTheatreList(List<ParentData> tl) {
		theatreList = tl;
	}

	public String listSites() {
		sitesList = BwikiTablesData.getRecords("Place");
		return "success";
	}

	public String listTheatres() {
		theatreList = BwikiTablesData.getRecords("Theatre");
		return "success";
	}

	public String listSearchRecords() {
		try {
			HttpServletRequest req = ServletActionContext.getRequest();
			String searchStr = req.getParameter("lucky");
			System.out.println("searchStr is "+searchStr);
			
			// Now search the index:
			DirectoryReader dreader = DirectoryReader.open(getLuceneDir());
			IndexSearcher isearcher = new IndexSearcher(dreader);
			
			// add all fields to be searched here
			MultiFieldQueryParser queryParser = new MultiFieldQueryParser(
					Version.LUCENE_40, new String[] { 
						SearchConstants.SITE_DIRECTION, SearchConstants.SITE_NAME, 
						SearchConstants.SITE_REMARKS, SearchConstants.SITE_TYPE, 
						SearchConstants.THEATRE_ADDRESS, SearchConstants.THEATRE_CONTACT, 
						SearchConstants.THEATRE_LANG, SearchConstants.THEATRE_MOBILE, 
						SearchConstants.THEATRE_NAME, SearchConstants.THEATRE_PIN},
					getLuceneAnalyzer());

			org.apache.lucene.search.Query query = queryParser.parse(searchStr);
			ScoreDoc[] hits = isearcher.search(query, null, 1000).scoreDocs;

			System.out.println("Number of hits to the search string "
					+ searchStr + " are " + hits.length);
			// assertEquals(1, hits.length);
			// Iterate through the results:
			
			for (int i = 0; i < hits.length; i++) {
				Document hitDoc = isearcher.doc(hits[i].doc);
				System.out.println("This is the text found in record: "
						+ hitDoc.get(SearchConstants.GLOBAL_ID));
			}
			
			for (int i = 0; i < hits.length; i++) {
				Document hitDoc = isearcher.doc(hits[i].doc);
				System.out.println("This is the text to be indexed. "
						+ hitDoc.get(SearchConstants.GLOBAL_ID));
				StringTokenizer st = new StringTokenizer(
						hitDoc.get(SearchConstants.GLOBAL_ID), "_");
				String table = st.nextToken();
				int recordId = Integer.parseInt(st.nextToken());
				if(table.equalsIgnoreCase("place")) {
					ParentData pd = sitesList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("theatre")) {
					ParentData pd = theatreList.get(recordId);
					searchResults.add(pd);
				}	
			}
			dreader.close();
			// dir.close();

			System.out.println("Size of searched records are "+searchResults.size());
			
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * @return the searchResults
	 */
	public List getSearchResults() {
		return searchResults;
	}

	/**
	 * @param searchResults the searchResults to set
	 */
	public void setSearchResults(List searchResults) {
		this.searchResults = searchResults;
	}

	/**
	 * @return the luceneAnalyzer
	 */
	public static Analyzer getLuceneAnalyzer() {
		return luceneAnalyzer;
	}

	/**
	 * @param luceneAnalyzer
	 *            the luceneAnalyzer to set
	 */
	public static void setLuceneAnalyzer(Analyzer anal) {
		luceneAnalyzer = anal;
	}

	/**
	 * @return the luceneDir
	 */
	public static Directory getLuceneDir() {
		System.out.println("returning lucene dir "+luceneDir);
		return luceneDir;
	}

	/**
	 * @param luceneDir
	 *            the luceneDir to set
	 */
	public static void setLuceneDir(Directory dir) {
		System.out.println("Setting lucene directory "+dir);
		luceneDir = dir;
	}

}
