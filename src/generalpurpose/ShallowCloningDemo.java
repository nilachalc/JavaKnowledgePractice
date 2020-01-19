package generalpurpose;

import testbeans.Employee;

public class ShallowCloningDemo implements Cloneable{

	private Integer association;
	private String clientName;
	private Employee clientPartner;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Object cloned.");
		return super.clone();
	}
	
	@Override
	public String toString() {
		//super.toString();
		return ("Client Association : " + this.association +
		" Client Name : " + this.clientName +
		" Client Partner Name : " + this.clientPartner.getName() +
		" Client Partner Age : " + this.clientPartner.getAge());
	}

	public static void main(String[] args) {
		ShallowCloningDemo demo1 = new ShallowCloningDemo();
		
		demo1.association = 20;
		demo1.clientName = "AIG";
		demo1.clientPartner = new Employee();
		demo1.clientPartner.setName("Chandu");
		demo1.clientPartner.setAge(45);
		
		try {
			ShallowCloningDemo demo2 = (ShallowCloningDemo)demo1.clone();
			System.out.println("::Before Changing::");
			System.out.println("This is Demo1 --> " + demo1);
			System.out.println("This is Demo2 --> " + demo2);
			
			demo1.association = 25;
			demo1.clientPartner.setName("Sudip");
			
			System.out.println("::After Changing::");
			System.out.println("This is Demo1 --> " + demo1);
			System.out.println("This is Demo2 --> " + demo2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
