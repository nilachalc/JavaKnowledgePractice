package inheritanceexamples;

class Box {
	Integer height;
	Integer width;
	Integer length;
	
	public Box() {
		height = 0;
		width = 0;
		length = 0;
	}

	public Box(Integer height, Integer width, Integer length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public Box(Integer length) {
		height = width = this.length = length;
	}
	
	public Box(Box box) {
		height = box.height;
		width = box.width;
		length = box.length;
	}
	
	public Integer volume() {
		return length * width * height;
	} 
}

class BoXWeight extends Box {
	
	Double weight;

	public BoXWeight() {
		super();
		weight = 0.0;
	}
	
	public BoXWeight(BoXWeight boXWeight) {
		super(boXWeight);
		weight = boXWeight.weight;
	}
	
	public BoXWeight(Integer height, Integer width, Integer length, Double weight) {
		super(height, width, length);
		this.weight = weight;
	}
	
	public BoXWeight(Integer length, Double weight) {
		super(length);
		this.weight = weight;
	}
	
	public Double density() {
		return volume() / weight;
	}
}

class Shipment extends BoXWeight {
	
	Double shipingCostPerUnit;
	
	public Shipment() {
		super();
		shipingCostPerUnit = 0.0;
	}

	public Shipment(Shipment shipment) {
		super(shipment);
		shipingCostPerUnit = shipment.shipingCostPerUnit;
	}

	public Shipment(Integer length, Double weight, Double shipingCost) {
		super(length, weight);
		this.shipingCostPerUnit = shipingCost;
	}

	public Shipment(Integer height, Integer width, Integer length, Double weight , Double shipingCost) {
		super(height, width, length, weight);
		this.shipingCostPerUnit = shipingCost;
	}

	public Double totalCost() {
		return density() * shipingCostPerUnit;
	}
	
	@Override
	public String toString() {
		return ("Volume is : " + volume() + " Density is : " + ((length == 0) || (height == 0) || (width == 0) ? "The Box is NonExistent." : density())  
				+ " Total Cost is : " + ((length == 0) || (height == 0) || (width == 0) ? "The Box is NonExistent." : totalCost()));
	}
}

public class MultilavelInheritanceDemo {
		public static void main(String[] args) {
			Shipment shipment1 = new Shipment();
			Shipment shipment2 = new Shipment(4, 5.5, 100.5);
			Shipment shipment3 = new Shipment(4, 5, 7, 5.5, 200.5);
			Shipment shipment4 = new Shipment(shipment3);
			System.out.println("Details of Shipment:");
			System.out.println("Shipment1 Details : " + shipment1.toString());
			System.out.println("Shipment2 Details : " + shipment2.toString());
			System.out.println("Shipment3 Details : " + shipment3.toString());
			System.out.println("Shipment4 Details : " + shipment4.toString());
		}
	}
