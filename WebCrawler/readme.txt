1. load the project via eclipse
2. open App.java which is in package com.test.WebCrawler
3. right click on the file and select run as option
4.run as java application.
5. if all libaries are other artifacts(nothing needed extra for this app), then application should start at 8080 port
6.open postman to test the application
7. give the api address as http://localhost:8080/crawler/getlinks
8. in the body select it as raw and format as json
	give the body as
{"siteName":"http://wiprodigital.com"}
9. press enter