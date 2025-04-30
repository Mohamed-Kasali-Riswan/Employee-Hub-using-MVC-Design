package Controller;

import java.util.List;
import repository.DataLayer;
import model.Employee;
import utility.EssentialUtil;
import view.ListAllEmployeeView;

public class ListAllEmployee {
	public static void listAllEmployee() {
		try {
			List<Employee> employees = DataLayer.getInstance().listAllEmployeeFromDB();
			if(employees!=null) 
				ListAllEmployeeView.printAllEmployees( employees);
			else 
				ListAllEmployeeView.noEmployees();
		}catch(Exception e) {
			EssentialUtil.printIt("Exception is "+e+" Fix the issue! ");
		}
	}
}
