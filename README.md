TicTacToes
==========
So easy, you could play with your toes!

Prerequisites
----
To run Tic Tac Toes on your local machine you will need the following:

- A unix-based operating system
- Git
- Java 1.7+
- Maven

Quick Start
------

clone the repo to your local machine and run

`bin/run`

This should automatically install all dependencies and fire up a local Jetty server listening on port 4567.

Building
------

To create a runnable jar, run the following command in the root of the project.

`mvn package`

This will run all tests, and if they pass, create a target folder which contains the jar file with dependencies, along with code-coverage reports.
To remove this folder run 

`mvn clean`


Testing
------
To run unit tests:

`mvn test`

And run integration tests with 

`mvn integration-test`

Contribution Guidelines
------
A pull request should not be made without thorough integration tests.
Each time a commit is made to the repo travis runs unit and integration tests to make sure the build passes. If the tests pass, travis pushes the new version to heroku, and the changes go live.

Development lifecycle
-----

If you wish to contribute to TicTacToes you should follow these simple steps:

0. Create a feature branch.
1. Run `mvn test`
2. Add a test for the functionality you are trying to add (it should fail initially)
3. Make the test pass in whatever way possible
4. Repeat the above steps in a interative fashion until you have readable, logical code that belongs in the project.
5. Commit your changes.
6. Push to your feature branch
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
 



