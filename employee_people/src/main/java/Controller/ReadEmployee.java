package Controller;

import java.util.Scanner;

import model.Employee;
import utility.EssentialUtil;
import repository.DataLayer;
import repository.EmployeeIdListRepo;
import view.ReadEmployeeView;

public class ReadEmployee {
	static Scanner scanner;
	public static void readEmployee() {
		scanner = EssentialUtil.getInstanceOfScanner();
		EssentialUtil.printIt("Enter the Employee ID:");
		String empId=scanner.next();
		closeScanner();
		Employee employee = DataLayer.getInstance().readEmployeeFromDB(empId);
		if(employee==null) 
			ReadEmployeeView.noDetails(empId);
		else 
			ReadEmployeeView.empDetails(employee);	
	}

	private static void closeScanner() {
		if(scanner!=null) scanner=null;
	}
}
