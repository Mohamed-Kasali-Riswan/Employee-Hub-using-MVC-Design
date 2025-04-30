package view;

import java.util.List;

import model.Employee;
import utility.EssentialUtil;

public class ListAllEmployeeView {

	public static void printAllEmployees(List<Employee> employees) {
		 for(Employee employee : employees) {
			 ReadEmployeeView.empDetails(employee);
			 EssentialUtil.printIt(" ");
		 }
	}
	
	public static void noEmployees() {
		EssentialUtil.printIt("No Data ! ");
	}
	
	public static void errorInListingEmployees() {
		EssentialUtil.printIt("Exception in DB connections.. Fix the issue! ");
	}
}
