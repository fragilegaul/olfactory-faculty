This is a REST API to manage students’ grades on different subjects, built with Maven using Spring Boot. 
The app interacts with a PostgreSQL database using Spring Data JPA (defined relational tables contain @OneToMany, @ManyToOne  and @ManyToMany relationships). 
Field validation is provided prior to form submission preventing an invalid data storage. It’s resilient by throwing and handling unchecked exceptions inside @ControllerAdvice.
Users have to register first, then they need to log in to be provided with the JSON Web Token (JWT) (HMAC-SHA512 hash algorithm is used to get a secret key) and having that token they can start using the app until the token expires. Users can perform CRUD operations on students personal data, subjects, grades and related information. Each HTTP request causes an accurate response code.

DB data is fictional. All the coincidences are accidental.
![11](https://github.com/user-attachments/assets/b43a2b4f-4791-438b-81a7-698991e14b50)

![15](https://github.com/user-attachments/assets/840ec463-f3e1-4595-9e18-f7e73a898451)

![8](https://github.com/user-attachments/assets/d082ce9c-6780-4fbd-a951-78b390399caf)

![13](https://github.com/user-attachments/assets/c416f823-bf4f-42ed-be1f-c16a4f1b2ea9)

![14](https://github.com/user-attachments/assets/e7f9423d-f7fc-44e8-b1f4-6c895d59abdf)

![9](https://github.com/user-attachments/assets/6e69cd29-21d5-47fd-9b27-be8345fa8202)

![16](https://github.com/user-attachments/assets/ec164317-0cb2-4e19-8dca-2b1645ea69e5)

![10](https://github.com/user-attachments/assets/aeffba2e-490b-483c-8854-35e960b39f9d)
