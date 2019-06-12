# WS rest (POST method) to translate a word or phrase from Spanish to the English language.

### To run:
mvn spring-boot:run

### The WS is available in the endpoint:
http://localhost:8080/translate

### Body request example:

{
	"from":"Spanish",
	"to":"English", 
	"esPhrase":"Hola mundo"
}

### Body response example:

{
    "Translated to English": "Hello World"
}



