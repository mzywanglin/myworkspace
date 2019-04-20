package test;

import test.Employee;
import java.io.*;

public class SerializeDemo {
	public static void  main (String args[]) {
		Employee e = new Employee("mzy");
		e.age = 18;
		try
		{
			FileOutputStream fileOut = new FileOutputStream("/employee.ser");
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("end");
		}catch(IOException i)
		{
			i.printStackTrace();
		}
	}
}
