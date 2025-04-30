package view;

import utility.EssentialUtil;

public class UpdateEmployeeView {
	public static void modifySuccess(String empId) {
		EssentialUtil.printIt("Details of "+ empId +" is modified Successfully!");
	}
	
	public static void modifyFailure(String empId) {
		EssentialUtil.printIt("Details of "+ empId +" is not modified.. It remains Same!");
	}
}
