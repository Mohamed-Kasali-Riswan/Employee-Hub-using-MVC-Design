package repository;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Employee;
import utility.EssentialUtil;


public class DataLayer{
	private EntityManagerFactory factoryObject;
	private EntityManager managerObject;
	private EntityTransaction transactionObject;
	private static DataLayer datalayerObject=null;
	
	private DataLayer() {
		factoryObject = Persistence.createEntityManagerFactory("employee_details_persistence");
	}
	
	public static void closeFactory() {
		datalayerObject.factoryObject.close();
	}
	
	public static DataLayer getInstance() {
		if(datalayerObject==null) datalayerObject=new DataLayer();
			return datalayerObject;
	}
	
	private void getStartEntityTransaction() {
		managerObject = factoryObject.createEntityManager();
		transactionObject = managerObject.getTransaction();
	}
	
	private void closeConnections() {
		managerObject.close();
	}
	
	public boolean addEmployeeToDB(Employee newEmployee) {
		try {
			getStartEntityTransaction();
			transactionObject.begin();
			managerObject.persist(newEmployee);
			transactionObject.commit();
			return true;
		}catch(Exception e) {
			EssentialUtil.printIt("Exception is "+e);	
			return false;
		}finally {
			closeConnections();
		}
	}
	
	public Employee readEmployeeFromDB(String empId) {
		try {
			getStartEntityTransaction();
			transactionObject.begin();
			Employee employee=managerObject.find(Employee.class,empId);
			return employee;
		}catch(Exception e) {
			EssentialUtil.printIt("There is an exception while checking your data.. Please fix the issue!");
			EssentialUtil.printIt("Exception is "+e);
			return null;
		}finally {
			closeConnections();
		}
	}
	
	public List<Employee> listAllEmployeeFromDB() {
		try {
			getStartEntityTransaction();
			List<Employee> employees = managerObject.createQuery("FROM Employee", Employee.class).getResultList();
			return employees;
		}catch(Exception e) {
			EssentialUtil.printIt("Exception in DB connections.. Fix the issue! ");
			EssentialUtil.printIt("Exception is "+e);
			return null;
		}finally {
			closeConnections();
		}
	}
	
	public boolean modifyEmployeeInDB(Employee employee) {
		try {
			getStartEntityTransaction();
			transactionObject.begin();
			managerObject.merge(employee);
			transactionObject.commit();
			return true;
		}catch(Exception e) {
			EssentialUtil.printIt("Exception is "+e);
			return false;
		}finally {
			closeConnections();
		}
	}
	
	public boolean deleteEmployeeFromDB(String empId) {
		try {
			getStartEntityTransaction();
			transactionObject.begin();
			Employee employee =managerObject.find(Employee.class,empId);
			managerObject.remove(employee);
			transactionObject.commit();
			return true;
			
		}catch(Exception e) {
			EssentialUtil.printIt("Exception is "+e);
			return false;
		}finally {
			closeConnections();
		}
	}
}








