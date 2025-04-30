package view;
import utility.EssentialUtil;
public class AddEmployeeView {
	public static void addedSuccess(String employeeName) {
		EssentialUtil.printIt(employeeName+" is Added Successfully!");
	}
	
	public static void addedFailure(String employeeName) {
		EssentialUtil.printIt(employeeName+" is Not Added.. Fix the issue!");
	}
}
