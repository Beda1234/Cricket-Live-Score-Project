# Cricket live score project 

Here we are going to create one cricket live score project where a user can see the live results of all the cricket going on in the world 
with that we can see the ended cricket score as well .

Here we are going to collect the data of live score by the web scraping method and show them . 

For Backend we will use java spring boot and for front end we will use ReactJs

# Web scraping

Web scraping, also known as web harvesting or web data extraction, is the process of using bots to extract data from websites. 
Web scraping differs from screen scraping, which only copies pixels from an image, by also extracting the website's HTML code and stored data. 
The scraper can then use this information to duplicate the website's content.

By the help of this we can collect the data from a website . This is different from a API Call . 
 We will collect the data from a website and make that to a JSON by our backend spring boot and send that to the React frontend side .
 And If the match was fenished then we will store that in the database . So that we will see that in the future .
 
Here we are going to learn scraping 

As a database we are using mysql 

(GET)http://localhost:8080/cricket/live -> Get the live cricket score and will store them in DB
(GET)http://localhost:8080/cricket      -> Get all the cricket match from the DB and show them 
(GET)http://localhost:8080/cricket/point-table/2023 -> Get the 2023(We can pass any world cup year here) world cup point table
# Scraping

By the help of scraping mechanism we will copy the elements or data from a web application in our aplication we fetch the data from a application we can check that from the service
class . If in future they changed the dom then this code will not work we need to chnage the serviceImpl class to work gain 
