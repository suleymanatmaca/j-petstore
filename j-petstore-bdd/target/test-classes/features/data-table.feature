Feature: Datatable example

#DataTables in Cucumber	
Scenario: As a user, I want to view all the categories 

	Given I Login to the application with valid 232423432432 and 12345678
	When I click on a category, then a category is displayed 
		| FISH |
		| CATS |
		| DOGS |
		| REPTILES |