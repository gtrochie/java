# Gym Membership - Logic & String Validation

A Java project focused on data integrity and constructor overloading using String comparisons.

## Project Objective
This project demonstrates how to handle object initialization when the internal state depends on specific String inputs. It ensures that a user cannot bypass pricing tiers by entering invalid plan names.

## Core Concepts
- **String Comparison:** Using `.equalsIgnoreCase()` instead of `==` to safely compare text.
- **Data Integrity:** Preventing "illegal" states (e.g., a "Basic" member paying "Gold" prices).
- **Encapsulation:** Protecting membership data from direct external modification.

## Business Rules (Springs Elite Gym)
| Plan Type | Monthly Fee | Features |
| :--- | :--- | :--- |
| **Basic** | R200 | Standard Gym Access |
| **Gold** | R500 | Gym + Pool + Personal Trainer |

## Project Structure
```text
GymMembership/
├── README.md
└── src/
    ├── GymMembership.java
    └── GymTest.java