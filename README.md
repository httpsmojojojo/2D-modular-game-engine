# 2D Modular Game Engine

Welcome to the 2D Modular Game Engine project! This repository contains the source code for a flexible and modular game engine designed for 2D games. This is a project for our OOP class.

## Members

- 23BSCS003
- 23BSCS012
- 23BSCS026
- 23BSCS034
- 23-22BSCS042

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [File Structure](#file-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Running the Game Engine](#running-the-game-engine)
  - [Creating and Modifying Levels](#creating-and-modifying-levels)
- [Architecture](#architecture)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Entities**: Base classes for different types of game entities, including players and mobs.
- **Level Management**: Tools for managing and loading levels with tile-based graphics.
- **Graphics Rendering**: Handles rendering of game objects and UI elements with support for spritesheets.
- **Networking**: Basic client-server networking capabilities for multiplayer support.
- **Input Handling**: Keyboard input management for player interactions.
- **Window Handling**: Manages the game window, supporting window events and resizing.

## File Structure
```plaintext
2d-modular-game-engine
├── res
│   ├── levels
│   │   ├── small_test_level.png
│   │   └── water_test_level.png
│   └── spritesheet.png
├── src
│   └── ca
│       └── group1
│           └── game
│               ├── entities
│               │   ├── Entity.java
│               │   ├── Mob.java
│               │   ├── Player.java
│               │   └── PlayerMP.java
│               ├── gfx
│               │   ├── Colours.java
│               │   ├── Font.java
│               │   ├── Screen.java
│               │   └── SpriteSheet.java
│               ├── level
│               │   ├── tiles
│               │   │   ├── AnimatedTile.java
│               │   │   ├── BasicSolidTile.java
│               │   │   ├── BasicTile.java
│               │   │   └── Tile.java
│               │   └── Level.java
│               ├── net
│               │   ├── packets
│               │   │   ├── Packet.java
│               │   │   ├── Packet00Login.java
│               │   │   ├── Packet01Disconnect.java
│               │   │   └── Packet02Move.java
│               │   ├── GameClient.java
│               │   └── GameServer.java
│               ├── Game.java
│               ├── GameLauncher.java
│               ├── InputHandler.java
│               └── WindowHandler.java
├── LICENSE
└── README.md
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- IDE (e.g., IntelliJ IDEA, Eclipse, VSCode)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/httpsmojojojo/2d-modular-game-engine.git
   ```
2. Navigate to the project directory:
   ```bash
   cd 2d-modular-game-engine
   ```
3. Compile the engine:
   ```bash
   javac -d bin src/**/*.java
   ```

## Usage

### Running the Game Engine
1. Open the project in your preferred IDE.
2. Run the `GameLauncher` class to start the engine:
   ```bash
   java -cp bin ca.group1.game.GameLauncher
   ```

### Creating and Modifying Levels
Levels are defined in the `res/levels` directory, with existing sample levels like `small_test_level.png` and `water_test_level.png`. You can add new levels by creating images that represent the tiles, which can then be loaded and rendered by the engine.

## Architecture
This engine uses a modular architecture, organizing code by functionalities:

- **Entities** (`entities/`): Contains base classes like `Entity`, `Mob`, `Player`, and `PlayerMP`, representing game objects with movement and interaction capabilities.
- **Graphics** (`gfx/`): Manages colors, fonts, screen rendering, and spritesheets.
- **Level Management** (`level/`): Handles tile-based levels and includes classes like `AnimatedTile`, `BasicSolidTile`, `Tile`, and `Level`.
- **Networking** (`net/`): Supports multiplayer functionality, with packet handling and client-server communication classes.
- **Core**: The main game engine logic, including `Game`, `GameLauncher`, `InputHandler`, and `WindowHandler`.

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Make your changes in a separate branch.
3. Submit a pull request with a description of your modifications.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```
