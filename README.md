# Employee-Hub-using-MVC-Design
Employee Hub using MVC Design is a simple CRUD application built using the MVC (Model-View-Controller) design pattern to manage employee data efficiently and cleanly separate business logic, views, and control flow.

Employee Hub is a simple Java-based CRUD application built using the MVC (Model-View-Controller) design pattern. This project allows users to Add, Read, Update, Delete, and List employee details efficiently.

It leverages Hibernate as the ORM framework for database interaction, and MySQL as the backend database.

Features:-
----------

1)Add new employee records.

2)View employee details by ID.

3)Update existing employee information.

4)Delete employee records.

5)List all employees in the system.

Technologies Used:-
-------------------

1)Java

2)Hibernate (JPA)

3)MySQL

4)JDBC (via Hibernate)

5)MVC Architecture

Database Handling:-
-------------------

All database operations are handled safely and efficiently. Connections are properly opened and closed for each transaction, ensuring data integrity and preventing leaks.

Structure:-
-----------

model – Java classes representing the data model.

controller – Handles user inputs and business logic.

repository – Contains Hibernate data access logic.

view – CLI-based interface for user interaction.

util – Utility/helper classes (for only Commonly used methods).
