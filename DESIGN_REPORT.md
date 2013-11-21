
Design Report
======

1. java app
-----
The java part of the application is written basically as a command line app. We have a Grid class, with methods to set and clear various parts of the grid. We use this as the world of the game. 

The player and corresponding subclass NPC are used as models for human and computer players. They have instance variables holdin their number of wins, and the NPC class has a random number generator to make a random move.

The Game class is a wrapper class, and interacts with the player classes and updates the grid accordingly. It detects wins and draws and keeps track of the game state. It has an instance of Grid and two Players. It also has a function to return the current state of the game as JSON to communicate with the client application.

The App class defines routes for the client-side javascript to make requests to, and recieve JSON responses.

2. HTML and CSS
------

We used twitter bootstrap to get up and runnig with a nice layout quickly. We created a quick HTML layout and use a table to represent the tic-tac-toe grid.

3. Client software
------

The interaction with the human player and the app is handled with javascript on the client side. We bind click event on each box in the grid, and an event handler in javascript parses the JSON from the server and updates the UI accordingly.

We decided it would be a good idea to allow the player to change symbol-sets, to set us appart from the mass of mediocre tic-tac-toe implementations.