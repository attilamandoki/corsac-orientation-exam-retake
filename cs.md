# Corsac Orientation Exam Retake

## 1) Green Fox Notebook Error Reporter

Build a webapp that people can use to report technical issues.

# Main page

![main](assets/corsac-ori-form.png)

- the **frontend** should have
    - a heading with the title of the site
    - form to register an error
      - dropdown list with all name options
      - input field to set the manufacturer
      - input field to set the serial number
      - input field to set the desciptrion
      - a REPORT button which send the form

## Backend
The backend should
  - validate incoming data
  - perform database calls

## Endpoints
- you should create these endpoints:

### GET `/`
This endpoint should render an HTML displaying the report form(explained above)

### GET `/list`
This endpoint should render an HTML displaying the full list of tickets(reported errors)
![list example](assets/corsac-ori-list.png)

### POST `/report`
This endpoint should 
  - receive all the information of the error
  - supplement the issue with date
  - save the issue into database if the reporter's name is valid

### POST `/complete/{id}`
This endpoint should delete the specified ticket if the request's body contains `"secret" : "voala"`
  
### GET `/list/query`
This endpoint should return all the tickets which has matching either manufactorer or reporter

Example query:

`http://localhost:8080/list/query?manufacturer=dell`

- this should return a json with every ticket where the manufacturer is "dell"

```json
{
    "result": "ok",
    "tickets":
    [
        {
            "id" : "21",
            "reporter" : "Egg",
            "manufacturer" : "dell",
            "serialnumber" : 123456789,
            "description" : "screen pixel error",
            "date" : "2018.01.10"
        },
        {
            "id" : "27",
            "reporter" : "Szilvi",
            "manufacturer" : "dell",
            "serial number" : 987654321,
            "description" : "touchpad not working",
            "date" : "2018.01.17"
        }
    ]
}
```

`http://localhost:8080/list/query?reporter=Egg`

- this should return a json with every ticket where the reporter is "Egg"

## 2) Question time
  What is the difference between unit and integration testing?
  
  Unit testing:
- Unit testing is done to check if a piece of code, a part of our program is doing what it should do.
- As it is to check smaller parts of our code when writing a unit test shorter codes are used that target just a single class.
- Unit tests should have no dependencies on code outside the unit tested.
- It is done to test each unit of our program separately and ensure that each unit is working as expected.
- It focuses on the testing the functionality of individual units and does not uncover the issues arises when different modules are interacting with each other.
  
  Integration testing:
- Integration testing is a type of testing to check if different pieces of the modules are working together.
- The scope of Integration testing is wide, it covers the whole application under test, so it is more complex than Unit testing.
- Integration testing is dependent on other outside systems like databases, hardware allocated for them etc.
- The goal of Integration testing is to test the combined modules together and ensure that they are working togeather as expected.
