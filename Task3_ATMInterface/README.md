# ATM Interface

## Project Name

ATM Interface

## Objective

The objective of this project is to create a console-based ATM simulation using Java and Object-Oriented Programming. The application allows users to authenticate using a User ID and PIN and perform standard banking transactions such as checking transaction history, withdrawing money, depositing money, transferring money, and quitting the application.

## Features

* User authentication using User ID and PIN
* Maximum of 3 incorrect login attempts
* Access denied after 3 incorrect attempts
* Main menu displayed after successful login
* Transaction History for the current session
* Withdraw money with balance validation
* Deposit money
* Transfer money to another account
* Validates sufficient balance before withdrawal and transfer
* Displays "Insufficient Funds" when balance is too low
* Stores transactions using ArrayList
* Displays transaction details clearly
* Multiple bank accounts supported
* Uses Object-Oriented Programming concepts
* Console-based Java application
* Includes at least 5 Java classes

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* Scanner
* LocalDateTime
* Switch Case
* Loops
* Conditional Statements

## Java Classes

* `ATM.java` — Handles login, menu, withdrawal, deposit, transfer, and transaction history
* `Account.java` — Stores account details, PIN, balance, deposit, and withdrawal operations
* `Transaction.java` — Stores transaction details and date/time
* `Bank.java` — Manages bank accounts and authentication
* `Main.java` — Starts the ATM application

## How to Run

1. Download or clone this repository.
2. Open the project in Eclipse, IntelliJ IDEA, or any Java IDE.
3. Open the `Main.java` file.
4. Compile and run the program.
5. Enter a valid User ID and PIN.
6. Select an option from the ATM main menu.
7. Perform withdrawal, deposit, transfer, or view transaction history.
8. Select Quit to exit the application.

## Sample Login Details

* User ID: `User1`
* PIN: `1234`
* Account ID: `ACC1001`
* Initial Balance: `₹10000`

Other sample accounts:

* User ID: `User2`

* PIN: `5678`

* Account ID: `ACC1002`

* User ID: `User3`

* PIN: `1111`

* Account ID: `ACC1003`

