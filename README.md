# Java Web Service

**Here is a simple Web Service made in Java Spring for Vessel Information**

For testing this Web Service I used Postman, which is a Platform for API Development that is easy to use. If you aren't familiar with Postman you can find more information [here]https://www.postman.com/

There are three different requests that this Web Service can offer. The first is a GET method that displays all the information available for the vessels. 
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
    "id": 2,
    "vessel": {
        "name": "Titanic"
    },
    "position": {
        "date": "1911-05-31T18:08:03.927+00:00",
        "receivedDate": "2020-07-16T11:24:13.143+00:00",
        "latitude": 54.526,
        "longitude": 105.2551,
        "speed": 30.21
    }
}
```
If you check the GET method on `http://localhost:8080/vesselInformation` you can see that the new data has been added to the list. 
As you can see the web service makes two new parameters: a new unique id, and a receivedDate which diplays the precise date that this information is received. 

Finally, you can use this unique Id to search for specific vessel information, with the URL `http://localhost:8080/vesselInformation/{id}`, if you want to :smiley:



