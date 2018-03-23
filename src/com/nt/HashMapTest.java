package com.nt;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashMapTest {
 public static void main(String[] args) {
	//HashMap h=new HashMap<>();
	LinkedHashMap h=new LinkedHashMap<>();
	/*h.put(101, "srinu");
	h.put(102, "nenavath");
	h.put(103, "cnu");
	h.put(101, "sri");*/
	
	/*System.out.println(h);
    System.out.println(h.isEmpty());
    System.out.println(h.size());
    System.out.println(h.values());
    System.out.println(h.keySet());
    System.out.println(h.containsKey(101));
    System.out.println(h.get("srinu"));*/
   // System.out.println(h.entrySet());
    //System.out.println(h.clone());
     
      h.put("Address: Houseno", "5/2,Bolgetpally");
      h.put("name", "srinu");
      h.put("villege", "Bolgetpally");
      h.put("Area", "Achampet");
      h.put("City", "Nagarkarnool");
    
    
    
    
       Set s= h.entrySet();
       Iterator i=s.iterator();
       while(i.hasNext()) {
    	   System.out.println(i.next());
    	   
    	      Set s1=h.keySet();
    	      Iterator i1=s1.iterator();
    	      while(i1.hasNext()) {
    	    	  System.out.println(i1.next());
    	    
    	           Collection s2= h.values();
    	           Iterator i3=s2.iterator();
    	           while(i3.hasNext()) {
    	        	   System.out.println(i3.next());
    	           }
    	    	  
    	    	  
    	    	  
    	      }
    	   
       }


}
 }