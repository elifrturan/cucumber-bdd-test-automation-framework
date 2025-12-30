# Selenium Cucumber Test Automation Framework

This repository contains a Java-based Selenium Test Automation Framework developed using Cucumber (BDD).
The project automates functional UI test scenarios and demonstrates professional test automation architecture following industry best practices.

## 📌 Project Overview

This framework focuses on Behavior Driven Development (BDD) principles and automates real-world web scenarios such as:
- Login functionality validation
- Home page loading verification
- Scenario Outline with multiple test data
- Background usage for reusable preconditions
- Separation of test logic using Page Object Model (POM)
- The project is structured to reflect real QA Automation Framework design and is actively extendable.

## 🧰 Technologies & Tools

- Java
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- Maven
- WebDriverManager
- Git & GitHub

## 🧪 Test Features

- Behavior Driven Development (BDD) with Gherkin syntax
- Page Object Model (POM) for clean and reusable code
- Hooks (@Before / @After) for driver lifecycle management
- Scenario Outline for data-driven testing
- Background for shared preconditions
- Explicit waits using WebDriverWait
- Assertion handling with JUnit Assert
- Reusable WebDriver utility

## ▶️ How to Run Tests
### 1️⃣ Clone the repository
```bash
git clone https://github.com/elifrturan/selenium-cucumber-automation-framework
```

### 2️⃣ Navigate to the project directory
```bash
cd selenium-cucumber-automation-framework
```

### 3️⃣ Run tests with Maven
```bash
mvn test
```

## Sample Feature File
```bash
Feature: Login and Home Page Tests

  Background:
    Given user is on login page

  Scenario Outline: Successful login test
    And user types username as "<username>"
    And user types password as "<password>"
    When click button
    Then assert to success

    Examples:
      | username | password    |
      | student  | Password123 |

  Scenario: Home page loading test
    Given go to home page
    When wait two seconds
    Then see "Hello" text
```

## 🚀 Future Improvements
- Parallel test execution
- Test reporting (Allure / Extent Reports)
- Screenshot capture on test failure
- Environment-based configuration (QA / UAT / PROD)
- CI/CD integration (GitHub Actions)
- Cross-browser execution support

## 👤 Author
- Elif Rümeysa TURAN
- Full-Stack Developer | QA Automation Enthusiast
- 📌 GitHub: https://github.com/elifrturan
