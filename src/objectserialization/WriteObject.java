package objectserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import testbeans.Employee;

public class WriteObject 
{
	Employee employee = new Employee();
	
	void writeAnObject() {
		FileOutputStream fileOutputStream= null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("D:/E/JAVA_Progs/employee.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			employee.setAge(28);
			employee.setName("Nilachal");
			objectOutputStream.writeObject(employee);
			fileOutputStream.close();
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String args[])
	{
		WriteObject writeObject = new WriteObject();
		writeObject.writeAnObject();
		System.out.println("executed.");
	}
}
