@one
Feature: Datatable example

#DataTables in Cucumber
  Scenario Outline: As a user, I want to view all the categories

    Given I Login to the application with valid <User> and <Password>
    When I click on a category, then a category is displayed
      | FISH     |
      | CATS     |
      | DOGS     |
      | REPTILES |

    Examples:
      | User | Password |
      | USER | PWD      |