@Login

Feature: Admin can login in website
 
Background:
    Given Admin Log in on the AltaTech website
	
	@Login-with-valid-data
  Scenario Outline: Admin can login with valid data
    And Admin enters an email address in the <Email>
    And Admin enters a password in the <Password> 
    When Admin presses the Login button
    Then Admin click button Confirm

    Examples: 
      | Email  		| Password  				|
      | admin			|  RAIVpflpDOg= 		|