package stringhandling;

public class StringTest {
	 public static void main(String args[]) {
		 String s = "Nilachal";
		 String s1 = "Nilachal";
		 System.out.println(s==s1);
		 System.out.println(s.equals(s1));
		 s = "Chakraborty";
		 System.out.println(s==s1);
		 System.out.println(s.equals(s1));
		 String s2 = "Nilachal";
		 System.out.println(s1==s2);
		 System.out.println(s1.equals(s2));
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 String str = new String("Sachin");
		 System.out.println(System.identityHashCode(str) + " : " + str.hashCode());
		 str = str.concat(" Tendulkar");
		 System.out.println(str);
		 System.out.println(System.identityHashCode(str) + " : " + str.hashCode()); //Shows String is immutable
		 //System.out.println(s1);
		 String a = "nil";
		 String b = "nil";
		 System.out.println(a==b);	
		 String a1= new String("test");
		 String b1= new String("test");
		 System.out.println(a1==b1);
		 System.out.println(a1.equals(b1));
		 a1=b1;
		 System.out.println(a1==b1);
		 
		 // String Intern Example
		 String str1 = "Hello";
		 //String str1 = new String("Hello");
		 String str2 = str1.intern();

		 if (str1 == str2) {
		   System.out.println("str1 and str2 are the same object");
		 } else {
		   System.out.println("str1 and str2 are different objects");
		 }
	 }
}