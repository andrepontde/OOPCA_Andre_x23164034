This project is a game where players guess if one item's carbon footprint is higher or lower than another's. The game runs with a graphical interface that provides feedback and tracks player progress.

Class Structure

gamePopulation Class
Responsible for managing level data and saving/loading it from a file.
Ensures levels are stored and retrieved correctly for developers to edit.

GameManager Class
Manages the game information for the entire game, so that the GameEngine class only needs to call some functions from this class to keep the code cleaner.

Question Class
Represents individual levels, holding details such as the prompt, the correct answer, and feedback.

GameEngine Class
Manages the flow of the game, ensuring smooth interaction between data, logic, and the user interface including checking answers and updating scores.
Handles user input and game progression.

GUI Integration
The graphical interface displays questions, receives user input, and shows feedback and scores.
