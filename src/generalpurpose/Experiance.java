package generalpurpose;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Experiance {

	private Integer itExperiance;
	private Integer nonITExperiance;
	
	public Experiance(Integer itExp, Integer nonItExp) {
		itExperiance = itExp;
		nonITExperiance = nonItExp;
	}
	
	@Override
	public int hashCode() {
		super.hashCode();
		return ((itExperiance * 3) + (nonITExperiance * 4));
	}

	@Override
	public boolean equals(Object obj) {
		super.equals(obj);
		
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		if (this == obj) {
			return true;
		}
		
		if(this.itExperiance == ((Experiance)obj).itExperiance 
				&& this.nonITExperiance == ((Experiance)obj).nonITExperiance) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		super.toString();
		return (" IT Experiance --> " + this.itExperiance + "\n" 
				+ " Non IT Experiance --> " + this.nonITExperiance);
	}

	public static void main(String[] args) {
		Experiance experiance1 = new Experiance(2, 3);
		Experiance experiance2 = new Experiance(3, 2);
		Experiance experiance3 = new Experiance(5, 7);
		Experiance experiance4 = new Experiance(5, 8);
		Experiance experiance5 = new Experiance(2, 8);
		Experiance experiance6 = new Experiance(2, 8);
		
		System.out.println(experiance1.toString() + " experiance1 --> Hashcode = " 
				+ experiance1.hashCode() + experiance2.toString() + " experiance2 --> Hashcode = " 
				+ experiance2.hashCode() + experiance1.equals(experiance2)); // False
		System.out.println();
		System.out.println(experiance2.toString() + " experiance2 --> Hashcode = " 
				+ experiance2.hashCode() + experiance1.toString() + " experiance1 --> Hashcode = " 
				+ experiance1.hashCode() + experiance2.equals(experiance1)); // False
		System.out.println();
		System.out.println(experiance3.toString() + " experiance3 --> Hashcode = " 
				+ experiance3.hashCode() + experiance4.toString() + " experiance4 --> Hashcode = " 
				+ experiance4.hashCode() + experiance3.equals(experiance4)); // False
		System.out.println();
		System.out.println(experiance4.toString() + " experiance4 --> Hashcode = " 
				+ experiance4.hashCode() + experiance5.toString() + " experiance5 --> Hashcode = " 
				+ experiance5.hashCode() + experiance4.equals(experiance5)); // False
		System.out.println();
		System.out.println(experiance5.toString() + " experiance5 --> Hashcode = " 
				+ experiance5.hashCode() + experiance6.toString() + " experiance6 --> Hashcode = " 
				+ experiance6.hashCode() + experiance5.equals(experiance6)); // True
		System.out.println();
		System.out.println(experiance1.toString() + " experiance1 --> Hashcode = " 
				+ experiance1.hashCode() + experiance1.toString() + " experiance1 --> Hashcode = " 
				+ experiance2.hashCode() + experiance1.equals(experiance1)); // True
		System.out.println();
		Set<Experiance> experiances = new HashSet<Experiance>();
		experiances.add(experiance1);
		experiances.add(experiance2);
		experiances.add(experiance3);
		experiances.add(experiance4);
		experiances.add(experiance5);
		experiances.add(experiance6);
		experiances.add(experiance1);
		
		/* This is why we need override the hashcode method of the Object class as well, Otherwise if we override the equals method only, then equality will hold good
		 * only for single instance/object of the class but not for a collection(set, map etc.)*/
		System.out.println("Set Example"); 
        Iterator<Experiance> value = experiances.iterator(); 
  
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
	}
}
