#  Digital Wallet System

A Java implementation of a financial wallet using **Encapsulation** to enforce strict transaction rules and protect user funds.

## Project Objective
The primary goal of this project is to demonstrate **Information Hiding** and **Validation logic**. By encapsulating the `balance`, we ensure that the wallet's state can only be changed through authorized and validated methods, preventing "illegal" states like negative balances.

##  Core Concepts
- **Encapsulation:** All data members are `private` to prevent direct external manipulation.
- **Transactional Integrity:** Using "Gatekeeper" logic to verify deposits and withdrawals.
- **Read-Only Access:** Providing a public getter for the balance while keeping the setter logic internal and protected.

##  Business Rules
1. **Balance Integrity:** The balance can never drop below `0.0` (No overdrafts).
2. **Deposit Validation:** Only positive amounts are accepted for deposits.
3. **Withdrawal Validation:** Withdrawals must be greater than zero and less than or equal to the current balance.
4. **Data Privacy:** The internal balance variable is completely hidden from external classes.

## Project Structure
- `DigitalWallet.java`: The core blueprint containing the encapsulated logic and business rules.
- `WalletTest.java`: A simulation class used to test valid transactions and verify that invalid attempts are blocked.

##  How to Run
1. Open the project in IntelliJ IDEA.
2. Navigate to the `WalletTest.java` file.
3. Click the green "Run" button to see the transaction logs in the console.

---
*Created as part of a personal Java development journey to master Object-Oriented Programming.*