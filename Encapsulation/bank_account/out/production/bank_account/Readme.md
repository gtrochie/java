# Bank Account - Constructor Overloading

A Java project demonstrating how to provide multiple initialization paths while maintaining strict data encapsulation.

## Project Objective
This project implements **Constructor Overloading** to handle different user account types (Standard vs. Premium). The focus is on ensuring that regardless of the entry point, the internal `balance` is validated and protected.

## Core Concepts
- **Constructor Overloading:** Defining multiple constructors with different parameters.
- **WTC Folder Structure:** Adhering to the standard `src/` layout used in professional and academic environments.
- **Data Validation:** Enforcing business rules during the object's creation phase.

## Business Rules
1. **Standard Account:** Requires only an `accountHolder` name; balance defaults to `0.0`.
2. **Premium Account:** Takes a name and an `initialDeposit`.
3. **Safety Check:** If a negative deposit is attempted during creation, the system defaults the balance to `0.0`.

## Project Structure
```text
BankAccountProject/
├── README.md
└── src/
    ├── BankAccount.java
    └── BankTest.java