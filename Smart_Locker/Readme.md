# 🔐 Smart Locker System

A Java-based project demonstrating the **Encapsulation** principle of Object-Oriented Programming (OOP). This system simulates a secure digital locker that protects its internal state through strict access rules.

## 🎯 Project Objective
The goal is to master **Information Hiding**. By encapsulating the locker's `pin` and `doorStatus`, we ensure that the security of the locker cannot be bypassed by external classes.

## 🏗️ Core Concepts
- **Private Data Members:** Protecting sensitive information (the PIN).
- **State Management:** Ensuring the locker can only transition between states (Locked/Unlocked) via valid methods.
- **Conditional Access:** Implementing logic that prevents PIN changes unless the locker is already open.

## 📜 Business Rules
1. **Default State:** New lockers are initialized as **Closed** with a default PIN of `1234`.
2. **Authentication:** The `unlock()` method requires the correct PIN to change the status to `Open`.
3. **Security Interlock:** The `changePin()` method will only execute if the locker is currently in an `Open` state.
4. **Visibility:** The `isOpen()` method provides read-only access to the door's status without allowing direct modification.

## 📂 Project Structure
- `SmartLocker.java`: The blueprint containing encapsulated logic and security checks.
- `LockerTest.java`: A test suite to simulate unauthorized access attempts and successful operations.

## 🚀 How to Run
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA.
3. Run the `LockerTest.java` file to see the security logic in action.

---
*Developed as part of my Java OOP learning journey.*