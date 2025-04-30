package Controller;

import java.util.Scanner;

import model.Employee;
import utility.EssentialUtil;
import repository.DataLayer;
import view.DeleteEmployeeView;

public class DeleteEmployee {
	static Scanner scanner;
	
	public static void deleteEmployee() {
		String empId = getEmpId();
		Employee employee = DataLayer.getInstance().readEmployeeFromDB(empId);
		
		if(employee==null) {
			DeleteEmployeeView.noEmployee(empId);
			return;
		}
		
		boolean isDeleted = DataLayer.getInstance().deleteEmployeeFromDB(empId);
		
		if(isDeleted) {
			DeleteEmployeeView.deleteSuccess(empId);
		}else {
			DeleteEmployeeView.deleteFailure(empId);
		}
	}
	
	private static String getEmpId() {
		scanner = EssentialUtil.getInstanceOfScanner();
		EssentialUtil.printIt("Enter the Employee ID: ");
		String empId=scanner.next();
		closeScanner();
		return empId;
	}
	
	private static void closeScanner() {
		if(scanner!=null) scanner=null;
	}
	
}
