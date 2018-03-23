package com.nt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest2 {
public static void main(String[] args) {
	HashMap h=new HashMap<>();
	h.put(101, "tiger");
	h.put(102, "scott");
	h.put(103, "smith");
	h.put(104, "srinu");
	System.out.println(h);
	Set s=h.entrySet();
	Set s1=h.keySet();
	Iterator i=s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		
		
	}
	Iterator i1=s.iterator();
	while(i1.hasNext()) {
		Object o=i1.next();
		System.out.println(o);
		
		
	}
		
	
}
}
