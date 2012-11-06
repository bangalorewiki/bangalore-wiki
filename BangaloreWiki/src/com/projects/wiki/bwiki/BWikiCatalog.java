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
import org.springframework.context.ApplicationContext;

import com.projects.wiki.bwiki.db.ParentData;
import com.projects.wiki.bwiki.util.ApplicationContextUtils;
import com.projects.wiki.bwiki.util.BwikiTablesData;
import com.projects.wiki.bwiki.util.BwikiUtils;
import com.projects.wiki.bwiki.util.SearchConstants;

public class BWikiCatalog {
	private static List<ParentData> sitesList;
	private static List<ParentData> theatreList;
	private static List<ParentData> restaurantList;
	private static List<ParentData> pubList;
	private static List<ParentData> poolParlorList;
	private static List<ParentData> pizzaJointList;
	private static List<ParentData> fastFoodList;
	private static List<ParentData> discosList;
	private static List<ParentData> coffeeBarList;
	private static List<ParentData> clubList;
	private static List<ParentData> bowlingAlleyList;
	private static List<ParentData> beautyParlorList;
	private static List searchResults = new ArrayList();

	private static Analyzer luceneAnalyzer = null;
	private static Directory luceneDir = null;
	
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
			ApplicationContext appCtx = ApplicationContextUtils.getApplicationContext();
		    SitesAction sitesFromContext = null;
			if(appCtx != null) {
				sitesFromContext = (SitesAction) appCtx.getBean("searchAction");
				System.out.println("searchable fields are "+BwikiUtils.convertSetToString(sitesFromContext.getSearchableFields()));
			} else {
				System.out.println("appContext is null");
			}
			System.out.println("Emptying the search records from previous query "+sitesFromContext);
			searchResults = new ArrayList();
			HttpServletRequest req = ServletActionContext.getRequest();
			String searchStr = req.getParameter("lucky");
			System.out.println("searchStr is "+searchStr);
			
			// Now search the index:
			DirectoryReader dreader = DirectoryReader.open(getLuceneDir());
			IndexSearcher isearcher = new IndexSearcher(dreader);
			
			// add all fields to be searched here
			MultiFieldQueryParser queryParser = new MultiFieldQueryParser(
					Version.LUCENE_40, BwikiUtils.getStringArrFromSets(
							SitesAction.getSearchableFields(), 
							TheatreActions.getSearchableFields(),
							RestaurentActions.getSearchableFields(),
							PubActions.getSearchableFields(),
							PoolParlorActions.getSearchableFields(),
							PizzaJointActions.getSearchableFields(),
							FastFoodActions.getSearchableFields(), 
							DiscosActions.getSearchableFields(), 
							CoffeeBarActions.getSearchableFields(), 
							ClubActions.getSearchableFields(), 
							BowlingAlleyActions.getSearchableFields(), 
							BeautyParlorActions.getSearchableFields()),
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
				} else if(table.equalsIgnoreCase("pub")) {
					ParentData pd = pubList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("poolparlor")) {
					ParentData pd = poolParlorList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("restaurant")) {
					ParentData pd = restaurantList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("pizzajoint")) {
					ParentData pd = pizzaJointList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("fastfood")) {
					ParentData pd = fastFoodList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("discos")) {
					ParentData pd = discosList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("coffeebar")) {
					ParentData pd = coffeeBarList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("club")) {
					ParentData pd = clubList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("bowlingalley")) {
					ParentData pd = bowlingAlleyList.get(recordId);
					searchResults.add(pd);
				} else if(table.equalsIgnoreCase("beautyParlor")) {
					ParentData pd = beautyParlorList.get(recordId);
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

	/**
	 * @return the restaurantList
	 */
	public static List<ParentData> getRestaurantList() {
		return restaurantList;
	}

	/**
	 * @param restaurantList the restaurantList to set
	 */
	public static void setRestaurantList(List<ParentData> restaurantList) {
		BWikiCatalog.restaurantList = restaurantList;
	}

	/**
	 * @return the pubList
	 */
	public static List<ParentData> getPubList() {
		return pubList;
	}

	/**
	 * @param pubList the pubList to set
	 */
	public static void setPubList(List<ParentData> pubList) {
		BWikiCatalog.pubList = pubList;
	}

	/**
	 * @return the poolParlorList
	 */
	public static List<ParentData> getPoolParlorList() {
		return poolParlorList;
	}

	/**
	 * @param poolParlorList the poolParlorList to set
	 */
	public static void setPoolParlorList(List<ParentData> poolParlorList) {
		BWikiCatalog.poolParlorList = poolParlorList;
	}

	/**
	 * @return the pizzaJointList
	 */
	public static List<ParentData> getPizzaJointList() {
		return pizzaJointList;
	}

	/**
	 * @param pizzaJointList the pizzaJointList to set
	 */
	public static void setPizzaJointList(List<ParentData> pizzaJointList) {
		BWikiCatalog.pizzaJointList = pizzaJointList;
	}

	/**
	 * @return the fastFoodList
	 */
	public static List<ParentData> getFastFoodList() {
		return fastFoodList;
	}

	/**
	 * @param fastFoodList the fastFoodList to set
	 */
	public static void setFastFoodList(List<ParentData> fastFoodList) {
		BWikiCatalog.fastFoodList = fastFoodList;
	}

	/**
	 * @return the discosList
	 */
	public static List<ParentData> getDiscosList() {
		return discosList;
	}

	/**
	 * @param discosList the discosList to set
	 */
	public static void setDiscosList(List<ParentData> discosList) {
		BWikiCatalog.discosList = discosList;
	}

	/**
	 * @return the coffeeBarList
	 */
	public static List<ParentData> getCoffeeBarList() {
		return coffeeBarList;
	}

	/**
	 * @param coffeeBarList the coffeeBarList to set
	 */
	public static void setCoffeeBarList(List<ParentData> coffeeBarList) {
		BWikiCatalog.coffeeBarList = coffeeBarList;
	}

	/**
	 * @return the clubList
	 */
	public static List<ParentData> getClubList() {
		return clubList;
	}

	/**
	 * @param clubList the clubList to set
	 */
	public static void setClubList(List<ParentData> clubList) {
		BWikiCatalog.clubList = clubList;
	}

	/**
	 * @return the bowlingAlleyList
	 */
	public static List<ParentData> getBowlingAlleyList() {
		return bowlingAlleyList;
	}

	/**
	 * @param bowlingAlleyList the bowlingAlleyList to set
	 */
	public static void setBowlingAlleyList(List<ParentData> bowlingAlleyList) {
		BWikiCatalog.bowlingAlleyList = bowlingAlleyList;
	}

	/**
	 * @return the beautyParlorList
	 */
	public static List<ParentData> getBeautyParlorList() {
		return beautyParlorList;
	}

	/**
	 * @param beautyParlorList the beautyParlorList to set
	 */
	public static void setBeautyParlorList(List<ParentData> beautyParlorList) {
		BWikiCatalog.beautyParlorList = beautyParlorList;
	}

	
}
