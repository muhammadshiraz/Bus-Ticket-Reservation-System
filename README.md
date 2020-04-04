<p align="center">
  <img src="https://user-images.githubusercontent.com/45601530/78453649-85d4f500-76ac-11ea-9168-ffe6ff06fc8f.png">
</p>

# Online Bus Ticket Reservation System

## Project Introduction

**SRC Travel Agencies** is a domestic privatized transportation company that runs the vehicles all over the country. They have several branches at different locations of the country, so that they can provide the transportation facilities between the places. They want and desktop application to be developed, where the details of the bookings done and the customer will be updated from time to time and user can track the details of the available seats immediately.

## Functional Requirements:

1. The details of the buses, Price list, and Employee details are to be maintained and controlled solely by the (Manager) Admin alone.

2. The Employer can change alone the password assigned to him.

3. Also first the employer needed to login first in order to perform the booking actions.

4. Calculations of the charges and the reimbursements are to be implemented by the application alone as designated by the Admin

5. The details of the buses and seats available are to be maintained and can be updated regularly (of course only by the admin)

6. Enquiry form, Booking form and the pricing list are to be maintained in separate forms.

7.There should be new, update, cancel and search options available.

## Existing Scenario:

SRC Travel Agencies is the agency that provides the transportation facility to the customers based on their requirements. They provide different buses like Express, Luxury, and Volvo (Has two types A/C and Non A/C). The charges are different for different buses. The charges are in the below mentioned format.
 
Express - Luxury - Volvo (Non A/C) - Volvo (A/C) -
 
The charges also depend on the distance the customer wants to travel and as well on the age of the customer. The charges also depends on the age, i.e., up to the age of 5 years there will not be any charges, in between 5 12 there will be half charges and for above twelve the charges will be full till the age of 50 and for the age above fifty they will get a discount of 30%. They implement this in order to attract the customers.

## Proposed Solution

Now they want incorporate an application where they can maintain the records of the buses along with the details of the customers. The customer can now book the tickets by visiting the booking counters at their place (nearby) to the respective destination as required. They also want to incorporate some feature which performs the tasks that they actually perform, and an application where the user can register a customer and then book the tickets. A database should be maintained where the bus details along with the bus number, route, the places it covers throughout the distance and also the timings are needed to be maintained. Also the details of the customers that are entered at the time of booking the tickets are needed to be gathered in the database. So that they can track the details of the Customer at any time using the search option based on the starting place, age, name, destination place and Date and Time and even based on the bus they had chosen. The database should also maintain the list of the Employers as they alone book the tickets with the username and password. The list that is to be maintained is personal details, contact details; location, qualification, age, etc are needed to be gathered.  There should be buttons like New, Update and Cancel are to be included. Based on the button chosen the respective action is needed to be performed. Also if the Employee record is entered (The Employee details will be maintained by the Admin alone), it will ask for the username and the password (the password can be changed by the Employee) through which he can login in to the a/c so as to perform the booking tasks. Also for canceling the ticket, there is a limit like, if cancelled before 2 days then the whole money will be returned, and if done one day before, then 15% is debited from the total amount and the remaining amount is returned and if done on that day 30% is debited from the total amount and the remaining is to be returned back. This action is also to be performed by the application alone.

They want the application to be maintained in different details like the buses and the bookings information. When they try to book a ticket it should ask for the customer details like the name of the customers for whom the tickets are booked, Date and Time, Starting and Destination place and the age ( as the charges depends on the age). Also the Bus no. and the seat no. for which the ticket (s) booked are to be entered so that they can keep track of the bookings done.
Whenever a customer enquiries for the availability they can check through the Enquiry form where the details like Destination Place, Starting Place, Date and Time are asked, by entering these details (all fields are not mandatory) the availability details should be displayed. Also there should be a search option through which the records of the customers and the buses can be known easily with the same above options.

After the ticket is booked, user should be able to print the ticket, including the details like age, name, Date and time for which the ticket is booked and as well the destination and Starting locations and the charges for the ticket including the taxes.
The application alone should be able to calculate the payments as per the age criteria and the distance. Also it has to be updated in the site.

## PROJECT PLAN

### Purpose of Plan: - **SRC Travel Agencies**

**Database:** bus.sql

#### The Project Plan defines the following: -
<ul>
Project Purpose</li>
<li>Business and Project Goals and Objectives</li>
<li>Score and Expectations</li>
<li>Roles and Responsibilities</li>
<li>Assumptions and Constraints</li>
<li>Project Management Approach</li>
<li>Ground Rules for the Project</li>
<li>Project Budget</li>
<li>Project Timeline</li>
</ul>

<h1 align="center">Snapshots</h1>
<div align="center">
<h2>Login Window:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453691-cdf41780-76ac-11ea-811e-89dc48a3c9d2.png">
<h2>Main Window:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453708-e6fcc880-76ac-11ea-9fe8-c5c7bde9e497.png">
<h2>Add Buses:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453727-00057980-76ad-11ea-84e4-10dc40397887.png">
<h2>Add Route:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453748-29bea080-76ad-11ea-954b-48a3249e1e36.png">
<h2>Add Routine:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453772-570b4e80-76ad-11ea-8008-be3ba2982637.PNG">
<h2>Add Employee:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453781-73a78680-76ad-11ea-91da-9b11699c1e29.PNG">
<h2>View and Update Busses:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453840-ced97900-76ad-11ea-926b-17962394b931.png">
<h2>View and Update Routes:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453863-ea448400-76ad-11ea-9e0e-f9006e17f222.PNG">
<h2>View and Update Routine:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453890-09dbac80-76ae-11ea-9b40-c326db744fdb.PNG">
<h2>Booking Window/ Employee Window:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453907-1e1fa980-76ae-11ea-943a-7b14ccdfa0c3.PNG">
<h2>Add Customers:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78453927-3f809580-76ae-11ea-907f-3ebfcc3d25f3.PNG">
<h2>View Customers:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78454030-e8c78b80-76ae-11ea-9238-177f7a7e276c.PNG">  
<h2>Add Booking:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78454066-2d532700-76af-11ea-87e0-e7010ffc3c56.PNG">
<h2>Cancel Booking:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78454082-41972400-76af-11ea-9add-9626a00b1677.PNG">
<h2>View Tickets:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78454112-7a36fd80-76af-11ea-8efc-528fc0f87d4f.PNG">
<h2>Enquiry:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78454126-8a4edd00-76af-11ea-8ede-b4956f3620ca.PNG">  
<h2>Price List:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78454139-a0f53400-76af-11ea-97a5-747ee00729a1.PNG">
<h2>Change Password:</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78454168-cda94b80-76af-11ea-8332-a9063837512f.PNG">
<h2>ER-Diagram</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78454200-0e08c980-76b0-11ea-9c03-d05ed7e91c65.jpg">
<h2>Flow Chart</h2>
  <img src="https://user-images.githubusercontent.com/45601530/78454254-5cb66380-76b0-11ea-96d6-02d62900e590.jpg">
</div>

## FUTURE SCOPE
Online Bus Ticket Reservation System has as many Future Scope as think of some of the few point have come to light. They are as follows: -
<ul>
<li>Launching the software on the Network.</li>
<li>Using JAVA programming on Higher scale using Hardware</li>
<li>Programming such as Bus Ticket Reservation</li>
</ul>

## Hardware/Software requirements
### Hardware
<ul>
<li>A minimum computer system that will help you access all the tools in the courses is a Pentium D 1.2Ghz or better</li>
<li>2048 Megabytes of RAM or better</li>
<li>Windows Xp(or higher if possible)</li>
<li>Java Virtual Machine</li>  
</ul>

### Software
<ul>
<li>Notepad/HTML editor/Java editor</li>
<li>j2sdk1.4.1_02 (or later)</li>
<li>SQL Server 2005/2008 RTM</li>
<li>JDBC Driver</li>
</ul>

## User Guide

### System Requirements

<table>
<tbody>
<tr>
<td width="45"><strong><u>No.</u></strong></td>
<td width="240"><strong><u>Items</u></strong></td>
<td width="347"><strong><u>Description </u></strong></td>
</tr>
<tr><td width="45">1</td>
<td width="240">Operating System</td>
<td width="347">Window 98,2000,XP etc</td>
</tr>
<tr>
<td width="45">2</td>
<td width="240">Main processor</td>
<td width="347">Minimum 166 or better</td>
</tr>
<tr>
<td width="45">3</td>
<td width="240">Ram (Memory)</td>
<td width="347">Minimum 64 or better</td>
</tr>
<tr>
<td width="45">4</td>
<td width="240">Software</td>
<td width="347">Net beans/Text pad/Notepad/Sql/Cmd</td>
</tr>
</tbody>
</table>

### There is One Admin:
<ol>
  <li><strong>Username:</strong> Admin</li>
  <li><strong>Password:</strong> admin</li>
</ol>

### There are Many Users:
<ol>
  <li><strong>Username:</strong> waleed</li>
  <li><strong>Password:</strong> 123</li>
  <li><strong>Username:</strong> ali</li>
  <li><strong>Password:</strong> 123</li>
</ol>

### For Net Beans:
<ul>
<li>Open Net Beans and Open Aptitude Test System</li>
<li>Add  Sqljdbc4.jar to the library</li>
<li>Now run login.java  file.</li>
</ul>
<div align="center">
<h2>SQL Server Configuration Manager</h2>
<img src="https://user-images.githubusercontent.com/45601530/78452312-0f33f980-76a4-11ea-9a97-ef661cfd62f3.png">
</div>
