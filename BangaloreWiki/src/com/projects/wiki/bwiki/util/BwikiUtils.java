/**
 * 
 */
package com.projects.wiki.bwiki.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ntallapa
 *
 */
public class BwikiUtils {
	
	public static String convertSetToString(Set<String> set) {
		String[] array = set.toArray(new String[0]);
		
		String fields = "";
		for(String s: array) {
			fields = fields+s+",";
		}
		
		if(fields != null && fields.length() >0) {
			fields = fields.substring(0, fields.length()-1);
		}
		return fields;
	}
	
	public static String[] getStringArrFromSets(Set... sets) {
		ArrayList<String> al = new ArrayList<String>();
		for(Set<String> set: sets) {
			Iterator iter = set.iterator();
		    while (iter.hasNext()) {
		    	al.add((String)iter.next());
		    }			
		}
		
		return al.toArray(new String[al.size()]);
	}
}
