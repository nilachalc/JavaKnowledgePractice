package controlstatement;

public class SwitchCaseDemo {
	public static void main(String []args) {
		String s = "Oli";
		switch (s) {
		case "Nil":
			System.out.println("case1");
			break;
		case "Oli":
			System.out.println("\"case2\"");
			break;
		case "Pom":
			System.out.println("case3");
			break;
		case "4":
			System.out.println("case4");
			break;
		case "5":
			System.out.println("case5");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
