package Controller;

import java.util.Scanner;

import model.Employee;
import repository.DataLayer;
import utility.EssentialUtil;
import repository.DataLayer;
import view.UpdateEmployeeView;

public class UpdateEmployee {

	static Scanner scanner ;
	
	public static void updateEmployee() {
		scanner = EssentialUtil.getInstanceOfScanner();
		
		EssentialUtil.printIt("Enter the Employee ID: ");
		
		String empId = scanner.next();
				
		Employee employee = DataLayer.getInstance().readEmployeeFromDB(empId);
		
		EssentialUtil.printEmployee(employee);
		
		modifyEmployeeDetails(employee);
		
		boolean isModified = DataLayer.getInstance().modifyEmployeeInDB(employee);
		
		if(isModified) UpdateEmployeeView.modifySuccess(employee.get_EmpId());
		else UpdateEmployeeView.modifyFailure(employee.get_EmpId());
		
	}
	
	private static void closeScanner() {
		if(scanner!=null) scanner=null;
	}
	
	private static void modifyEmployeeDetails(Employee employee) {
		System.out.println("Enter the Employee Name:");
		String name=scanner.nextLine();
		name=scanner.nextLine();
		System.out.println("Enter the Employee DOB(yyyy-mm-dd):");
		String dob=scanner.nextLine();
		System.out.println("Enter the Employee mobile number:");
		String mobile=scanner.nextLine();
		System.out.println("Enter the Employee Gender:");
		String gender=scanner.nextLine();
		System.out.println("Enter the Employee Address:");
		String address=scanner.nextLine();
		System.out.println("Enter the Employee Salary:");
		double salary=scanner.nextDouble();
		closeScanner();
		employee.setEmp_name(name);
		employee.setEmp_dob(dob);
		employee.setEmp_mob(mobile);
		employee.setEmp_gender(gender);
		employee.setEmp_address(address);
		employee.setEmp_salary(salary);
	}
}
