package repository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeIdListRepo {
	private static List<String> EmployeeIdList= new ArrayList<>();
	
	protected static void addId(String EmpId) {
		EmployeeIdList.add(EmpId);
	}
	
	protected static void removeId(String EmpId) {
		EmployeeIdList.remove(EmpId);
	}
	
	public static boolean isPresent(String empId) {
		return EmployeeIdList.contains(empId);
	}
}
