The Guessing Game
The guessing game involves a game ‘object’ and three player ‘objects’. The game generates a
random number between 0 and 9, and the three player objects try to guess it. 
Classes
1. GuessGame
2. Player
3. GameLauncher
The Logic
1. The gameLauncher class is where the application starts. It has the main method
2. In the main() method, a GuessGame object is created and its startGame() method is called
3. The GuessGame objects startGame() method is where the entire game plays out. It
creates three players, then “thinks” of a random number(the target for the players to
guess). It then asks each player to guess, checks the result, and either
4. prints out the information about the winning players or asks them to guess again
Hint :
int randomNumber = (int) (Math.random()*10);
Write a java program for the above logic using classes and objects

Expected Output
I’m thinking of a number between 0 and 9
Number to guess is 7
I’m guessing 1
I’m guessing 9
I’m guessing 9
Player one guessed 1
Player one guessed 9
Player one guessed 9
Players will have to try again
Number to guess is 7
I’m guessing 3
I’m guessing 0
I’m guessing 9
Player one guessed 3
Player one guessed 0
Player one guessed 9
Players will have to try again
Number to guess is 7
I’m guessing 7
I’m guessing 5
I’m guessing 0
Player one guessed 7
Player one guessed 5
Player one guessed 0
We have a winner!
Player one got it right? True
Player two got it right? False
Player three got it right? False
Game is over
