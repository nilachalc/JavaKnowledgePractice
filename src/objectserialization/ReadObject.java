package objectserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import testbeans.Employee;

public class ReadObject 
{
	void readAnObject() {
		FileInputStream fileInputStream= null;
		ObjectInputStream objectInputStream = null;
		Employee employee;
		try {
			fileInputStream = new FileInputStream("D:/E/JAVA_Progs/employee.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			employee = (Employee)objectInputStream.readObject();
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
			fileInputStream.close();
			objectInputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("Holona, Apatoto Elam.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}

	public static void main(String args[])
	{
		ReadObject readObject = new ReadObject();
		readObject.readAnObject();
		System.out.println("executed.");
	}
}