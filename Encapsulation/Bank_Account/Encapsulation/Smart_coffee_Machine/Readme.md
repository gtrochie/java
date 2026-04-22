#Smart Coffee Machine Simulation

A Java project focused on **Resource Management** and **Computed Properties** using Encapsulation. This system manages internal ingredients and calculates output based on available resources.

## Project Objective
The goal is to move beyond simple data protection and implement **Complex Logic**. The machine must track multiple private resources (water and beans) and ensure that actions (brewing coffee) are only performed when all requirements are met simultaneously.

## Core Concepts
- **Computed Properties:** Instead of storing the "number of cups remaining," the system calculates it on the fly using current water and bean levels.
- **Resource Capping:** Using encapsulation to ensure ingredient levels never exceed the physical capacity of the tanks.
- **Multi-Conditional Gatekeeping:** Validating that multiple independent resources are sufficient before allowing a state change (brewing).

## Business Rules
1. **Capacity Limits:** - Water Tank: Max 1000ml
    - Bean Hopper: Max 500g
2. **Brewing Requirements:** One cup requires exactly **250ml water** and **15g beans**.
3. **Transaction Safety:** If resources are insufficient, the `totalBrewedCount` does not increase, and no resources are consumed.
4. **Efficiency:** The system calculates the `Remaining Cups` by identifying the "limiting factor" (the ingredient that will run out first).

## Project Structure
- `CoffeeMachine.java`: The engine containing resource logic and the brewing algorithm.
- `OfficeTest.java`: A simulation class to test refills, brewing cycles, and "out of stock" scenarios.

## How to Run
1. Open in IntelliJ IDEA.
2. Run `OfficeTest.java`.
3. Monitor the console to see ingredient levels decrease as you brew.

---
*Fifth project in the Java OOP Encapsulation Series.*