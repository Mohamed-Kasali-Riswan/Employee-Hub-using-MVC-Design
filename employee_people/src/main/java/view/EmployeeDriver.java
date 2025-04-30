package view;

import java.util.Scanner;
import Controller.AddEmployee;
import Controller.DeleteEmployee;
import Controller.ReadEmployee;
import Controller.ListAllEmployee;
import Controller.UpdateEmployee;
import repository.DataLayer;
import utility.EssentialUtil;

public class EmployeeDriver {

	static Scanner scanner;
	public static void start(){
		
		try {			
			
			boolean flag=true;
			scanner = EssentialUtil.getInstanceOfScanner();
			
			while(flag) {
				EssentialUtil.printItCenter("Employee Hub Center");
				EssentialUtil.printIt("1. Add en Employee Details");
				EssentialUtil.printIt("2. Check en Employee Details");
				EssentialUtil.printIt("3. Update en Employee Details");
				EssentialUtil.printIt("4. Delete en Employee Details");
				EssentialUtil.printIt("5. List all the Employee Details");
				EssentialUtil.printIt("6. Exit Application");
				EssentialUtil.printItCenter("Enter your operation : ");
				
				switch(scanner.nextInt()) {
				
					case 1:{
						AddEmployee.addEmployee();
						break;
					}
					
					case 2:{
						ReadEmployee.readEmployee();
						break;
					}
					
					case 3:{
						UpdateEmployee.updateEmployee();
						break;
					}
					
					case 4:{
						DeleteEmployee.deleteEmployee();
						break;
					}
					
					case 5:{
						ListAllEmployee.listAllEmployee();
						break;
					}
					
					case 6:{
						EssentialUtil.printIt("Exiting...");
						try {
							Thread.sleep(2000);
						}catch(Exception e) {
							System.out.println();
						}
						flag=false;
						EssentialUtil.printItCenter("Thank you for using :)");
						break;
					}
					
					default:{
						EssentialUtil.printIt("Invalid Operation!");
						break;
					}
				}
				
			}
			
			
		}catch(Exception e) {
			System.out.println("Driver Class Exception: "+e);
		}finally {
			DataLayer.closeFactory();
		}
		
		
	}
}
