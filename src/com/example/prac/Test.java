package com.example.prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		char array[][] = {{'A','B', 'C', 'D', 'E'}, {'E','F', 'G', 'H', 'I'},
				{'T','N', 'P', 'Y', 'X'}, {'A','B', 'C', 'D', 'E'}, {'C','D', 'F', 'C', 'Z'}};
		Map<String, Integer> cntrMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			char arrayComp[] = array[i];
			for (int j = 0; j < arrayComp.length; j++) {
				char var = arrayComp[j];
				int cntr = 0;
				for (int j2 = 0; j2 < arrayComp.length; j2++) {
					if ( var == arrayComp[j2]) {
						cntr++;
					}
					cntrMap.put(Character.toString(var), cntr);
				}
			}
		}
		// using iterators
        Iterator<Map.Entry<String, Integer>> itr = cntrMap.entrySet().iterator();
        
		while(itr.hasNext()) {
             Map.Entry<String, Integer> entry = itr.next();
             System.out.println("Key = " + entry.getKey() +
                                 ", Value = " + entry.getValue());
        }
	}
}
