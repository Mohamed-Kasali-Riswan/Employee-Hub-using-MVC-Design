package view;

import model.Employee;
import utility.EssentialUtil;

public class ReadEmployeeView {
	
	public static void empDetails(Employee employee) {
		EssentialUtil.printIt("Id is "+employee.get_EmpId());
		EssentialUtil.printIt("Name is "+employee.get_EmpName());
		EssentialUtil.printIt("Date of Birth is "+employee.getEmp_dob());
		EssentialUtil.printIt("Gender is "+employee.getEmp_gender());
		EssentialUtil.printIt("Mobile number is "+employee.getEmp_mob());
		EssentialUtil.printIt("Address is "+employee.getEmp_address());
		EssentialUtil.printIt("Salary is "+employee.getEmp_salary());
	}
	
	public static void noDetails(String empId) {
		EssentialUtil.printIt("There is no Details with the Employee Id : "+empId);
	}
	
	public static void errorDetails() {
		EssentialUtil.printIt("There is an exception while checking your data.. Please fix the issue!");
	}
	
}
