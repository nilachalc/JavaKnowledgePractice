package stringhandling;

public class StringTest{
	 public static void main(String args[]){
	   String s = new String("Sachin");
	   s = s.concat(" Tendulkar");
	   System.out.println(s);
	   //System.out.println(s1);
	   String a = "nil";
	   String b = "nil";
	  System.out.println(a==b);	
	  String a1= new String("test");
	  String b1= new String("test");
	  System.out.println(a1==b1);
	  a1=b1;
	  System.out.println(a1==b1);	
	 }
	}