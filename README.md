TicTacToes
==========
So easy, you could play with your toes!
Try it at: http://tictactoes.co.vu/

Development setup for osx
--------------------------

1. Navigate to: https://tictacboxen.herokuapp.com/
2. Copy script to terminal and run boxen
3. Get yourself some coffee while script finishes.

Thats it!

Boxen automagically sets up everything you would ever need to develop
tictactoes on your mac. Including git, java, maven and a whole bunch of other
things.

You can find all the config files for our boxen here: https://github.com/0xabad1deaf/boxen
This is how we set up all our new macs here at 0xabad1dea

What about linux, or windows?
Boxen only works on Mac OS X (Mountain Lion or above) and that's what we hack on every day.
See below for basic linux/Windows tictactoe development setup requirements.

Prerequisites
------------
To run Tic Tac Toes on your local machine you will need the following:

- Git
- Java 1.7
- Maven
- If you are on windows, you will need to setup Powershell or a bash shell e.g putty or equivalent before anything else.

Quick Start
-----------

1. Clone the repo to your local machine
    git clone https://github.com/0xabad1deaf/Lateterm

2. Package and run 

`bin/package`
`bin/run`

This should automatically install all dependencies and fire up a local Jetty server listening on port 4567.

Building
------

To create a runnable jar, run the following scipt in the root of the project.

`bin/package`

This will run all the unit tests, and if they pass, create a target folder which contains the jar file with dependencies, along with code-coverage reports.
To remove this folder run 

`bin/clean`


Testing
------
To run unit tests:

`bin/unit_test`

And run integration tests with 

`bin/it_test`

To view current code coverage status, navigate to: http://codecoverage.tictactoes.co.vu/

Travis builds and deployment
------
Each time something is pushed to the repo from any branch, travis wil run unit and integration tests to make sure the build passes. If the push was made to the master branch and all tests passed, travis will deploy the new version to heroku, and the changes go live.

Development lifecycle
-----

If you wish to contribute to TicTacToes you should follow these simple steps:

0. Create a feature branch.
1. Run `bin/unit_test`
2. Add a test for the functionality you are trying to add (it should fail initially)
3. Make the test pass in whatever way possible
4. commit your changes.
5. Repeat the above steps in a interative fashion until you have readable, logical code that belongs in the project.
6. Push to your feature branch (This will start a travis build, which
   runs all unit and integration tests)
7. Navigate to github.com and create a pull request.
8. Wait for a core developer to review your pull request
9. If your request is rejected, review the feedback and go back to step 2.
10. otherwise, congratulations, you have successfully helped revolutionize the world of tic-tac-toe!

Our Vision
========
 Enthusiastically unleash top-line alignments rather than business e-business. Interactively myocardinate economically sound e-services after client-based bandwidth. Proactively harness error-free models vis-a-vis clicks-and-mortar sources. 

Compellingly create goal-oriented total linkage without wireless ideas. Globally orchestrate cross-media catalysts for change via inexpensive metrics. Holisticly supply covalent intellectual capital rather than cooperative best practices. 

Dramatically synergize installed base opportunities and corporate infrastructures. Intrinsicly monetize stand-alone partnerships after standards compliant outsourcing. Credibly impact exceptional channels for scalable schemas. 

Conveniently actualize ethical meta-services with cross functional applications. Energistically promote low-risk high-yield experiences without high-payoff networks.
 



