package threadsdemo;

import java.util.ArrayList;
import java.util.List; 

class Geek 
{ 
	String name = ""; 
	public int count = 0; 

	public void geekName(String geek, List<String> list) 
	{ 
		// Only one thread is permitted 
		// to change geek's name at a time. 
		synchronized(this) 
		{ 
			name = geek; 
			count++; // how many threads change geek's name. 
		} 

		// All other threads are permitted 
		// to add geek name into list. 
		list.add(geek); 
	} 
} 

public class SynchronizedBlockDemo 
{ 
	public static void main (String[] args) 
	{ 
		Geek gk = new Geek(); 
		List<String> list = new ArrayList<String>(); 
		gk.geekName("Rana", list);
		gk.geekName("Nil", list);
		gk.geekName("Mik", list);
		gk.geekName("Dip", list);
		gk.geekName("Dim", list);
		for(String pointer: list) {
			System.out.println("Name : " + pointer);
		}
		System.out.println("Total Count : " + gk.count);
	} 
} 
