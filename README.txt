TestAPICarbonCredits
GitHub
Java

Description
TestAPICarbonCredits is a Java project for testing the Carbon Credits API. It uses the RestAssured library for API testing and JUnit for test automation. This project includes test cases to validate various aspects of the Carbon Credits API, including name, CanRelist property, and promotional descriptions.

Table of Contents
Getting Started
Prerequisites
Running the Tests
Generating Surefire Reports

Getting Started
To get started with this project, follow the instructions below.

Prerequisites
Before running the tests, ensure that you have the following prerequisites installed:
Java 17 or later
Maven

Running the Tests
Clone the repository to your local machine:
git clone https://github.com/sandytester/TestAPICarbonCredits.git
Navigate to the project directory:
cd TestAPICarbonCredits
Run the tests using Maven:
mvn clean test
This command will execute the test cases against the Carbon Credits API.

Generating Surefire Reports
After running the tests, you can generate Surefire reports for test results. The reports are generated using the Maven Surefire Plugin.

To generate the Surefire report, run the following Maven command:
mvn surefire-report:report
The Surefire report will be available in the target/site/surefire-report.html file. Open this HTML file in a web browser to view the test report.
