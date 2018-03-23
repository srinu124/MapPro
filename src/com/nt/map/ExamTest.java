package com.nt.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExamTest {
	public static void main(String[] args) {
		
		String s="abcdabc";
		ArrayList a=new ArrayList<>(Arrays.asList(s));
		
		
		HashMap h=new HashMap<>();
		
           for(int i=0;i<s.length();i++) {
        	   char c1=s.charAt(i);
        	   if(h.containsKey(c1)) {
   				int count=(int) h.get(c1);
   				h.put(c1, ++count);
        	   
           }else {
				h.put(c1, 1);
				
			}
				
			}
           System.out.println(h);
			}
		
		}

	
		
				
		
		
			
			
					
				
				
			
		
		
	



		



		

		
		
	


