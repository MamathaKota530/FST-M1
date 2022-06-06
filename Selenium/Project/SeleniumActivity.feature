@SeleniumActivity
Feature: Selenium Activities

  @SeleniumActivity1
  Scenario: Verify the website title
    Given User is on LMS Home Page
    Then Verify the title of the LMS website
    And close the browser

  @SeleniumActivity2
  Scenario: Verify the website Heading
    Given User is on LMS Home Page
    Then Verify the Heading of the LMS website
    And close the browser

  @SeleniumActivity3
  Scenario: Verify the title of the first info box
    Given User is on LMS Home Page
    Then Verify the title of the first info box in LMS website
    And close the browser

  @SeleniumActivity4
  Scenario: Verify the title of the second most popular course
    Given User is on LMS Home Page
    Then Verify the title of the second most popular course
    And close the browser

  @SeleniumActivity5
  Scenario: Navigate to the “My Account” page on the site.
    Given User is on LMS Home Page
    And Click on My Account menu item
    Then verify that user is on the “My Account” page on the site
    And close the browser

  @SeleniumActivity6
  Scenario Outline: Open the website and log-in using the provided credentials
    Given User is on LMS Home Page
    And Click on My Account menu item
    Then verify that user is on the “My Account” page on the site
    And Click on Login Button
    And Enter the "<username>" and "<password>"
    And Verify user is on login page
    And close the browser

    Examples:
      | username | password |
      | root     | pa$$w0rd |

  @SeleniumActivity7
  Scenario: Navigate to the “All Courses” page and count the number of courses
    Given User is on LMS Home Page
    And Click on All courses menu item
    Then print the number of courses in the page
    And close the browser

  @SeleniumActivity8
  Scenario Outline: Navigate to the “Contact Us” page and complete the form
    Given User is on LMS Home Page
    And Click on Contact menu item
    And Fill the contact form fields "<FullName>" "<Email>" "<Subject>" "<Message>"
    Then print the message displayed after submission
    And close the browser

    Examples:
    |FullName        |Email             |Subject |Message  |
    |Mamatha Kota    |abc@gmail.com     |Testing | Testing |

  @SeleniumActivity9
  Scenario Outline: Navigate to a particular lesson and complete it
    Given User is on LMS Home Page
    And Click on My Account menu item
    Then verify that user is on the “My Account” page on the site
    And Click on Login Button
    And Enter the "<username>" and "<password>"
    And Verify user is on login page
    And Click on All courses menu item
    Then select any course and complete it
    And close the browser
    Examples:
      | username | password |
      | root     | pa$$w0rd |