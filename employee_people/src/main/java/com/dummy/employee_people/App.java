package com.dummy.employee_people;

//import java.util.Scanner;
//import model.Employee;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Id;
//import javax.persistence.Persistence;
import view.EmployeeDriver;


public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDriver.start();
//    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("employee_details_persistence");
//    	EntityManager em=emf.createEntityManager();
//    	EntityTransaction et=em.getTransaction();
//    	Scanner sc= new Scanner(System.in);
    	
//    	boolean flag=true;
//    	
//    	while(flag){
//    		System.out.println("1.Add a Detail");
//    		System.out.println("2.Check a Detail");
//    		System.out.println("3.Update a Detail");
//    		System.out.println("4.Cancel a Detail");
//    		System.out.println("5.Exit Application");
//    		System.out.print("Enter the Option:");
//    		switch(sc.nextInt()) {
//    			case 1:{
//    				AddEmployeeServlet.addEmployee();
//    				break;
//    			}
//    			case 2:{
//    				break;
//    			}
//    			case 3:{
//    				break;
//    			}
//    			case 4:{
//    				break;
//    			}
//    			case 5:{
//    				flag=false;
//    				break;
//    			}
//    			default:{
//    				System.out.println("Invalid Option!");
//    				break;
//    			}
//    		}
//    		
//    	}
    	
    	
    	
    	
//        try {
        	
        	
          	// 1 - > Add an Employee
        	
//            employee e = new employee();
//            e.setEmp_id();
//            e.setEmp_name("MotuPatlu");
//            e.setEmp_mob("9876543212");
//            e.setEmp_dob("1999-01-01");
//            e.setEmp_gender("male");
//            e.setEmp_address("657, Pillayar Kovil Street, AbuDhabi, UAE.");
//            e.setEmp_salary(94000);
//            
//            et.begin();
//            em.persist(e);
//            et.commit();
            
        	// 2 - > Remove an Employee
        	
//        	employee e1 = em.find(employee.class, "808ca");
//        	if (e1 != null) {
//        		et.begin();
//        	    em.remove(e1);
//        	    et.commit();
//        	} else {
//        	    System.out.println("Employee with ID "+" \"808ca\" "+" not found.");
//        	}

        	// 3 - > Read an Employee
        	
//        	employee e1 = em.find(employee.class, "32e8f");
//        	if (e1 != null) {
//        		et.begin();
//        	    System.out.println(e1);
//        	    et.commit();
//        	} else {
//        	    System.out.println("Employee with ID "+" \"32e8f\" "+" not found.");
//        	}
        	
        	// 4 - > Update an Employee
//        	employee e1 = em.find(employee.class, "32e8f");
//        	if (e1 != null) {
//        		et.begin();
//        		e1.setEmp_name("Patlu");
//        	    et.commit();
//        	} else {
//        	    System.out.println("Employee with ID "+" \"32e8f\" "+" not found.");
//        	}
            
            
//        }catch(Exception e) {
//        	System.out.println(e);
//        	em.getTransaction().rollback();
//        }finally {
//        	emf.close();
//        	em.close();
//        }
    }
}
