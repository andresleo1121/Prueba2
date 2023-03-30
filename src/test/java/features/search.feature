@RunAll
Feature: Buy in SWAGLABS

    
 @Buy
 	Scenario: Buy two products 
 		Given The user enters the swaglabs page
 		When the user enters name and password
 		Then Select two products
 		Then Select cart
 		Then Fill Out Form
 		Then Click Finish
 		And End
 		
 		
	@Buy2
 	Scenario: Select two products and remove
 		Given The user enters the swaglabs page
 		When the user enters name and password
 		Then Select two products
 		Then Remove products
 		And End
 		
 		
 	@Buy3
 	Scenario: Select three products and remove one  
 		Given The user enters the swaglabs page
 		When the user enters name and password
 		Then Select two products
 		Then Remove one products
 		And End
 		
 		
 	@Buy4
 	Scenario: Select products and cancel the order  
 		Given The user enters the swaglabs page
 		When the user enters name and password
 		Then Select two products
 		Then Select cart
 		Then Fill Out Form
 		Then Cancel the order
 		And End
    
    
