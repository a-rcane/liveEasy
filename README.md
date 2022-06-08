<h1>Java Backend REST api</h1>

1. Adds, updates, deletes and gets different payloads by ID.
2. Can be tested using POSTMAN.
3. Uses Postgresql db to store and access data.

<h2>How to use : </h2>
1. Start the project.
2. GET "localhost:8080/loads" : used for getting all the payloads
3. GET "localhost:8080/load/{loadId}" : used for getting unique payload, if it exists.
4. Similar paths, with JSON body are used for making PUT and POST requests to the server.
5. DELETE "localhost:8080/load/{loadId}" : used for deleting unique payload, if it exists.
