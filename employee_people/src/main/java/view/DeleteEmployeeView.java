package view;

import utility.EssentialUtil;

public class DeleteEmployeeView {
	public static void deleteSuccess(String empId) {
		EssentialUtil.printIt("Record of Employee ID \" "+empId+" \" is Deleted Successfully!");
	}
	
	public static void deleteFailure(String empId) {
		EssentialUtil.printIt("Record of Employee ID \" "+empId+" \" is not Deleted.. It remains!");
	}
	
	public static void noEmployee(String empId) {
		EssentialUtil.printIt("There is no Details with the Employee Id : "+empId);
	}
}
