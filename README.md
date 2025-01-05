**TicTacToe: A Fun and Interactive Two-Player Game in Java**

This program is a straightforward implementation of the classic **Tic-Tac-Toe** game, designed for two players to enjoy in the terminal. It alternates turns between players `X` and `O`, providing an engaging way to play one of the most loved games in programming and logic.

---

### **Features**
1. **Interactive Gameplay**:
   - Players input their moves by specifying the row and column where they want to place their symbol.
   - The game ensures smooth interaction by validating moves and preventing invalid inputs.

2. **Dynamic Board Updates**:
   - The board is displayed after every move, showcasing the current state of the game for both players.

3. **Win and Draw Detection**:
   - Automatically checks for a winner after each move by analyzing rows, columns, and diagonals.
   - If no winner is found and all cells are filled, the game declares a draw.

4. **Clear Instructions**:
   - Prompts guide players through each step of the game, making it easy to understand and play.

---

### **How the Program Works**
1. **Initialization**:
   - A 3x3 board is represented as a 2D character array, initialized with empty spaces (`' '`).

2. **Game Loop**:
   - The game alternates turns between Player `X` and Player `O`.
   - Players enter their moves, which are validated to ensure they are within bounds and on an empty cell.
   - The board updates dynamically, and win or draw conditions are checked after every move.

3. **Winning Logic**:
   - The program checks all rows, columns, and diagonals to detect if a player has successfully aligned their symbols.

4. **Draw Detection**:
   - If no winning combination exists and the board is full, the game ends in a draw.

---

### **Why It’s Exciting**
1. **Engaging Gameplay**:
   - Offers a nostalgic, interactive experience for two players.
2. **Error Handling**:
   - Prevents invalid moves and ensures a smooth gaming experience.
3. **Expandable Design**:
   - The code provides a solid base for adding features like AI opponents or a graphical interface.

This program is a great demonstration of using fundamental programming concepts, such as arrays, loops, and conditionals, to create an interactive and enjoyable game. Perfect for beginners or anyone looking to relive the fun of **Tic-Tac-Toe**!
