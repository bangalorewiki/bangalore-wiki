/**
 * @author : Ananth Kumar C
 * @Creted on : 18-Oct-2012
 */

package com.projects.wiki.bwiki.core;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;
import org.springframework.context.ApplicationContext;

import com.projects.wiki.bwiki.BWikiCatalog;
import com.projects.wiki.bwiki.BeautyParlorActions;
import com.projects.wiki.bwiki.BowlingAlleyActions;
import com.projects.wiki.bwiki.ClubActions;
import com.projects.wiki.bwiki.CoffeeBarActions;
import com.projects.wiki.bwiki.DiscosActions;
import com.projects.wiki.bwiki.FastFoodActions;
import com.projects.wiki.bwiki.PizzaJointActions;
import com.projects.wiki.bwiki.PoolParlorActions;
import com.projects.wiki.bwiki.PubActions;
import com.projects.wiki.bwiki.SitesAction;
import com.projects.wiki.bwiki.TheatreActions;
import com.projects.wiki.bwiki.db.BeautyParlor;
import com.projects.wiki.bwiki.db.BowlingAlley;
import com.projects.wiki.bwiki.db.Club;
import com.projects.wiki.bwiki.db.CoffeeBar;
import com.projects.wiki.bwiki.db.Disco;
import com.projects.wiki.bwiki.db.FastFood;
import com.projects.wiki.bwiki.db.ParentData;
import com.projects.wiki.bwiki.db.PizzaJoint;
import com.projects.wiki.bwiki.db.Place;
import com.projects.wiki.bwiki.db.PoolParlor;
import com.projects.wiki.bwiki.db.Pub;
import com.projects.wiki.bwiki.db.Theatre;
import com.projects.wiki.bwiki.util.ApplicationContextUtils;
import com.projects.wiki.bwiki.util.BwikiTablesData;
import com.projects.wiki.bwiki.util.SearchConstants;

public class BWikiListener implements ServletContextListener {

	private static final Logger logger = Logger.getLogger(BWikiListener.class
			.getName());
	private BWikiCatalog bwikiCatalog = new BWikiCatalog();
	// lucene indexing
	private Analyzer luceneAnalyzer = new StandardAnalyzer(Version.LUCENE_40);
	// store the index in memory
	private Directory luceneDir = new RAMDirectory();
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		logger.info("Context is getting destroyed!");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		logger.info("Initializing BWiki ...");
		BWikiCatalog.setLuceneAnalyzer(this.luceneAnalyzer);
		BWikiCatalog.setLuceneDir(this.luceneDir);
		
		// to store index on disk use this
		// Directory dir = FSDirectory.open("/path");
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_40,
				luceneAnalyzer);
		IndexWriter iwriter = null;
		try {
			iwriter = new IndexWriter(luceneDir, config);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// build index for sites
		List<ParentData> listSites = BwikiTablesData.getRecords("Place");
		BWikiCatalog.setSitesList(listSites);
		System.out.println("Indexing the sites content");
		this.indexSites(iwriter, listSites);
		
		// build index for theatres
		List<ParentData> listTheatres = BwikiTablesData.getRecords("Theatre");
		BWikiCatalog.setTheatreList(listTheatres);
		System.out.println("Indexing the theatres content");
		this.indexTheatres(iwriter, listTheatres);
		
		// build index for theatres
		List<ParentData> list = BwikiTablesData.getRecords("Pub");
		BWikiCatalog.setPubList(list);
		System.out.println("Indexing the Pub content");
		this.indexPubs(iwriter, list);
		
		list = BwikiTablesData.getRecords("PoolParlor");
		BWikiCatalog.setPoolParlorList(list);
		System.out.println("Indexing the PoolParlor content");
		this.indexPoolParlors(iwriter, list);
		
		list = BwikiTablesData.getRecords("PizzaJoint");
		BWikiCatalog.setPizzaJointList(list);
		System.out.println("Indexing the PizzaJoint content");
		this.indexPizzaJoints(iwriter, list);

		list = BwikiTablesData.getRecords("FastFood");
		BWikiCatalog.setFastFoodList(list);
		System.out.println("Indexing the FastFood content");
		this.indexFastFoods(iwriter, list);

//		list = BwikiTablesData.getRecords("Disco");
//		System.out.println("Indexing the Disco content");
//		this.indexDiscos(iwriter, list);

		list = BwikiTablesData.getRecords("CoffeeBar");
		BWikiCatalog.setCoffeeBarList(list);
		System.out.println("Indexing the CoffeeBar content");
		this.indexCoffeeBars(iwriter, list);

		list = BwikiTablesData.getRecords("BowlingAlley");
		BWikiCatalog.setBowlingAlleyList(list);
		System.out.println("Indexing the BowlingAlley content");
		this.indexBowlingAlleys(iwriter, list);

		list = BwikiTablesData.getRecords("BeautyParlor");
		BWikiCatalog.setBeautyParlorList(list);
		System.out.println("Indexing the BeautyParlor content");
		this.indexBeautyParlors(iwriter, list);
		// build index of discos

		// after all indexing is done
		try {
			iwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void addToLuceneDoc(Document doc, String entity, String key, String value) {
		
		if(entity.equalsIgnoreCase("place")) {
			SitesAction.setSearchableFields(key);
		} else if(entity.equalsIgnoreCase("theatre")) {
			TheatreActions.setSearchableFields(key);		
		} else if(entity.equalsIgnoreCase("restaurant")) {
			
		} else if(entity.equalsIgnoreCase("pub")) {
			PubActions.setSearchableFields(key);
		} else if(entity.equalsIgnoreCase("poolparlor")) {
			PoolParlorActions.setSearchableFields(key);
		} else if(entity.equalsIgnoreCase("pizzajoint")) {
			PizzaJointActions.setSearchableFields(key);
		} else if(entity.equalsIgnoreCase("fastfood")) {
			FastFoodActions.setSearchableFields(key);
		} else if(entity.equalsIgnoreCase("disco")) {
			DiscosActions.setSearchableFields(key);
		} else if(entity.equalsIgnoreCase("coffeebar")) {
			CoffeeBarActions.setSearchableFields(key);
		} else if(entity.equalsIgnoreCase("club")) {
			ClubActions.setSearchableFields(key);
		} else if(entity.equalsIgnoreCase("bowlingAlley")) {
			BowlingAlleyActions.setSearchableFields(key);
		} else if(entity.equalsIgnoreCase("beautyParlor")) {
			BeautyParlorActions.setSearchableFields(key);
		}
		doc.add(new Field(key, value, TextField.TYPE_STORED));		
	}

	private void addLuceneDocToIndex(IndexWriter iwriter, Document doc) {
		try {
			iwriter.addDocument(doc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void indexBeautyParlors(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			BeautyParlor beautyParlor = (BeautyParlor) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "BeautyParlor_"
					+ beautyParlor.getNo(), TextField.TYPE_STORED));			
			addToLuceneDoc(doc, "beautyParlor", SearchConstants.BEAUTYPARLOR_NAME, beautyParlor.getName());
			addToLuceneDoc(doc, "beautyParlor", SearchConstants.BEAUTYPARLOR_ADDRESS, beautyParlor.getAddress());
			addToLuceneDoc(doc, "beautyParlor", SearchConstants.BEAUTYPARLOR_CONTACT, beautyParlor.getContact());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexBowlingAlleys(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			BowlingAlley bowlingAlley = (BowlingAlley) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "BowlingAlley_"
					+ bowlingAlley.getNo(), TextField.TYPE_STORED));			
			addToLuceneDoc(doc, "bowlingAlley", SearchConstants.BOWLING_NAME, bowlingAlley.getName());
			addToLuceneDoc(doc, "bowlingAlley", SearchConstants.BOWLING_ADDRESS, bowlingAlley.getAddress());
			addToLuceneDoc(doc, "bowlingAlley", SearchConstants.BOWLING_CONTACT, bowlingAlley.getContactPerson());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexClubs(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			Club club = (Club) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "Club_"
					+ club.getNo(), TextField.TYPE_STORED));			
			addToLuceneDoc(doc, "club", SearchConstants.CLUB_NAME, club.getName());
			addToLuceneDoc(doc, "club", SearchConstants.CLUB_ADDRESS, club.getAddress());
			addToLuceneDoc(doc, "club", SearchConstants.CLUB_CONTACT, club.getContactPerson());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexCoffeeBars(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			CoffeeBar coffeeBar = (CoffeeBar) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "CoffeeBar_"
					+ coffeeBar.getNo(), TextField.TYPE_STORED));			
			addToLuceneDoc(doc, "coffeebar", SearchConstants.COFFEEBAR_NAME, coffeeBar.getName());
			addToLuceneDoc(doc, "coffeebar", SearchConstants.COFFEEBAR_ADDRESS, coffeeBar.getAddress());
			addToLuceneDoc(doc, "coffeebar", SearchConstants.COFFEEBAR_CONTACT, coffeeBar.getContact());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexDiscos(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			Disco disco = (Disco) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "Disco_"
					+ disco.getNo(), TextField.TYPE_STORED));			
			addToLuceneDoc(doc, "disco", SearchConstants.DISCO_NAME, disco.getName());
			addToLuceneDoc(doc, "disco", SearchConstants.DISCO_ADDRESS, disco.getAddress());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexFastFoods(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			FastFood fastFood = (FastFood) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "FastFood_"
					+ fastFood.getNo(), TextField.TYPE_STORED));			
			addToLuceneDoc(doc, "fastfood", SearchConstants.FASTFOOD_NAME, fastFood.getName());
			addToLuceneDoc(doc, "fastfood", SearchConstants.FASTFOOD_ADDRESS, fastFood.getAddress());
			addToLuceneDoc(doc, "fastfood", SearchConstants.FASTFOOD_CONTACT, fastFood.getContact());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexPizzaJoints(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			PizzaJoint pizzaJoint = (PizzaJoint) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "PizzaJoint_"
					+ pizzaJoint.getNo(), TextField.TYPE_STORED));			
			addToLuceneDoc(doc, "pizzajoint", SearchConstants.PUB_NAME, pizzaJoint.getName());
			addToLuceneDoc(doc, "pizzajoint", SearchConstants.PUB_ADDRESS, pizzaJoint.getAddress());
			addToLuceneDoc(doc, "pizzajoint", SearchConstants.PUB_CONTACT, pizzaJoint.getContact());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexPoolParlors(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			PoolParlor poolParlor = (PoolParlor) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "PoolParlor_"
					+ poolParlor.getNo(), TextField.TYPE_STORED));			
			addToLuceneDoc(doc, "poolparlor", SearchConstants.POOL_PARLOR_NAME, poolParlor.getName());
			addToLuceneDoc(doc, "poolparlor", SearchConstants.POOL_PARLOR_ADDRESS, poolParlor.getAddress());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexPubs(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			Pub pub = (Pub) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "Pub_"
					+ pub.getNo(), TextField.TYPE_STORED));			
			addToLuceneDoc(doc, "pub", SearchConstants.PUB_NAME, pub.getName());
			addToLuceneDoc(doc, "pub", SearchConstants.PUB_ADDRESS, pub.getAddress());
			addToLuceneDoc(doc, "pub", SearchConstants.PUB_CONTACT, pub.getContact());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexSites(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			Place place = (Place) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "Place_"
					+ place.getNo(), TextField.TYPE_STORED));
			
			addToLuceneDoc(doc, "place", SearchConstants.SITE_NAME, place.getName());
			addToLuceneDoc(doc, "place", SearchConstants.SITE_TYPE, place.getType());
			addToLuceneDoc(doc, "place", SearchConstants.SITE_DIRECTION, place.getDirection());
			addToLuceneDoc(doc, "place", SearchConstants.SITE_REMARKS, place.getRemarks());
			addLuceneDocToIndex(iwriter, doc);
		}
	}
	
	public void indexTheatres(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			Theatre theatre = (Theatre) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "Theatre_"
					+ theatre.getNo(), TextField.TYPE_STORED));
			addToLuceneDoc(doc, "theatre", SearchConstants.THEATRE_NAME, theatre.getName());
			addToLuceneDoc(doc, "theatre", SearchConstants.THEATRE_ADDRESS, theatre.getAddress());
			addToLuceneDoc(doc, "theatre", SearchConstants.THEATRE_MOBILE, theatre.
					getContact_number());
			doc.add(new Field(SearchConstants.THEATRE_MOBILE, theatre.
					getContact_number(), TextField.TYPE_STORED));
			addToLuceneDoc(doc, "theatre", SearchConstants.THEATRE_CONTACT, theatre.
					getContact_person());
			addToLuceneDoc(doc, "theatre", SearchConstants.THEATRE_PIN, theatre.
					getPin_code());
			addToLuceneDoc(doc, "theatre", SearchConstants.THEATRE_LANG, theatre.
					getLanguage());
			try {
				iwriter.addDocument(doc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void indexRestaurants(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			Theatre theatre = (Theatre) obj;
			doc = new Document();
			
			doc.add(new Field(SearchConstants.GLOBAL_ID, "Theatre_"
					+ theatre.getNo(), TextField.TYPE_STORED));
			addToLuceneDoc(doc, "restaurant", SearchConstants.THEATRE_NAME, theatre.getName());
			addToLuceneDoc(doc, "restaurant", SearchConstants.THEATRE_ADDRESS, theatre.getAddress());
			addToLuceneDoc(doc, "restaurant", SearchConstants.THEATRE_MOBILE, theatre.
					getContact_number());
			doc.add(new Field(SearchConstants.THEATRE_MOBILE, theatre.
					getContact_number(), TextField.TYPE_STORED));
			addToLuceneDoc(doc, "restaurant", SearchConstants.THEATRE_CONTACT, theatre.
					getContact_person());
			addToLuceneDoc(doc, "restaurant", SearchConstants.THEATRE_PIN, theatre.
					getPin_code());
			addToLuceneDoc(doc, "restaurant", SearchConstants.THEATRE_LANG, theatre.
					getLanguage());
			try {
				iwriter.addDocument(doc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
