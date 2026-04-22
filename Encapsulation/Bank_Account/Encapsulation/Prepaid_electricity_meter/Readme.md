# Prepaid Electricity Meter - OOP Encapsulation Project

This project is a Java-based simulation of a prepaid electricity meter, designed to demonstrate the concept of **Encapsulation**.

## Overview
The project simulates a meter where units are managed through strict business logic. By making the data `private`, we ensure that the meter balance can never be manipulated into an invalid state (like a negative balance).

## Core OOP Principles
- **Encapsulation:** Using `private` variables to hide the internal state.
- **Information Hiding:** Protecting the units balance from direct external modification.
- **Validation:** Implementing "Gatekeeper" logic in methods to enforce real-world rules.

## Business Rules
1. **Initial State:** All meters start with `0.0` units.
2. **Top Ups:** Users can only add positive amounts.
3. **Consumption:** Electricity can only be used if there is a sufficient balance.
4. **Safety:** The balance can never drop below zero.

## Project Structure
- `ElectricityMeter.java`: The core class containing the encapsulated balance and logic.
- `Main.java`: The testing class used to verify that the meter's rules work correctly.

## Usage
Run the `Main.java` file in IntelliJ to see the simulation results in the console.