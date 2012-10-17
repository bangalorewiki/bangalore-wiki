/**
 * 
 */
package com.projects.wiki.bwiki.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.projects.wiki.bwiki.db.Place;

/**
 * @author ntallapa
 *
 */
public class BwikiTablesData {
	
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	public static void loadTableData() {
		
	}

	public static List<?> getRecords(String dbTableHBMFile) {
		Session session = null;
		List allPlaces = null;
		try {
			try {
				Configuration cfg = new Configuration().addResource(
						dbTableHBMFile).configure();
				serviceRegistry = new ServiceRegistryBuilder().applySettings(
						cfg.getProperties()).buildServiceRegistry();
				sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			} catch (Throwable ex) {
				System.err.println("Failed to create sessionFactory object."
						+ ex);
				throw new ExceptionInInitializerError(ex);
			}
			session = sessionFactory.openSession();

			System.out.println("Retrieving records");
			// blrPlaces.setId(1);
			// blrPlaces.setName("Roseindia");
			
			  Query queryResult = session.createQuery("from Place");  
			  allPlaces = queryResult.list();  
			  for (int i = 0; i < allPlaces.size(); i++) {  
				  Place place = (Place) allPlaces.get(i);  
				  System.out.print(place.getPlace());
				  System.out.print(", "+place.getType());
				  System.out.print(", "+place.getDirection());
				  System.out.print(", "+place.getDist());
				  System.out.println();
			  }  
			  
			  
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		return allPlaces;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
