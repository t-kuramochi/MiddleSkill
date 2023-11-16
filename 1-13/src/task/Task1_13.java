package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1_13 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		 List<String> strArray1 = new ArrayList<>(
	                Arrays.asList("f", "u", "k", "u", "d", "a", "k", "a", "n", "e", "k", "o"));
	        List<String> strArray2 = new ArrayList<String>();
	        List<String> strArray3 = new ArrayList<String>();
	        List<String> strArray4 = new ArrayList<String>();

	        // 1個目のfor文
	        for(int i = 3; i < strArray1.size(); i++){
	        	 strArray2.add(strArray1.get(i));
	        	 }
	        	 for(String s : strArray2){
	        	  if (s.equals("k") || s.equals("a") || s.equals("o"))
	        	  strArray3.add(s);
	        	 }
	        	 
	        	  for (int k = 0; k < strArray3.size();k++) {
	        	    if (k == 0) {
	        	        strArray4.add("k");
	        	    } else if (k == 1) {
	        	        strArray4.add("a");
	        	    } else if (k == 2) {
	        	        strArray4.add("k");
	        	    } else if (k == 3) {
	        	        strArray4.add("a");
	        	    } else if (k == 4) {
	        	        strArray4.add("o");   
	        	        }
	        	   }
	        	 System.out.println(strArray4);
	        	   
	        	   
	        	            }
	        	        }