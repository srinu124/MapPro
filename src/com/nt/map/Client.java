package com.nt.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Client {
 public static void main(String[] args) {
	HashMap h=new HashMap<>();
	h.put(new Parent("vasu",8585852220l,"achampet","vasu@123.com"), new Child("kiran",9595959595l,"achampet","kiran@gmail.com"));
	h.put(new Parent("ganesh",7585556486l,"maharstra","ganesh@123.com"), new Child("vinay",985858585l,"asdf","vinay@gmail.com"));
	h.put(new Parent("smith",9696964564l,"dilshuknagar","smith@123.com"), new Child("shushanth",7641254564l,"kaligiri","shushanth@gmail.com"));
	h.put(new Parent("deva",8585852220l,"lbnagar","deva@123.com"), new Child("bhanu",95454549595l,"dsnr","bhanu@gmail.com"));
	h.put(new Parent("scott",8500250253l,"kothapet","scott@123.com"), new Child("shiva",9535362595l,"madapur","shiva@gmail.com"));
	 Set s=h.entrySet();
	 Iterator i=s.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
		 
	 }
	//System.out.println(h);
 }
}
