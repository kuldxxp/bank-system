Bank Management System (Java Swing + MySQL)
===========================================

A desktop banking app built with Java Swing and JDBC that simulates core retail-banking flows: opening an account, deposits/withdrawals, balance inquiry, transaction history, and admin management.

Features
========

*   **Admin**
    
    *   Secure admin login, create/manage customer accounts, toggle active/inactive, view customer list, view full transaction history, and perform deposit/withdrawal operations.
        
*   **Customer**
    
    *   Login with PIN, self-register/open account, transfer funds (local/international/domestic), view statements and balance, change password/PIN.
        

Screenshots
===========

The report includes UI captures of the **ATM-style transaction screen** (deposit, cash withdrawal, balance inquiry, etc.) and the **New Account (Signup) form** built in Swing/NetBeans. See pages 27–28 of the project report for reference.

Tech Stack
==========

*   **Language/UI:** Java (Swing/JFC) with JFrame-based forms (e.g., Deposit.java, Signup.java).
    
*   **DB:** MySQL via JDBC (examples use simple INSERT into bank and signup tables).
    
*   **Libraries/Tools:** com.toedter.calendar.JDateChooser for date input; development shown in NetBeans IDE 8.2.
    

Core Modules (Examples)
=======================

*   **Deposit** – takes an amount and records a Deposit transaction with timestamp and customer PIN.
    
*   **Signup** – captures personal details (name, father’s name, DOB, gender, email, marital status, address, city, pin code, state) and persists them to the signup table.
    

Getting Started
===============

Prerequisites
-------------

*   JDK 8+
    
*   MySQL server
    
*   NetBeans or your preferred Java IDE
    
*   jcalendar (for JDateChooser)
    

Database (example schema)
-------------------------

Create a database and two basic tables that match the SQL inserts used in the code (bank, signup). Adjust types/lengths as needed.

`   sqlCopyEditCREATE TABLE signup (    formno    VARCHAR(20) PRIMARY KEY,    name      VARCHAR(100),    fname     VARCHAR(100),    dob       DATE,    gender    VARCHAR(10),    email     VARCHAR(120),    marital   VARCHAR(20),    address   VARCHAR(200),    city      VARCHAR(80),    pincode   VARCHAR(20),    state     VARCHAR(80)  );  CREATE TABLE bank (    pin       VARCHAR(20),    tx_date   DATETIME,    tx_type   VARCHAR(20),  -- e.g., 'Deposit', 'Withdrawal', 'Transfer'    amount    DECIMAL(12,2)  );   `

> The code demonstrates inserts such asinsert into bank values('', '', 'Deposit', '') andan insert into signup with the fields listed above.

Configure JDBC
--------------

Update your database credentials in the Conn class (present in the project) so JDBC can connect to MySQL.

Run
---

*   Build the project in NetBeans (as shown in the report) and run the UI starting from the signup or main dashboard window (e.g., Signup.java, then navigate to transactions like Deposit).
    

Usage Overview
==============

*   **Open account:** Fill the Swing signup form and submit; a record is added to signup.
    
*   **Deposit/Withdraw:** Enter an amount; a row is added to bank with the user’s PIN, timestamp, type, and amount.
    
*   **Admin:** Log in to review users, toggle account status, and inspect transaction histories.
    

Security & Disclaimer
=====================

This is a learning project. The sample code uses string-concatenated SQL (e.g., the deposit INSERT) and simple PIN handling—do **not** deploy as-is. For production, add password hashing, parameterized queries/ORM, input validation, role-based access control, auditing, and proper error handling.
