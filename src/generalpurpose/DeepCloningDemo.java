package generalpurpose;

public class DeepCloningDemo implements Cloneable {

	private Integer association;
	private String clientName;
	private ClonableEmployee clientPartner;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepCloningDemo cloningDemo = (DeepCloningDemo)super.clone(); 
		System.out.println("Object cloned.");
		System.out.println("Old Object --> " + cloningDemo.clientPartner);
		cloningDemo.clientPartner = (ClonableEmployee)clientPartner.clone();
		System.out.println("Member Referance Cloned.");
		System.out.println("New Object --> " + cloningDemo.clientPartner);
		return cloningDemo;
	}
	
	@Override
	public String toString() {
		super.toString();
		return ("Client Association : " + this.association +
		" Client Name : " + this.clientName +
		" Client Partner Name : " + this.clientPartner.getName() +
		" Client Partner Age : " + this.clientPartner.getAge());
	}

	public static void main(String[] args) {
		DeepCloningDemo demo1 = new DeepCloningDemo();
		
		demo1.association = 20;
		demo1.clientName = "AIG";
		demo1.clientPartner = new ClonableEmployee();
		demo1.clientPartner.setName("Chandu");
		demo1.clientPartner.setAge(45);
		
		try {
			DeepCloningDemo demo2 = (DeepCloningDemo)demo1.clone();
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
