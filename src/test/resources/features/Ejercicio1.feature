Feature: Ejercicio 1

  @User
  Scenario: As admin
  I want to create, update and delete an user
  So that I use the API

    Given I have access to Todo.ly with email robertocuevas@ignis.com and password password12345678
    When I send a request POST to url http://todo.ly/api/user.json with json
    """
    {
      "Email": "robertocuevas@ignis.com",
      "FullName": "Roberto Cuevas Pinto",
      "Password": "password12345678"
    }
    """
    Then I expected response code 200
    And I expected the response body
    """
    {
    "Id": "IGNORE",
    "Email": "robertocuevas@ignis.com",
    "Password": null,
    "FullName": "Roberto Cuevas Pinto",
    "TimeZone": 0,
    "IsProUser": false,
    "DefaultProjectId": "IGNORE",
    "AddItemMoreExpanded": false,
    "EditDueDateMoreExpanded": false,
    "ListSortType": 0,
    "FirstDayOfWeek": 0,
    "NewTaskDueDate": "IGNORE",
    "TimeZoneId": "IGNORE"
    }
    """
    And I get the property Id save on ID_USER

    When I send a request PUT to url http://todo.ly/api/user/0.json with json and my new user
    """
    {
      "FullName": "Roberto Pablo Cuevas Pinto"
    }
    """
    Then I expected response code 200
    And I expected the response body
    """
    {
    "Id": ID_USER,
    "Email": "robertocuevas@ignis.com",
    "Password": null,
    "FullName": "Roberto Pablo Cuevas Pinto",
    "TimeZone": 0,
    "IsProUser": false,
    "DefaultProjectId": "IGNORE",
    "AddItemMoreExpanded": false,
    "EditDueDateMoreExpanded": false,
    "ListSortType": 0,
    "FirstDayOfWeek": 0,
    "NewTaskDueDate": "IGNORE",
    "TimeZoneId": "IGNORE"
    }
    """

    When I send a request DELETE to url http://todo.ly/api/user/0.json with json and my new user
    """

    """
    Then I expected response code 200
    And I expected the response body
    """
    {
    "Id": ID_USER,
    "Email": "robertocuevas@ignis.com",
    "Password": null,
    "FullName": "Roberto Pablo Cuevas Pinto",
    "TimeZone": 0,
    "IsProUser": false,
    "DefaultProjectId": "IGNORE",
    "AddItemMoreExpanded": false,
    "EditDueDateMoreExpanded": false,
    "ListSortType": 0,
    "FirstDayOfWeek": 0,
    "NewTaskDueDate": "IGNORE",
    "TimeZoneId": "IGNORE"
    }
    """