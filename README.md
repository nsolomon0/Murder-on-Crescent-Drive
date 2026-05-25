# About this project
A modular text-based game engine developed in Java that supports branching story paths, randomized gameplay outcomes, and reusable event-driven game logic.

Originally developed as a personal academic project, this game engine became an opportunity to explore object-oriented design, modular architecture, and state-driven gameplay systems in Java.

Design Overview: The project is organized into modular room/event classes, with centralized game-flow management responsible for player progression, state transitions, and ending evaluation.

Project Structure:
- Accusation.java ->
Handles accusation logic and determines game endings based on player decisions and clue accuracy.

- CharactersAndClues.java ->
Randomizes character assignments, clue placement, and gameplay variables to improve replayability.

- Game.java ->
Controls core game flow, room transitions, and rule presentation.

- Study.java, PoolHall.java, Attic.java, Bedroom.java ->
Implements puzzle-solving interactions and clue discovery mechanics within the study, pool hall, attic and bedroom environments, respectively.

- Main.java -> Initializes the game instance and launches the main gameplay loop by invoking the core game controller.

Features
- Branching narrative system with multiple story outcomes
- Randomized gameplay events and decision handling
- Object-oriented architecture for managing players, events, and game states
- Modular design focused on maintainability and extensibility
- Replayable gameplay with multiple progression paths

Technologies Used
- Java
- Object-Oriented Programming (OOP)
- State-driven logic
- Event handling
- What I Learned

Through this project, I strengthened my understanding of:
- designing modular software systems,
- organizing reusable code,
- debugging large interconnected logic flows,
- and managing game state across multiple execution paths.

This project also helped reinforce core software engineering concepts such as abstraction, maintainability, and scalable program structure.

SCREENSHOTS:

Start Screen
<img width="3203" height="1045" alt="image" src="https://github.com/user-attachments/assets/a29ef658-6619-4409-9f34-2d91fb2dd665" />

Making a False Accusation
<img width="2620" height="405" alt="image" src="https://github.com/user-attachments/assets/bd3e9f54-9c78-439a-bbf6-c82d5c18953f" />


True Detective Ending
<img width="2394" height="1068" alt="image" src="https://github.com/user-attachments/assets/6fc85dc4-dbfa-4c5d-96e0-3b9baf3a9d1f" />

