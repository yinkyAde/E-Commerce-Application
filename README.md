# E-Commerce-Application

- The E-Commerce Application is built using Java and Spring Boot, with security, scalability, and ease of maintenance. The backend uses Spring Data JPA to interact with a Postgres database, making it easy to manage and store important entities such as users, products and more. User authentication is handled by Auth0, providing secure and reliable means of REST APIs.

- The APIs are well-documented and easily accessible through Swagger UI, making it simple for developers to test and understand the various endpoints.

# Features
## Admin:-
- Login
- Users
- Address
- Categories
- Products
- Price & discount
- Orders
## User:-
- Registration & Login
- Fetch categories and products based on category
- Adding & deleting products to cart
- Managing address and products quantity
- Ordering products and fetching order status

# Features to be added 
- Elastic search 

# Security
- The API is secured using JSON Web Tokens (JWT) handled by Auth0. To access the API, you will need to obtain a JWT by authenticating with the /login endpoint. The JWT should then be passed in the Authorize option available in the Swagger-ui.


# Technologies:
- Java 17 or above
- Spring Boot 3.0
- Maven
- Spring Data JPA
- Spring Security
- Postgres
- JSON Web Tokens (JWT)
- Auth0
- Swagger UI

# Running the app
1. Clone the repository: git clone [(https://github.com/yinkyAde/E-Commerce-Application.git)](https://github.com/yinkyAde/E-Commerce-Application.git)
2. Import the project into your IDE (Integrated Development Environment):
3. Update the values in application.properties with your Postgres database connection details.
4. Run the app: run mvn clean install first and run from the main application ECommerceApplication.java

# API documentation
- API documentation is available via Swagger UI at http://localhost:8080/swagger-ui/index.html

# ER-Diagram
<img width="605" alt="ER-Diagram" src="https://user-images.githubusercontent.com/101395494/216134703-e7cefef6-187f-44df-9fd4-52aedc66d24b.png">

# Swagger-ui
<img width="1649" alt="Swagger UI" src="https://github.com/yinkyAde/E-Commerce-Application/assets/50271975/edbacf42-6342-4591-9699-7930ed7c36e2">


# API Controllers
<img width="947" alt="Auth_Controller" src="https://user-images.githubusercontent.com/101395494/216388749-4f15d968-ae52-48a9-9c08-0b72d608084a.png">
<img width="947" alt="User_Controller" src="https://user-images.githubusercontent.com/101395494/216755281-ebacb2a4-3f02-4d41-a695-d508ee537db1.png">
<img width="947" alt="Address_Controller" src="https://user-images.githubusercontent.com/101395494/216388840-0a31a552-63e3-4b10-9fab-c6c705cd7af4.png">
<img width="947" alt="Cart_Controller" src="https://user-images.githubusercontent.com/101395494/216388895-736fa8c1-7784-4d4d-8768-c619e6fd0e6f.png">
<img width="947" alt="Category_Controller" src="https://user-images.githubusercontent.com/101395494/216388926-88c45391-d35b-4359-b239-86acb63ccb6b.png">
<img width="947" alt="Product_Controller" src="https://user-images.githubusercontent.com/101395494/216755314-56904892-4a1d-4bc3-b40d-b9d76525ec83.png">
<img width="947" alt="Order_Controller" src="https://user-images.githubusercontent.com/101395494/216388971-7d654a8e-6abc-4548-80c6-8d1173f56bc4.png">

# Thank You
