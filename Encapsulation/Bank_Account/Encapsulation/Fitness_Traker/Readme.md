# Health Monitor System (Fitness Tracker)

A Java-based simulation of a wearable fitness tracker. This project focuses on **State-Driven Encapsulation**, where internal data changes automatically trigger safety protocols.

## Project Objective
The goal is to demonstrate how encapsulation can be used for **Safety Systems**. By hiding the `heartRate` and `isExercising` status, we can ensure the monitor "decides" when it is safe to continue exercising, rather than letting the user bypass safety thresholds.

## Core Concepts
- **Automatic State Transitions:** Changing the heart rate can automatically force the exercise status to stop.
- **Interdependent Logic:** Certain actions (like resetting steps) are blocked unless specific conditions (resting heart rate) are met.
- **Input Validation:** Ensuring steps and heart rate stay within realistic, non-negative bounds.

## Business Rules
1. **Safety Cut-off:** If the heart rate exceeds **180 BPM**, the monitor automatically sets the status to `Not Exercising` and issues a warning.
2. **Restricted Reset:** Daily steps can only be cleared if the user's heart rate is below **100 BPM** (ensuring they have rested).
3. **Data Integrity:** Steps cannot be added as negative values.
4. **Summary View:** Provides a formatted string showing all vital signs without exposing private variables.

## Project Structure
- `HealthMonitor.java`: The core logic containing the safety thresholds and state management.
- `FitnessTest.java`: The main class used to simulate a workout session and test the safety cut-off logic.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Run `FitnessTest.java`.
3. Observe the console to see how the system reacts when the heart rate reaches dangerous levels.

---
*Part of a series of Java OOP projects focused on mastering Encapsulation.*