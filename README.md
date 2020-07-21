# Java Web Service

**Here is a simple Web Service made in Java Spring for Vessel Information**

For testing this Web Service I used Postman, which is a Platform for API Development that is easy to use. If you aren't familiar with Postman you can find more information here https://www.postman.com/

There are two different requests that this Web Service can offer. The first is a GET method that displays all the information available for the vessels. 
When running the project locally, the URL is: `http://localhost:8080/vesselInformation`
And this should be the response: 

```
{
        "id": 1,
        "vessel": {
            "name": "ARCADIA"
        },
        "position": {
            "date": "2020-07-15T10:53:52.301+00:00",
            "receivedDate": "2020-07-16T10:53:52.301+00:00",
            "latitude": 16.871311,
            "longitude": 96.199379,
            "speed": 37.04
        }
}
```

The second is a POST method and here is an example of data to POST: 
```
    {
        "vessel": {
            "name": "Titanic"
        },
        "position": {
            "date": "1911-05-31T18:08:03.927+00:00",
            "latitude": 54.5260,
            "longitude": 105.2551,
            "speed": 30.21
        }
    }
```   
 And the response should look something like this: 
 
```
    {
        "vessel": {
            "name": "Titanic"
        },
        "position": {
            "date": "1911-05-31T18:08:03.927+00:00",
            "receivedDate": "2020-07-21T10:14:06.991+00:00",
            "latitude": 0.9516582279424282,
            "longitude": 1.8370480495158836,
            "speed": 15.541353240000001
        }
    }
}
```
If you check the GET method on `http://localhost:8080/vesselInformation` you can see that the new data has been added to the list. 
As you can see the web service creates a new parameter a receivedDate which diplays the precise date that this information is received. The webservice formats latitude and longitude to radians instead of degrees, and formats the speed from knots to meters per second. 

:smiley:



