     This is a REST API to manage students’ grades on different subjects, built with Maven using Spring Boot. 
The app interacts with a PostgreSQL database using Spring Data JPA (defined relational tables contain @OneToMany, @ManyToOne  and @ManyToMany relationships). 
Field validation is provided prior to form submission preventing an invalid data storage. It’s resilient by throwing and handling unchecked exceptions inside @ControllerAdvice.

Clients have to register first, then they need to log in to be provided with the JSON Web Token (JWT) (HMAC-SHA512 hash algorithm is used to get a secret key) and having that token they can start using the app until the token expires. 
Users can perform CRUD operations on students personal data, subjects, grades and related information. 
Each HTTP request causes an accurate response code.
