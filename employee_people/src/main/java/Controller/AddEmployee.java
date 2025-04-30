package Controller;

import java.util.Scanner;
import utility.EssentialUtil;
import view.AddEmployeeView;
import repository.DataLayer;
import model.Employee;

public class AddEmployee {

	static Scanner scanner=null;
	
	public static void addEmployee() {
		Employee employee = getEmployeeDetails();
		boolean isAdded = DataLayer.getInstance().addEmployeeToDB(employee);
		
		if(isAdded) {
			AddEmployeeView.addedSuccess(employee.get_EmpName());
		}else {
			AddEmployeeView.addedFailure(employee.get_EmpName());
		}
		
	}

	private static void setScanner() {
		if(scanner==null) scanner=EssentialUtil.getInstanceOfScanner();
	}
	
	private static void closeScanner() {
		if(scanner!=null) scanner=null;
	}
	
	protected static Employee getEmployeeDetails() {
		setScanner();
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
		Employee employee = new Employee();
		employee.setEmp_id();
		employee.setEmp_name(name);
		employee.setEmp_dob(dob);
		employee.setEmp_mob(mobile);
		employee.setEmp_gender(gender);
		employee.setEmp_address(address);
		employee.setEmp_salary(salary);
		return employee;
	}
}
