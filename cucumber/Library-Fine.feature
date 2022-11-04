Feature: Libary Fine

    Scenario: Book is returned on or before the expected return date
    Given the current date is on or before the return date
    When the book is returned
    Then no fine will be charged (fine = 0)

    Scenario: Book is returned after the expected return date, but within the same month of the return date
    Given the current date is after the return date 
        And the current date is within the same month of the return date
    When the book is returned
    Then the fine is 15 times the number of days late

    Scenario: Book is returned a month after the expected return date, but within the same year of the return date
    Given the current date is over a month after the return date
        And the current date is within the same year of the return date
    When the book is returned
    Then the fine is 500 times the number of moths late

    Scenario: Book is returned a year after the expected return date
    Given the current date is over a year after the return date
    When the book is returned
    Then the fine is 10,000