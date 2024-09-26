# War Card Game

## Overview
The War Card Game is a command-line game implemented in Java. The game is played between two players, where the objective is to win all the cards from the opponent. It leverages fundamental programming principles such as abstraction, encapsulation, inheritance, and polymorphism to create a structured and efficient gameplay experience.

## Features
- Two-player gameplay
- Randomized card shuffling
- Basic game rules implemented
- Utilizes key programming concepts: 
  - **Abstraction**: Simplifies the game mechanics to essential features.
  - **Encapsulation**: Protects game state and logic within classes.
  - **Inheritance**: Allows for code reuse and extension through subclasses.
  - **Polymorphism**: Enables method overriding for different card behaviors.
- Display of the winner at the end of the game

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A compatible IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/alexbascevan/War-Card-Game.git
   ```
2. Navigate to the project directory:
   ```bash
   cd War-Card-Game
   ```
3. Open the project in your preferred IDE.

### Running the Game
1. Compile the Java files:
   ```bash
   javac src/*.java
   ```
2. Run the main class:
   ```bash
   java src/Main
   ```

## How to Play
1. The game starts by shuffling the deck of cards.
2. Each player draws a card from their deck.
3. The player with the higher card wins the round and takes both cards.
4. In the event of a tie, players will continue to draw cards until a winner is determined.
5. The game continues until one player has all the cards.

## Contributing
If you'd like to contribute to the project, please fork the repository and submit a pull request. Any contributions, suggestions, or feedback are welcome!
