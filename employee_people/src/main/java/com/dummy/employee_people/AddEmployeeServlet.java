//package com.dummy.employee_people;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.io.IOException;
//
//@WebServlet("/AddEmployeeServlet")
//public class AddEmployeeServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public AddEmployeeServlet() {
//        super();
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // Retrieve form data from the HTML form
//        String emp_name = request.getParameter("emp_name");
//        String emp_mob = request.getParameter("emp_mob");
//        String emp_gender = request.getParameter("emp_gender");
//        String emp_address = request.getParameter("emp_address");
//        String emp_dob = request.getParameter("emp_dob");
//        double emp_salary = Double.parseDouble(request.getParameter("emp_salary"));
//
//        // Create an entity manager
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee_details_persistence");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//
//        try {
//            // Create employee object
//            employee e = new employee();
//            e.setEmp_id(); // Generate a unique ID
//            e.setEmp_name(emp_name);
//            e.setEmp_mob(emp_mob);
//            e.setEmp_gender(emp_gender);
//            e.setEmp_address(emp_address);
//            e.setEmp_dob(emp_dob);
//            e.setEmp_salary(emp_salary);
//
//            // Begin transaction and persist the employee object
//            et.begin();
//            em.persist(e);
//            et.commit();
//
//            // Redirect or respond to success page
//            response.sendRedirect("success.html");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            // In case of an error, rollback transaction and show error
//            if (et.isActive()) {
//                et.rollback();
//            }
//            response.sendRedirect("error.html");
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//    
//    protected static void addEmployee() {
//    	
//    }
//}
