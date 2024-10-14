Use case Diagram
A use case diagram is a graphic representation of a system that shows the many ways in which users engage with it. It is a part of the Unified Modeling Language (UML) and is widely used in software engineering to document and communicate the functional requirements of a system. 

![image](https://github.com/user-attachments/assets/7fe5d73e-d3e3-4dc5-884c-92cfbcdc7f49)

Figure 1 -Use case Diagram
Assumption
This use case diagram assumes that every user should login to system for use this system.
Only the admin can add system users like manager assistant and new admins.
System admin can add new users and delete them. The system admin can't see employee details.
Manager position system users can add new employee details and also update delete and search their details. Only the Manager can add departments and designations.
The assistant position users have their limitations assistant users can search for employee details and view all employee details but they can't update or delete employee details.
Every worker has a unique employee id number.

b)	Class Diagram
In the Unified Modeling Language (UML), a class diagram is a sort of static structural diagram that shows the classes, attributes, operations (or methods), and links between the classes to represent the structure of a system. In software development, class diagrams are often used to illustrate and document a system's design.
Main elements in a class diagram.
Class: Represents an object's blueprint or template. It outlines the actions (methods) and characteristics that objects derived from the class will possess.
Attributes: Describe the attributes or features of a class. In a class, attributes are frequently shown as variables that represent an object's state.
Methods: Represent the operations or behaviors that a class can perform. Methods are functions or procedures associated with a class and define its behavior.
Inheritance: Represents an "is-a" relationship between classes. It shows that one class (subclass or child class) inherits attributes and behaviors from another class.

 ![image](https://github.com/user-attachments/assets/83d86d4e-519c-4b06-b50d-c5e64174eccf)

Figure 2-Class Diagram
 
This class diagram shows the eight classes login, manager, assistant, admin, add user, view and search add employee details designation department. The admin has four tasks add search update and delete system user details. 
Manager user can enter new departments and designations.
The add employee details department designation has four tasks add employee details update employee details search employee details and delete employee details.
The task of the assistant is to search for employee details.

c)	Sequence Diagram
In the Unified Modeling Language (UML), a sequence diagram is a sort of interaction diagram that shows how objects or components interact with one another over time. It displays the exchange of messages and the sequence in which they occur amongst various entities (i.e., objects or actors). Sequence diagrams are very helpful for illustrating how a system behaves dynamically when a certain scenario or use case is being carried out.

 ![image](https://github.com/user-attachments/assets/e01fb2cd-470c-4338-892d-6086c1ef35e8)

Figure 3-Sequence Diagram
This sequence diagram shows the Admin login in the system. Access to the system is permitted only if the user enters the correct username password and correct user type. If any user input is wrong user can't log into the system.

 ![image](https://github.com/user-attachments/assets/5bf4ba0f-3680-4c4e-94e0-efac3c0948c0)

Figure 4-Sequence Diagram
This sequence diagram illustrates the assistant search function . Assistants can search employee details by using their departments.

 ![image](https://github.com/user-attachments/assets/371b158b-e395-4c10-b9fb-2bd55ae72474)

Figure 5-Sequence Diagram
This sequence diagram shows how to delete employee details and view data in the database. First, the user select the employee ID after that clicks the delete button and the program runs the query. After that displaying the successful message.


User Manual

This system you can use to store your company employee details Organized. So you can use your employee details more accurately.

User Login
![image](https://github.com/user-attachments/assets/9d4fbd08-6687-4394-bd94-a48f32811df1)

 
Figure 9-User Login
This system has three user types admin, manager and assistant. The system admin can add users. every user should login to system. System user should enter correct username password and correct user type to enter the system. If you want to see your password you can click show password checkbox. If the system user wants to exit the system, the user can use exit button.


Admin User Interface.
![image](https://github.com/user-attachments/assets/732fa52b-1062-403d-aae5-51240c294fa5)

 
Figure 10-Admin User Interface.

Once you have provided the correct username, password and user type clicking the 'login' button will grant you access to the admin menu interface, where you can perform various manager related tasks and functions. This is Admin Interface admin has four main functions add, search, update and delete. Admin can add new system users like new admin, manager and assistant. 
Add Button:
If you wish to create a new system user, simply enter a username and password, select a user type, and click the "add" button.
Search Button
System admins can search for system user details by entering the username and clicking on the search button. This saves time and improves overall efficiency, especially in systems with a large number of users. After the searching you can update system user details easily.
Delete Button:
If you want to delete a system user, you should first search for their details and then click the "delete" button.
Over time, user accounts may need to be deactivated or removed for various reasons, such as when an employee leaves the organization or when an account is no longer required. The "delete" button facilitates effective user account management.
Clear Button:
Sometimes, you might need to correct a mistake. By clicking clear  button, you can erase any text or data entered into the input fields.
Home Button:
The home button we can use get back into the login interface. The "Home" button allows users to navigate directly to the main or starting point of the application, which is often the login interface. This is particularly useful when users want to log in with different credentials.
 
Figure 11-Home Button:
![image](https://github.com/user-attachments/assets/a39afd9c-c08f-4235-8a6d-aeee892f913b)





Manager Main Interface
![image](https://github.com/user-attachments/assets/12403678-689c-4b18-a80c-61c5ca4d4038)

 
Figure 12-Manager Main Interface

Once you have provided the correct Manager username, password and user type clicking the 'login' button will grant you access to the Manager menu interface.
If you want to manage employee details like add, delete, or search, the user can click “Manage Employee” button after that you will display manage employee interface.  
User want to add or delete department user can click “Add Department” button.
User want to Add new Designation or delete designation user can click “Add Designation ” button.
User Want to go to Login interface again user can click “Home” button after that user will display login menu interface. 

 
Figure 13-Manage Employee Interface
![image](https://github.com/user-attachments/assets/22236b37-b6f5-4802-84e0-9bb198ceb6c4)


This is Admin Interface manager has five main functions add, search, update and delete and view. Manager can add new employee details easily.
Add Button:
Add function work for adding employee details to our database. Users want to add employee details to our database after filling all this fields you can click “Add” button.



Search Button:
System managers can search employee details by entering the username and clicking on the search button. With a search button, system managers can quickly locate specific employee details by entering the employee ID rather than manually scrolling through a long list of users.

Update Button:
The "update" button allows Managers to modify and correct employee information as needed. This ensures that the employee database remains accurate and up-to-date, reflecting any changes in personal details, job roles, or other relevant information.
Delete Button:
The delete button is essential for the off-boarding process when an employee leaves the organization. It allows administrators to remove the user's account and associated data from the system, preventing unauthorized access after departure.
View Button:
The "view" button in an Employee Management System is an important feature that provides users, such as managers assistant with the ability to access detailed information about a specific employee. By clicking the "view" button, users can access a comprehensive view of an employee's profile, including personal details, job-related information, contact information and other relevant data.
Clear Button:
The "clear" button in an Employee Management System is a feature that allows users to reset or clear the input fields in a form or search interface. Users may input incorrect information or change their minds while filling out a form. The "clear" button allows them to quickly undo their entries and start fresh, improving the efficiency of the data.

Home Button:
The home button we can use get back into the login interface. Users may need to switch between different roles within the system. The "Home" button provides flexibility, enabling users to reset their context and start a new workflow.
Manager View Interface.
![image](https://github.com/user-attachments/assets/bc8bb086-93ed-4448-8171-33a88301dd20)

 
Figure 14-Manager View Interface.
After the clicking “View” button this interface appears.
View Data Button:
After selecting a department from the menu and clicking "view data," all of the information within that department will be displayed. Users can quickly and easily retrieve information specific to a particular department without having to sift through data for the entire organization. This focused approach saves time and improves efficiency
Search Bar:
User can use search bar for Search Employee details based on department, designations, name, EPF number. Users can quickly and efficiently retrieve specific employee details by entering relevant search criteria into the search bar. This streamlines the process of finding information, saving time and effort.
Home Button:
User can use the “Home” button to go to manager home interface.

Add Department Interface.
![image](https://github.com/user-attachments/assets/8a269284-b3d9-4e45-91f2-41d19828665d)

 
Figure 15-Add Department Interface.
User can easily add a new department by entering the name and clicking the “Add” button.
To delete an existing department, please enter the department name and then click on the delete button.
To access the main interface of the manager, the user can utilize the home button.




Add Designation Interface
![image](https://github.com/user-attachments/assets/d686b57b-4875-4c58-b4f3-7cad1878eaaa)

 
Figure 16-Add Designation Interface
User can easily add a new designation by entering the new designation name and clicking the “Add” button.
To delete an existing designation, please enter the designation name and then click on the delete button. To access the main interface of the manager, the user can utilize the home button.
Assistant Login
 
Figure 17-Assistant Login
![image](https://github.com/user-attachments/assets/866109ab-37b4-4d4e-82d3-44bfa30305d6)


Assistant User Interface
![image](https://github.com/user-attachments/assets/86f6815a-c996-4411-8eb9-e1bb9c5993be)

 
Figure 18-Assistant User Interface
This system provides users with the ability to search and access comprehensive employee details. Users can view information such as job designation, department, contact information, and other relevant data. However, it's important to note that the system does not allow users to make any changes to the employee records. This ensures that the data remains accurate and up-to-date, while also maintaining the security and privacy of the employees' information.

Search Button:
System assistant can search employee details by entering the username and clicking on the search button.
View Data Button:
After selecting a department from the menu and clicking "view data," all of the information within that department will be displayed

Search Bar:
Assistant can use search bar for Search Employee details based on department, designations, name, EPF number . Users can use the search bar to retrieve precise information about a specific employee or a group of employees based on their designated criteria.
