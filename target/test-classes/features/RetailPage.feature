@RetailTest
Feature: Retail Page

  # note for this feature,you have to have an existing account
  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username 'Asrasiraj1232@gmail.com' and password '12345678'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

 @RegisterTest
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website      | taxID | paymentMethod | ChequePayeeName |
      | look    | WWW.Asra.com |  2733 | Cheque        | Ahmad           |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
@EditAccount
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode  | accountName | accountNumber |
      | test     | 532165171 | 4551252155 | saving      |     223112452 |
    And User click on Continue button
    Then User should see a success message
@editInformation
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email                | telephone   |
      | yousuf    | khan     | yousufKhan12413223@gmail.com | 31241242421 |
    And user Click On continue button
    Then User should see a message 'Success: Your account has been successfully updated.'
