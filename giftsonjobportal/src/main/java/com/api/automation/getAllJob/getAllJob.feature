Feature: Get all the Job Description
 Background:
 Given url 'http://localhost:9190'
  Scenario: XX_TC_Num:To get all the job description from the job portal application
    Given path '/normal/webapi/all'
    When method GET
    Then status 200
		* print response
		