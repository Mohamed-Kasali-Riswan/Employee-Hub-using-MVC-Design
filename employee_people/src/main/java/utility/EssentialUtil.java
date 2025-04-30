package utility;

import java.util.Scanner;
import model.Employee;

public class EssentialUtil {
	static Scanner scanner;
	
	public static void printIt(String message){
		System.out.println(message);
	}
	
	public static void printItCenter(String message){
		System.out.println();
		System.out.print("\t\t\t\t\t "+message);
		System.out.println();
		System.out.println();
	}
	
	public static Scanner getInstanceOfScanner() {
		if(scanner==null) scanner=new Scanner(System.in);
		return scanner;
	}
	
	public static void printEmployee(Employee employee) {
		System.out.println(employee);
	}

}
