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

import com.projects.wiki.bwiki.BWikiCatalog;
import com.projects.wiki.bwiki.db.ParentData;
import com.projects.wiki.bwiki.db.Place;
import com.projects.wiki.bwiki.db.Theatre;
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
		this.indexSites(iwriter, listSites);
		
		// build index for theatres
		List<ParentData> listTheatres = BwikiTablesData.getRecords("Theatre");
		BWikiCatalog.setTheatreList(listTheatres);
		this.indexTheatres(iwriter, listTheatres);
		
		// build index of discos

		// after all indexing is done
		try {
			iwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void indexSites(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			Place place = (Place) obj;
			doc = new Document();

			doc.add(new Field(SearchConstants.GLOBAL_ID, "Place_"
					+ place.getNo(), TextField.TYPE_STORED));

			if (place.getName().equals(""))
				place.setName("NA");
			doc.add(new Field(SearchConstants.SITE_NAME, place.getName(),
					TextField.TYPE_STORED));

			if (place.getType().equals(""))
				place.setType("NA");
			doc.add(new Field(SearchConstants.SITE_TYPE, place.getType(),
					TextField.TYPE_STORED));

			if (place.getDirection().equals(""))
				place.setDirection("NA");
			doc.add(new Field(SearchConstants.SITE_DIRECTION, place
					.getDirection(), TextField.TYPE_STORED));
			doc.add(new Field(SearchConstants.SITE_REMARKS, place.getRemarks(),
					TextField.TYPE_STORED));
			try {
				iwriter.addDocument(doc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void indexTheatres(IndexWriter iwriter, List list) {
		Document doc = null;

		for (Object obj : list) {
			Theatre theatre = (Theatre) obj;
			doc = new Document();

			doc.add(new Field(SearchConstants.GLOBAL_ID, "Theatre_"
					+ theatre.getNo(), TextField.TYPE_STORED));

			doc.add(new Field(SearchConstants.THEATRE_NAME, theatre.getName(),
					TextField.TYPE_STORED));

			doc.add(new Field(SearchConstants.THEATRE_ADDRESS, theatre.getAddress(),
					TextField.TYPE_STORED));

			doc.add(new Field(SearchConstants.THEATRE_MOBILE, theatre.
					getContact_number(), TextField.TYPE_STORED));
			
			doc.add(new Field(SearchConstants.THEATRE_CONTACT, theatre.
					getContact_person(), TextField.TYPE_STORED));
			
			doc.add(new Field(SearchConstants.THEATRE_PIN, theatre.
					getPin_code(), TextField.TYPE_STORED));
			
			doc.add(new Field(SearchConstants.THEATRE_LANG, theatre.
					getLanguage(), TextField.TYPE_STORED));
			try {
				iwriter.addDocument(doc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
