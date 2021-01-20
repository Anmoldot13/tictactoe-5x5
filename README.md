# tictactoe-5x5

This is a console based TicTacToe game in Java programming language.
Core concepts practiced in this project are 2d arrays and functions used to create a 5x5 board of TicTacToe game.
The winning conditions are exactly like a 3x3 game of TicTacToe.

Flow of the program is something like this:
1. The program prints out a 5x5 board of dashes (-) and (|), signifying empty spots.
2. With each turn it asks either player X or player 0 to enter a number. That number is assigned to a specific empty spot on the 5x5 board which is where they want to place their X and 0, and then the board is printed again with the X or 0 in the right spot.
3. If the position the player (X or 0) entered is already taken, then the program notifies the player (X or 0), who is prompted to enter another number.
4. Once a player wins by getting 5 in a row, column, or diagonal, the program prints that player X or 0 has won and prints out the final board.
5. And if the board limit is reached and no player has 5 in a row, column, or diagonal, then the program notifies that the game ends in a Tie.
