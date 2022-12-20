@RunAll
Feature: Falabella test cases

 @Shipper
  Scenario: Enter shipper data
    Given the user is in the index page demo serenity
    When the user enters name and password
    When Select Shippers
    And End
    
 @Categories
 	Scenario: Select categories 
 		Given the user is in the index page demo serenity
 		When the user enters name and password
 		Then Select categories
 		And End
 		
	
 		
 		
 		
 		
    
    
