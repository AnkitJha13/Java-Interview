# HTML
- It gives structure to the web page


- div vs span tags

- class has .  and id has # in css property

========================================

# CSS
- It gives styling to the web pages

=> Flexbox vs Grid:-
=> FLexbox
- Flexbox is designed for one-dimensional layouts, either in a row (horizontal) or a column (vertical).
- Items inside a flex container can grow or shrink to fit available space.

=> Grid
- Grid is designed for two-dimensional layouts, handling both rows and columns simultaneously.
- Items can be placed precisely into specific grid cells or areas.


# Bootstrap
- A popular CSS framework for designing responsive and mobile-first websites.


# Tailwind CSS
- A utility-first CSS framework for quickly building custom designs.


# Media Queries
- A CSS feature used to apply styles based on device characteristics (e.g., screen size, resolution).
- To make websites responsive and adapt to different devices (mobile, tablet, desktop)



- margin: auto // text will come in center

- inline vs internal vs external CSS

- float: left or right // in images 

- margin , mrgin-left and margin-right

- padding

- text-decoration: underline 

- flexbox vs grid 

- display: inline vs block

- gap: 10px


- display: flex
  align-items: center
  justify-content : center





==========================================

########################## JAVASCRIPT ########################################


# JAVASCRIPT 
- It gives functionality to the web pages
- It is a synchronous and single threaded 
- It is a scripting language that is used to create interactive and dynamic websites.

- In big applications, working with DOM becomes complicated.


# Json.stringify()




## Data types in JavaScript
# Primitive
- Built-in types that store simple values directly.
- ex:- String, number, BigInt, Boolean, Undefined, Null, Symbol (to store anonymous and unique value)

# Non Primitive (Reference)
- Complex types that can store multiple values or behaviors.
- ex:- Objects, Arrays, Function


  
## Hoisting (in GitHub)


## Debugger is used in JavaScript to debug the code



## Difference between “==“ and “===“ operators
# “==“ operators
- It is used to compare values

# “===“ operators
- It is used to compare both values and types.
- ex:-
  var x = 2;
  var y = "2";
  (x == y) // Returns true since the value of both x and y is the same
  (x === y) // Returns false since the typeof x is "number" and typeof y is "string"



# let x = null;
  console.log(typeOf(x))   // output:- object (exceptional case)

# console.log(null == undefined)  // true


## Type Coercion
# Implicit Type Coercion
- It automatically converts one data type to another during operations.
- Ex:-
  5 + "10" → "510" (number to string).
  true + 1 → 2 (boolean to number).
  "5" - 2 → 3 (string to number).


# Explicit Type Coercion
- We manually convert one data type to another using methods or operators.
- Ex:-
  Number("10") → 10 (string to number).
  String(123) → "123" (number to string).
  Boolean(0) → false (number to boolean).
 



## JavaScript (Dynamically Typed Language)
- The type of a variable is determined at runtime, not at compile time.
- We don't need to declare the type of a variable.
- A variable can hold different types of values at different times.
- ex:- 
  let x = 5;       // x is a number
  x = "Hello";     // x becomes a string


## Statically Typed Language (e.g., Java)
- The type of a variable must be declared explicitly and does not change.
- ex:-
  int x = 5;       // x is an integer
  x = "Hello";     // Error: incompatible types






## NaN Property
- NaN property represents the “Not-a-Number” value.
- It indicates a value that is not a legal number.
- typeof of NaN will return a Number
- ex:-
  isNaN("Hello") // Returns true
  isNaN(345)     // Returns false




## Pass by value vs Pass by reference
# Pass by value
- When the value is changed, it changes the value of that copy, but the original value remains the same.

# Pass by reference
- 




## IIFE (Immediately invoked function)   (in github)
- It is a function that runs as soon as it is defined.
- ex:-
  (function(){
    console.log("game over buddy");   // output is --> game over buddy
  })();
  

# Advantages
- Variables inside an IIFE are not accessible outside and avoids global scope pollution.
- To create a private scope for variables and functions.






## 


# Advantages:
- Catches common coding mistakes.
- Makes JavaScript code more secure and predictable.


-------------------------------------

## for putting on github js files 


# document.write("Immortal Athena")
- this writes directly on the web page


# document.getElementById()
- prints a particular unique id tag only 

# document.getElementByClassName()


# document.getElementsByTagName()
- return a set of html collections (uses tags)



# document.getElementByName()
- gives a nodeList (like create 2 input tag fields and give names as language)

# document.querySelector(".message")  // since message was className
- it matches one or more css selectors

#  document.querySelectorAll(".message")


# console.log("Athena")
- this writes on the browser console.



# In js object is a collection of properties, where each property is defined as a key-value pair.




---------------------------------------


==========================================
 
####################################### REACTJS ############################################

## REACTJS
- React is a free and open-source front-end JavaScript library for building user interfaces based 
  on components.
- Using React we can create Single Page Applications (SPA). 


# Advantages
- Easy to Learn: 
  Simple structure makes it beginner-friendly.

- Reusable Components:
  Build once, use across the app, saving time and effort.

- JSX Syntax:
  Combines HTML and JavaScript for more readable code.

- Virtual DOM:
  Efficiently updates only the changed parts for better performance.





# js vs jsx

=> .js
- stands for javascript
- contains regular javascript code 
- used for general logic and components

=> .jsx (JavaScript Syntax Extension)
- In jsx we can write HTML and JavaScript in single file. 
- makes it easier to design components
- ex
  export default function App() {
     return <h1 className="greeting">{"Hello, this is a JSX Code!"}</h1>;
  }

 



# Element 
- An element is a plain object that describes what should appear on the screen (like HTML elements).
- It’s static, meaning once an element is created, it cannot be changed.
- ex
  <div id="login-btn">Login</div>  // div is an element here
  



# Component:
- A component is a function or class that can accept inputs (called props) and returns a JSX tree 
  (which gets converted into elements).
- Components are reusable.
- You can use the same component in different parts of your app.
- ex
  const Button = (props) => (
    <div id="login-btn">{props.text}</div>      // Button is a component here  
  );

  // Using Button with different text props
  function App() {
    return (
      <div>
        <Button text="Login" />
        <Button text="Sign Up" />
      </div>
    );
  }



 




# class vs function components

=> functional components
- initially stateless
- can use hooks for states and effects
- simpler and more concise
- more popular
- ex
  function Greeting({ message }) {
    return <h1>{`Hello, ${message}`}</h1>;  // Greeting is a component here 
  }


=> class components
- can manage state
- access to lifecycle methods (componentDidMount, componentDidUpdate etc)
- more boilerplate code
- not preffered much
- ex
  class Greeting extends React.Component {
    render() {
     return <h1>{`Hello, ${this.props.message}`}</h1>;
    }
  }




=> Use functional components 
- For components that don't manage state or lifecycle methods.
- For cleaner and more readable code.
- To utilize React Hooks for state and effects.




=> Use Class Components When:
- When internal state is required.
- To use lifecycle methods for complex behavior.
- When integrating with older codebases.
- For components requiring multiple lifecycle hooks.







# Fragments
- Allows grouping of multiple elements without extra DOM nodes.
- Return multiple elements without a wrapping parent.
- We can using only this <></> or <React.Fragment>...</React.Fragment>




# Conditional Rendering
- Displaying content based on certain conditions.
- Allows for dynamic user interfaces

=> Advantages
• Enhances user experience.
• Reduces unnecessary rendering.
• Makes apps more interactive and responsive.






# Props
• Short for properties
• Mechanism for passing data
• Way to pass data from one component to another, typically from a parent component to a child component.
• Makes components reusable.




# state
- State is an object that stores dynamic information inside a component.
- It allows components to keep track of data that can change over time, like user inputs, clicks, or form data.
- Whenever the state of a component changes, React automatically re-renders (updates) the component to show
  the new state in the UI.




# Anonymous function: Used when you need to pass a value or execute additional logic.
  ex-  onClick={() => onDeleteClick(todoName)

# Function reference: Used when no additional values or logic are needed.
  ex - onDeleteClick={onDeleteClick}



# onClick={() => onRemove(todoName)}
- means that when the button (or whatever element has this onClick) is clicked, the onRemove function 
  will be called with the current todoName as an argument.



# React icon library


# The App is the main or root component of a React application.

# DOM

# Virtual DOM 
- Different from the actual browser DOM.
- It's a lightweight representation where each node stands for a
component and its attributes.



# Library vs. Framework:
• A library offers specific functionality.
• A framework provides a set of tools and guidelines.
• In simpler terms: React is a library; 
                    Angular and Vue.js are Framework

• React focuses on UI 
• Angular and Vue.js offers comprehensive tools for full app development



--------------------------------------------------------------------

## Hooks
- Hooks in React are special functions that let you use features like state and lifecycle methods in 
  functional components


# Benefits
- Simplifies the code
- Improves the readability
- And overall performance of the application


# useState
- useState is a React hook that allows you to add state to functional components.
- It creates a state variable that stores data.
- When the state changes, React automatically re-renders the component to update the UI.
- It returns two values: the current state value and a function to update the state.
- for single value make array -> const [car, setCar] = useState('Red'); // initial value is Red

- for multiple value in same state create objects
   const [car, setCar] = useState({
      brand: "Ferrari",
      model: "Roma",
      year: "2024",
      color: "Red"
   })




# useEffect 
- It runs automatically after every render by default.
- Side effects are actions like fetching data, updating the DOM, or setting up subscriptions.
- 4 cases:- 
- first without dependency - Logs message on every render/update.
- second with an Empty Array - Logs message once when the component mounts.
- third with Specific Values in array -  Logs updated count whenever count changes.
- fourth Cleanup Function - Automatically increments count every second and cleans up the timer when unmounted.


# useRef
- It can be used to store a mutable value that does not cause a re-render when updated.
- Used for accessing DOM elements.
- returns an object with a .current property that you can set to any value.
- Changing the value of .current does not cause the component to re-render, making it useful for storing values
  that do not need to trigger UI updates.

3 useReducer
- It is a hook in React that offers more control over state operations compared to useState,
  especially for complex state logic.
- It accepts 2 arguments:
  => reducer function
  => initial state
- and returns current state and dispatch


5 useCallback
- Preserves function across renders to prevent unnecessary re-renders.
- Enhances performance in components with frequent updates.

6 useMemo
- caches the result of expensive calculations to enhance performance.
- Only re-computes the memorized value when specific dependencies change.
- Ideal for intensive computations or operations that shouldn't run on every render.

## Difference between useMemo and useCallback
- both hooks are similar. The difference is:-
- useMemo returns a memorized value
- useCallback returns a memorized function


7 useNavigate()
- dynamic navigation
- Link component with to property can be used to avoid reloading 


8 useContext()
- It is used to manage global data in the react app. 


10 custom hooks
- Custom hooks allow you to extract and reuse component logic across multiple components.
- Helps in isolating complex logic, making components cleaner and easier to maintain.





- Components: It involves two main components:
• Reducer: A pure function that takes the current state and
an action and returns a new state.
• Action: An object describing what happened, typically
having a type property.

- Initialization: It's invoked as
const [state, dispatch] = useReducer(reducer, initialState).



-------------------------------------------------------------------------


# React Router

- rout, routes, browserrouter
- link vs navlink


# <Link>
- Used to navigate between different pages or routes.
- It doesn't style the link based on the current route.

# <Navlink>
- Same as <Link> but provides styling for the active route.
- Automatically adds an active class (or a custom class/style) when the link matches the current route.

















# Context API



# A context in React allows you to share values (like state and functions) between components 
  without passing props manually at every level.
# This approach simplifies state management and makes the code more modular and easier to maintain.



# Fetch 
- Modern javascript API for network requests








# Redux
- Redux is a state management library for JavaScript applications.
- It helps you manage the state (data) of your app in a centralized place.




===================================================================
######################### REST API ################################


## API (types)
- REST API
- SOAP API


# API (Application Programming Interface)
- It allows two software applications to communicate with each other.
- It defines rules for sending requests and receiving responses.
- Used in web services (e.g., REST, SOAP, GraphQL).


# REST API (Representational State Transfer)
- A set of rules or guidelines for building web services.
- Used to perform CRUD operations.
- It uses standard HTTP methods to perform actions on resources.





## Client–Server communication model in REST APIs.
# Client → sends a request (with HTTP method, headers, maybe body).
# Server → processes the request, interacts with database/business logic, and sends back a response (usually JSON, with a status code).





# HTTP Methods:-
- GET: Retrieve data from the server (Read).
- POST: Send data to create a new resource (Create).
- PUT: Update an existing resource (Update).
- PATCH: Partially update an existing resource (Update, e.g., updating just an email address).
- DELETE: Remove a resource from the server (Delete).



# A REST API request consists of:
- HTTP Verb → Defines the operation (e.g., GET, POST, PUT, DELETE).
- Endpoint → The resource URL (e.g., /students, /students/{id}).
- Headers → Metadata like API keys, authentication tokens.
- Body/Parameters → Data sent in the request (e.g., { "name": "Alice", "age": 20, "course": "Computer Science" }).



# Response:-
- Typically in JSON format.
- Example:-
  { 
    "id": 101,
    "name": "Athena",
    "age": 20,
    "course": "Computer Science"
  }



# Status Codes
- HTTP status codes indicate the result of the HTTP request.

- 200 OK: Request succeeded.
- 201 Created: Resource created successfully.
- 202 Accepted: Resource accepted for processing.
- 400 Bad Request: Invalid request.
- 401 Unauthorized: Authentication required.
- 404 Not Found: Resource not found.
- 500 Internal Server Error: Server error encountered.



- 200 series - Successful responses
- 400 series - Client error responses
- 500 series - Server error responses 



# URI (Uniform Resource Identifier)
- Uniquely identifies resources.
- Example:-
  https://api.example.com/books/123. (endpoint to get info about books)



# Pagination
- If API return huge amount of data use pagination.
- Pagination uses limit and offset




# What is statelessness in REST?
- Each client request must contain all information needed for processing.
- The server does not retain client request information, making the system simpler and more scalable.




# Idempotent Methods in REST
- Produce the same result no matter how many times they are executed.

=> Examples:-
   GET, PUT, DELETE (idempotent methods).
   POST: Not idempotent (creating multiple resources).
   PATCH: Context-dependent; can be idempotent if the same fields are updated consistently.




########################### SOAP API #############################

# SOAP API (Simple Object Access Protocol)
- Uses XML for message formatting.
- Works over protocols like HTTP, SMTP, and TCP.
- Defined by WSDL (Web Services Description Language).


# Key Features:-
- Defined by WSDL (Web Services Description Language).
- Can maintain state across multiple requests (stateful communication).
- Built-in security via WS-Security..
- Uses fault messages for clear error representation.

# Pros:-
- Platform and language independent.
- Suitable for secure, complex operations (e.g., financial services).

# Cons:-
- Slower and heavier than REST (due to XML and strict structure).





## REST vs SOAP API
# REST API
- Uses JSON (primarily) and XML.
- Works over HTTP.
- Stateless communication.
- Lightweight and simple.
- Relies on HTTPS and OAuth for security.
- Faster due to lightweight data formats.
- Supports multiple formats (JSON, XML, etc.).
- Uses HTTP status codes for error representation.



# SOAP API
- Uses only XML.
- Works over HTTP, SMTP, and TCP.
- Can maintain state (stateful).
- Heavyweight and rigid.
- Built-in WS-Security for robust security.
- Slower due to XML overhead.
- Limited to XML format.
- Uses fault messages for error representation.

===========================================================================



## MongoDB
- MongoDB is a popular NoSQL database that stores data in a flexible, JSON-like format.


# Mongoose
- It is an ODM (Object Data Modeling) library for MongoDB and Node.js.
- It provides a structured way to define schemas, create models, and perform CRUD operations on MongoDB documents.


# MongoDB shell commands 
- db.users.insertOne({
   name: 'John Doe',
   email: 'john.doe@example.com',
   age: 30
  });

- db.users.insertMany
- db.users.find  ( find documents by some condition like age:30 )
- db.users.findOne
- db.users.updateOne  (update documents)
- db.users.updateMany


=================================================


# Postman
- It is a tool which is used to design, build and test the API's.


======================================================================================


####################### JSP and Servlet ##########################################



# Servlets 
- Java programs that handle web requests and responses.
- Processes HTTP methods (GET, POST) and generates HTML or JSON.
- Runs in a web container (e.g., Apache Tomcat).


## Servlet (Interface) (It defines servlet life-cycle methods)
- GenericServlet (both are class) (used when we want to create protocol independent servlet)
- HttpServlet (used when we want to use http specific methods)


# deployment descriptor file - web.xml

# HttpServletRequest and HttpServletResponse


# View (index.html)
# Servlet (MyServlet.java)

# PrintWriter class stores all the data as object and printed individually like out.name and out.email


# webapp/other/jsp file create


# JSP (JavaServer Pages) 
- Embeds Java in HTML for dynamic pages.
- Used in frameworks like Spring and Struts.
- Supports JSTL (Jakarta Standard Tag Library) for common tasks (e.g., <c:forEach>).
- Focuses on presentation.




# Apache Tomcat
- Web server for Java applications (Servlets and JSP).
- Manages and executes Java servlets.
- Supports JSP for dynamic web content.



######################## JAVA SPRING-BOOT  #####################################

-----------------------

## Order in which springboot project should be written  (ERDSC)

# Entity
- It represents how your data is stored in the database.
- Uses JPA annotations for database mapping.
- May include fields like createdAt, updatedAt, and sensitive data (e.g., passwords).
- ex
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private Double salary;
    private String password;   // Sensitive data
    private LocalDate createdAt;  // Internal field

    // Getters and setters
}



# Repository (It is an interface not class)
- Serves as the Data Access Layer (DAO) for database operations.
- Extends JpaRepository or CrudRepository for basic CRUD operations.
- Provides built-in methods like findAll(), findById(), and deleteById().
- ex
  public interface EmployeeRepository extends JpaRepository<Employee, Long> {
      List<Employee> findByDepartment(String department);     // Custom query method
  }



# DTO (Data Transfer Object)
- Transfers data between layers.
- Structures data sent to or received from the client.
- Excludes sensitive data.
- ex
  public class EmployeeDTO {
    private Long id;
    private String name;
    private String department;
    private Double salary;    // No sensitive data included
                              // No password or createdAt fields
    // Getters and setters
  }




# Service
- Contains business logic and processes data.
- Interacts with the Repository for database operations and returns DTOs.
- Handles validation and data transformation.
- ex
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                        .map(this::convertToDTO)
                        .collect(Collectors.toList());
    }

    public EmployeeDTO convertToDTO(Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setDepartment(employee.getDepartment());
        dto.setSalary(employee.getSalary());
        return dto;
    }

    // Additional methods (e.g., addEmployee, deleteEmployee, etc.)
}




# Controller
- Defines REST API endpoints (GET, POST, PUT, DELETE).
- Handles incoming HTTP requests, calls the Service layer, and returns DTOs.
- ex
  @RestController
  @RequestMapping("/employees")
  public class EmployeeController {
     @Autowired
     private EmployeeService employeeService;

     @GetMapping
     public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
         List<EmployeeDTO> employees = employeeService.getAllEmployees();
         return ResponseEntity.ok(employees);
     }

     @PostMapping
     public ResponseEntity<String> addEmployee(@RequestBody EmployeeDTO employeeDTO) {
         employeeService.addEmployee(employeeDTO);
         return ResponseEntity.ok("Employee added successfully");
     }
  }



==> Simple Flow Example:
- User sends a GET request to the API: GET /employees.
- The Controller receives the request and calls the Service layer.
- Retrieves employee data from the Repository.
- Converts Employee entities to EmployeeDTOs to exclude sensitive information.
- The Service interacts with the Repository to retrieve employee data from the database.
  ex:-
    public List<EmployeeDTO> getAllEmployees() {
      List<Employee> employees = employeeRepository.findAll(); // Get data from database
      return employees.stream().map(this::convertToDTO).collect(Collectors.toList()); // Convert to DTOs
    }

- The Service returns the DTOs to the Controller.
- The Controller sends the DTOs back to the client as the API response.




# MAVEN (build tool)   
- It is a build automation tool used for Java projects.
- Manages dependencies, builds, and documentation via pom.xml.
- It has 3 things mainly GAV (groupId, artifactId, version)
- Compiles code, runs tests, and packages the project (e.g., as a .jar file).




# Maven Archetype
- It is a project template used to generate new Maven projects with a predefined structure and configurations.
- Saves time and reduces manual setup errors.
- maven-archetype-quickstart: Basic Java project.
- maven-archetype-webapp: Web application project.
- maven-archetype-jpa: JPA-based projects.





=> pom.xml
-  Defines project details, dependencies, plugins, and configurations in a Maven project.
-  GroupId: Unique identifier for the project group, often following the reverse domain name pattern (e.g., com.example).
   ArtifactId: Name of the project (e.g., my-app).
   Version: Version of the project (e.g., 1.0.0).

-  Build phases: validate, compile, test, package, install, deploy.



=> Effective pom
-  Final and merged version of pom.xml with inherited settings.
-  It includes your POM, parent POMs, and dependencies.
-  Run mvn help:effective-pom.


# Dependency
- External libraries or modules needed for a project to function.

# Transitive dependency
- An indirect dependency required because another dependency in your project needs it.



# What is a Spring Boot starter? Give some examples.
- It simplifies adding dependencies for specific features.
- Provides quick setup and auto-configuration to boost productivity.
- ex

=> spring-boot-starter-parent:
- Provides default Maven configurations for Spring Boot projects.
- Sets versions for dependencies and plugins automatically.

=> spring-boot-starter-web:
- For building web apps with REST APIs (includes Spring MVC, Tomcat, etc.).

=> spring-boot-starter-data-jpa:
- For database operations using JPA and Hibernate.

=> spring-boot-starter-security:
- Adds authentication and authorization via Spring Security.

=> spring-boot-starter-test:
- For unit and integration testing (includes JUnit, AssertJ, etc.).

=> Lombok:
- Reduces boilerplate code by auto-generating methods like getters/setters, toString().

=> spring-boot dev tools: 
- Provides tools for easier development, like auto-restart and live reload during code changes.

=> spring-boot-starter-actuator:
- Provides endpoints for health checks, metrics, and environment info.





# Database stores sensitive fields, but they are not part of the DTO.
# DTOs are used to prevent exposing sensitive data in API responses.



# Spring
- It is a Java-based framework for building enterprise applications.
- Includes Spring Framework, Spring Boot, Spring Security, Spring Data, and more.
- Helps build robust, secure, and scalable applications.


# Spring Framework   
- Core part of the Spring ecosystem for building Java applications.
- Provides features like dependency injection, aspect-oriented programming (AOP), and transaction management.
- Requires manual configuration via XML or Java-based setup.


# Spring Boot
- It is a Java framework that makes it easier to create and run java applications.
- Builds on the Spring Framework with added features.
- Reduces boilerplate code, speeding up setup.




# Advantages of Using Spring Boot
- Minimal configuration, easy to get started.
- Automatically configures based on dependencies present on the classpath.
- Run apps as standalone without an external server (e.g., Tomcat, Jetty).
- Easily creates RESTful services with minimal configuration.
- Built-in monitoring, health checks, and externalized configuration for production management.
- Simplifies Java application setup using annotations and embedded server support.


# Disadvantages
- May include unnecessary features for simple apps.
- Can increase memory usage.
- Auto-configuration may cause version conflicts or unexpected behaviors.




# Working of Spring boot
- Auto-configures the app based on project dependencies (e.g., database, web server).
- Includes an embedded server (like Tomcat or Jetty), so no external server setup is needed.
- Provides "starter" dependencies (e.g., spring-boot-starter-web) to simplify project development.
- Runs the app with @SpringBootApplication and SpringApplication.run().
- Minimizes manual configuration and allows customization.
- Easily creates REST APIs using annotations like @RestController and @RequestMapping.




# How spring boot starts?
- Execution begins with the main method in main application class.
- SpringApplication.run() is called in the main method to launch the application.
- @SpringBootApplication enables auto-configuration and component scanning.
- Application context initializes configurations based on available dependencies.
- Embedded server (e.g., Tomcat) starts if web dependencies are included.
- @ComponentScan annotation registers classes @Component, @Service, @Repository, or @Controller as beans.
- The Application context is ready to handle incoming requests.





# Loose coupling (IOC and DI promotes this)
- It means components are independent and interact with minimal dependencies.

# IOC (Inversion of Control)
- It shifts object creation and management from your code to Spring framework.
- Without IoC: You manually create an object in your code using new keyword.
- With IoC: The framework creates the object and provides it to your code.


# DI (Dependency Injection)
- A technique for implementing IoC, where the framework automatically injects dependencies (objects) into a class instead
  of the class creating them.

- ex:- If a Car class requires an Engine object, instead of the Car class creating the Engine, the framework (Spring)
       provides it:

  @Component
  class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
  }

  @Component
  class Car {
     private final Engine engine;

     @Autowired // Spring automatically injects Engine here
     public Car(Engine engine) {
         this.engine = engine;
     }

     public void drive() {
         engine.start();
         System.out.println("Car is moving.");
     }
  }



- @Component annotation is used to implement IoC, marking classes as Spring-managed beans.
- @Autowired is used by Spring to handle automatic wiring of dependencies, thereby achieving IoC and DI efficiently.






# Spring Bean Lifecycle
- A bean is created by the Spring container.
- Spring injects required dependencies into the bean.
- Initialization logic runs (often using @PostConstruct).
- Cleanup logic is executed before the bean is destroyed (using @PreDestroy).

=> Understanding the lifecycle helps manage resources effectively and ensure proper initialization and cleanup 
   in Spring applications.

- ex:-
  @Component
  public class MyBean {
     
     public MyBean() {
         System.out.println("Bean instantiated.");
     }

     @PostConstruct
     public void init() {
         System.out.println("Bean initialized.");
     }

     @PreDestroy
     public void cleanup() {
         System.out.println("Bean destroyed.");
     }
  }

- @PostConstruct:-
  Used for initialization tasks after dependencies are injected.
- @PreDestroy:-
  Used for cleanup tasks before the bean is destroyed.





## ApplicationContext 
- Main interface for Spring's IoC container.
- Manages the complete lifecycle of beans.
- Automatically creates and configures beans from XML or Java annotations.
  Ex: MyBean myBean = context.getBean(MyBean.class);
- Provides access to environment properties.
- Easily loads resources like files or URLs.
  Ex:- Resource resource = context.getResource("classpath:myfile.txt");


## Types of ApplicationContext
# ClassPathXmlApplicationContext
- Loads the context from an XML file in the classpath.
  ex:- ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

# AnnotationConfigApplicationContext
- Used for Java-based configuration.
  ex:- ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

# WebApplicationContext
- A specialized version for web applications, integrates with the Spring MVC framework.







## Scopes in spring framework 
# Singleton (Default Scope)
- A single instance is created for the entire application context.
- Reused throughout the application, ideal for shared services.
- Consumes less memory compared to prototype as we use same instance again.

# Prototype
- Enabled with @Scope("prototype").
- Creates a new instance each time the bean is requested.
- Useful for unique requests or non-shared data, like handling user sessions.
- Consumes more memory due to multiple instances.

# Request
- A new instance is created for each HTTP request (web apps only).
- Useful for request-specific data in web applications.

# Session
- One instance per HTTP session (web apps only).
- Useful for session-specific data like user login information.

# Global Session
- One instance per global HTTP session (for portlet-based applications).





# How does Spring Boot handle configuration properties?
- Use application.properties or application.yml in the src/main/resources folder to define configuration properties.
- Inject properties into your classes using the @Value annotation.
- ex
  # application.properties
    app.name=My Spring Boot Application
    
    @Value("${app.name}")
    private String appName; // Injects "My Spring Boot Application"






# JDBC (Java Database Connectivity) 
- A Java API that connects Java applications to relational databases (MySQL, PostgreSQL, Oracle).

=> Core Components:
- Connection: Establishes database connection.
- Statement: Executes SQL queries.
- ResultSet: Retrieves query results.

- Requires you to manually: Open/close connections and Handle exceptions.
- More boilerplate code compared to modern frameworks.


# JDBC Client
- Custom implementation using java.sql classes to implement database operations.
- No built-in resource management and requires manual coding.
- Used for full control over database operations.


# JDBC Template
- Simplifies JDBC operations with automatic resource and exception management.
- Provides easy methods like query(), update(), and execute().
- Reduces boilerplate code, improves readability, and is easier to maintain.
- Widely used in modern Spring Boot projects.


=> SQL Databases:
- MySQL: Widely used relational database.
- PostgreSQL: Known for advanced features.
- H2: Lightweight, in-memory DB for testing.

=> NoSQL Databases:
- MongoDB: Document-oriented, JSON-like format.
- Cassandra: Distributed, highly scalable.
- Redis: In-memory key-value store for caching.







## Spring Data JPA and How it works?
- Simplifies database interactions using JPA, so we don't need to write SQL.
- Basic queries are auto-generated based on method names.
- Can write custom queries using JPQL or SQL.
- Extend JpaRepository for CRUD operations. 
- ex:- 
  public interface UserRepository extends JpaRepository<User, Long> {
    // Custom queries can be added here
  } 




## CrudRepository vs JpaRepository
# CrudRepository 
- Provides basic CRUD operations: save(), findById(), deleteById().
- Suitable for simple applications with no advanced requirements.


# JpaRepository
- Extends CrudRepository and adds JPA-specific features like pagination and sorting.
- Advanced features like batch processing and entity flushing.


# Basic Queries:
     
   - findAll(): Retrieves all records.
          Example: List<User> users = userRepository.findAll();
 
   - findById(ID id): Retrieves a record by ID (returns Optional to avoid null).
          Example: Optional<User> user = userRepository.findById(1L); 
              
   - deleteById(ID id): Deletes a record by ID.
          Example: userRepository.deleteById(1L);




# JPQL (Java Persistence Query Language)
- An object-oriented query language that works with JPA entities instead of database tables.
- example:- To find users named "John"

  List<User> users = entityManager.createQuery("SELECT u FROM User u WHERE u.name = :name", User.class)
                                  .setParameter("name", "John")
                                  .getResultList();


  => Explanation:
     SELECT u FROM User u: Selects users from the User entity.
     WHERE u.name = :name: Filters results to match users with the name "John", where :name is a parameter.






# ORM (Object-Relational Mapping)
- Maps Java objects to database tables, instead of writing SQL queries.
- JPA and Hibernate are common ORM frameworks.
- Simplifies CRUD operations and manages relationships between entities automatically.

- Example: Instead of writing SQL, you can use a User object in Java
  User user = new User();                  // this is a ORM implemented using Hibernate 
  user.setName("John");
  user.setEmail("john@example.com");
  repository.save(user); // Saves to the database using ORM  



# Spring ORM
- Integrates ORM frameworks (JPA and Hibernate) with Spring applications.

# Hibernate
- A popular ORM framework implementing JPA.
- Simplifies database operations using Java objects.
- Automatically handles SQL for CRUD operations and relationships.


# DAO (Data Access Object)
- A pattern that handles database operations like saving, updating, or deleting data.
- Keeps the database code separate from the rest of the application, making it easier to maintain and test.
- ex:-
  public interface UserDAO {
    User findById(Long id);   // Find user by ID
    void save(User user);     // Save user to the database
  }

  public class UserDAOImpl implements UserDAO {
      // Implement database operations (e.g., using JDBC, JPA, Hibernate)
  }





# Spring Data REST
- Automatically creates RESTful endpoints for Spring Data repositories.
- Exposes data repositories as REST APIs with minimal setup.
- Supports standard HTTP methods (GET, POST, PUT, DELETE).
- ex 
    @RepositoryRestResource
    public interface UserRepository extends JpaRepository<User, Long> {
    }
- GET /users: Retrieve all users.
  GET /users/1: Retrieve user with ID 1.
  POST /users: Create a new user (send data in the request body).
  DELETE /users/1: Delete user with ID 1






# JAR File (Java Archive File)
- A compressed file that packages Java classes, resources, and metadata into one file with a .jar extension.
- Simplifies sharing and deployment.



# Spring Boot CLI and its role?
- Command line tool to create, run and manage spring boot applications.
- Uses Groovy, a simpler alternative to Java, for writing applications.
- Run applications directly from the command line (e.g., spring run app.groovy).
- Automatically manages necessary dependencies based on the code you write.
- Easily package the application as a JAR for deployment (spring jar app.jar).  





## Types of Dependency Injection in Spring
# Field
- Injects dependencies directly into class fields.
- Simple to implement with less boilerplate code.
- Makes unit testing harder due to tight coupling.
- For quick prototypes or small applications.
- ex
@Component
public class Employee {
    
    @Autowired
    private Department department;  // Field injection

    // Other methods...
}


# Constructor
- Provides dependencies through the class constructor.
- Best for mandatory dependencies; makes fields immutable.
- Immutable means cannot be changed after it is created.
- It is used when unit testing is important, as it allows easy injection of mocks.
- ex
@Component
public class Employee {

    private final Department department;  // Constructor injection
    private final double salary;          // New field for salary
    private final int experience;         // New field for years of experience

    @Autowired
    public Employee(Department department, double salary, int experience) {
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }

    // Other methods...
}

 
# Setter
- Injects dependencies through setter methods after object creation.
- More boilerplate compared to constructor injection.
- Good for optional dependencies as it allows changes later (e.g., if a deptId is optional).
- ex
@Component
public class Employee {

    private Department department;  // Setter injection

    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    // Other methods...
}





# Thymeleaf
- Java based server side templating engine used in java web applications to render dynamic web pages. 






# JSP (JavaServer Pages) 
- Embeds Java in HTML for dynamic pages.
- Used in frameworks like Spring and Struts.
- Supports JSTL (Jakarta Standard Tag Library) for common tasks (e.g., <c:forEach>).
- Focuses on presentation.



# Servlets 
- Java programs that handle web requests and responses.
- Processes HTTP methods (GET, POST) and generates HTML or JSON.
- Runs in a web container (e.g., Apache Tomcat).



# Apache Tomcat
- Web server for Java applications (Servlets and JSP).
- Manages and executes Java servlets.
- Supports JSP for dynamic web content.



## MVC (Model-View-Controller)
- A design pattern that separates application logic, user interface, and data.
- Model:-
  Represents data and business logic (e.g., database interactions).
- View:-
  Represents the user interface (e.g., HTML templates or API responses).
- Controller:-
  Handles user input, interacts with the Model, and updates the View.
- Example:-
  In a Spring Boot app, a REST controller manages HTTP requests, interacts with the Model to fetch/modify data, 
  and returns responses to the View.



# Example Workflow (React.js + Spring Boot) for MVC architecture
- Model:
  Represents data and business logic (e.g., entities in Spring Boot).

- View (React.js or Thymeleaf):
  Fetches data from Spring Boot's APIs and renders it dynamically in the browser.

- Controller:
  Exposes REST APIs for CRUD operations (@RestController).
  Example: /api/employees returns JSON data of employees.




# Spring Boot Actuator (use dependency spring-boot-starter-actuator)
- It helps monitor and manage your application. 
- Provides various built-in endpoints to check application runtime health, metrics and environment.
- Health endpoint checks health of the application and its dependencies (like databases, external services).
- GET /actuator/health returns "UP" if the application is healthy.
- GET /actuator/metrics shows metrics like memory usage and request counts.




## Spring AOP (Aspect-Oriented Programming)
- Separates common functionalities like logging, security, and transactions from business logic.
- Example: Use @Aspect and @Before annotations for logging before method executions.
- ex:- 
  @Aspect
  @Component
  public class LoggingAspect {
      @Before("execution(* com.example.service.*.*(..))")
      public void logBeforeMethod() {
          System.out.println("Logging before method execution");
      }
  }


# Advantages of Spring AOP:-
- Keeps cross-cutting logic in one place (Aspects).
  (functionalities like logging, security, or transaction management that are needed in multiple parts of an
   application but are not specific to any single business operation.)

- Simplifies business logic by removing repetitive code.
- Makes the code modular and easier to maintain.


# Disadvantages:- 
- Only supports method-level interception (unlike AspectJ, which is more powerful).
- Proxies add a small performance overhead.




## Spring Profiles
- Manage configurations for different environments like dev, test, and prod.
- Environment-specific files (application-dev.properties, application-prod.properties), 
  with shared settings in application.properties.
- Activation:-
  Set via application.properties: spring.profiles.active=dev.
  Use command-line: --spring.profiles.active=prod.

- Use @Profile annotation to load beans based on active profile.
- ex
  @Configuration
  public class DataSourceConfig {

      // Bean for "dev" profile and similarly for others
      @Profile("dev")
      @Bean
      public DataSource devDataSource() {
          // Configuration for the development database
          return new HikariDataSource(devConfig);
      }
  }




## Connection Pooling
- A technique for reusing database connections instead of opening a new one each time.
- Maintains a pool of pre-created connections. 
- When an application needs a database connection, it borrows one from the pool, then returns it after use.
- Used in applications that require frequent database access to handle requests more efficiently.
- By default, Spring Boot uses HikariCP as its connection pool provider, automatically optimizing database performance.

# Advantages:-
- Reduces the time spent on opening/closing connections.
- Enhances performance, especially in high-traffic applications.





## Core Modules in Spring Framework
# Core Container
- Provides basic IoC (Inversion of Control) and Dependency Injection.
- Manages bean creation and lifecycle.
- Example:- Define beans with @Bean in Java configuration or XML files.


# Application Context 
- Main interface for Spring's IoC container.
- Manages the complete lifecycle of beans.
- Automatically creates and configures beans from XML or Java annotations.
  Ex: MyBean myBean = context.getBean(MyBean.class);
- Provides access to environment properties.
- Easily loads resources like files or URLs.
  Ex:- Resource resource = context.getResource("classpath:myfile.txt");



# AOP (Aspect-Oriented Programming)
- Separates cross-cutting concerns like logging, security, and transactions from business logic.
- Example: Use @Aspect and @Before annotations for logging before method executions.


# JDBC Abstraction and DAO Modules
- Simplifies database access by removing boilerplate code.
- DAO (Data Access Object) abstracts database logic, and JDBC Template manages SQL operations.
- Example: Use JdbcTemplate for easy SQL execution, like retrieving records from a database.



# ORM (Object-Relational Mapping)
- Maps Java objects to database tables, instead of writing SQL queries.
- Integrates with ORM tools like Hibernate and JPA.
- Simplifies CRUD operations by managing entity relationships.
- Example: Use @Transactional to handle transactions when saving or updating entities.

- Example: Instead of writing SQL, you can use a User object in Java
  User user = new User();                  // this is a ORM implemented using Hibernate 
  user.setName("John");
  user.setEmail("john@example.com");
  repository.save(user); // Saves to the database using ORM  




# Web Module
- Supports web apps and Spring MVC integration.
- Handles HTTP requests and REST APIs.
- Example: Use @Controller to create endpoints.


# Test Module
- Provides testing support for Spring apps (unit & integration testing).
- Simplifies tests with annotations like @Test and @MockBean.
- Example: Use @SpringBootTest for integration tests.



############################# Imp Annotations used ##############################



## @SpringBootApplication (present in the main class => src/main/java/)
- Configures everything needed for Spring Boot application to run.
- It combines @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations into one.

# @Configuration
- Marks a class as containing Spring bean definitions.
- Defines beans using @Bean methods, which can be injected into other classes with @Autowired.


# @EnableAutoConfiguration
- Automatically configures Spring Boot based on added dependencies in your pom.xml.
- E.g., adding JPA and H2 auto-sets up the database and JPA.
- Reduces manual configuration effort.


# @ComponentScan
- Registers classes as beans, making them available for dependency injection.
- Scans specified package and its sub-packages to register as Spring beans.
- Automatically detects and registers components like @Component, @Service, @Repository, and @Controller as beans 
  for dependency injection in other classes.


# @Bean 
- Used on a method in @Configuration class to declare a bean.
- Explicitly defines a bean that Spring manages.
- Ideal for creating and configuring complex or third-party objects.




# @value
- Injects external configuration values into Spring beans.
- Values can come from properties files, YAML files, or environment variables.
- Makes the application adaptable to different environments.
- In application.properties => app.name=My Spring Boot Application
- ex
  @Value("${app.name}")
  private String appName;



## Difference between @value and @ConfigurationProperties
# @value
- For injecting single property values.
- ex
    @Value("${myapp.custom.property1}")
    private String property1;



# @ConfigurationProperties
- For binding a group of related properties to a Java object.
- ex
    @ConfigurationProperties(prefix = "myapp.custom")
    public class MyProperties {
      private String property1; // Maps to myapp.custom.property1
      private String property2; // Maps to myapp.custom.property2
      private String property3; // Maps to myapp.custom.property3
    }

- more convenient when dealing with multiple related properties since you can group them under a prefix and 
  manage them as a single object.






## How do you load custom properties in Spring Boot?
# Add custom properties in application.properties or application.yml.
- ex
  myapp.custom.property1=value1
  myapp.custom.property2=value2

# Create a class and use @ConfigurationProperties to map these properties.
- ex
  @ConfigurationProperties(prefix = "myapp.custom")
  public class MyProperties {
     private String property1;
     private String property2;
  }

# Use @EnableConfigurationProperties in your configuration class to load the properties.
- ex 
  @EnableConfigurationProperties(MyProperties.class)

# Use @Autowired to inject the properties into other components or services.
- ex
  @Autowired
  private MyProperties myProperties;




## Difference between @ConfigurationProperties and @EnableConfigurationProperties
# @ConfigurationProperties
- Binds external properties to a class

# @EnableConfigurationProperties (if not using @SpringBootApplication in main class then only use this)
- It is needed to tell Spring Boot to recognize and load that class as a bean.




---------------------------------
## @NoArgsConstructor, @AllArgsConstructor and @RequiredArgsConstructor

- ex

import lombok.NoArgsConstructor;

@NoArgsConstructor / @AllArgsConstructor / @RequiredArgsConstructor
public class Book {
    private String title;
    private double price;
}



# @NoArgsConstructor
- Creates a constructor with no arguments.
- JPA (Java Persistence API) requires a no-argument constructor in the entity so that it can instantiate objects when 
  fetching data from the database.
- If you don’t include @NoArgsConstructor, Hibernate will throw an error.

- ex:- generated constructor 

public Book() {
    // No-argument constructor
}



public class Main {
    public static void main(String[] args) {
        // Create a Book instance using the no-argument constructor
        Book book = new Book();
        book.setTitle("Java Concurrency in Practice");
        book.setPrice(39.99);
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Price: " + book.getPrice());
    }
}

-----

# @AllArgsConstructor
- Creates a constructor with parameters for all fields.

- ex

public Book(String title, double price) {
    this.title = title;
    this.price = price;
}



public class Main {
    public static void main(String[] args) {
        // Create a Book instance with all fields initialized
        Book book = new Book("Clean Code", 45.99);
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Price: " + book.getPrice());
    }
}


--------

# @RequiredArgsConstructor
- Creates a constructor for all final fields or fields marked with @NonNull.

- ex

public Book(String title) {
    this.title = title;
}



public class Main {
    public static void main(String[] args) {
        // Create a Book instance with the required 'title' field
        Book book = new Book("Effective Java");
        book.setPrice(45.99); // Set optional field later
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Price: " + book.getPrice());
    }
}


--------------------------------


# All these annotations (@Component, @Service, @Repository, @Controller) allow the class to be injected into 
  other classes through dependency injection, which is the core functionality of Spring-managed beans.
# All above annotations comes under this @ComponentScan


# @Component
- Marks a class as a Spring bean.
- Automatically detected and registered during classpath scanning.
- Used for general-purpose classes like services, repositories, and controllers.
- Can be injected into other beans via @Autowired.


# @Service
- Specialized @Component used for classes that handle business logic or service-layer logic.
- Semantically indicates that the class provides a service, but it's treated the same as @Component by Spring.


# @Repository
- Specialized @Component for DAO (Data Access Object) classes interacting with databases.
- Automatically translates database exceptions into Spring’s DataAccessException.


# @Controller
- For handling web requests in MVC (Model-View-Controller) applications.
- Specialized @Component annotation that handles HTTP requests and responses.






## Difference Between @Autowired and @Inject
# @Autowired
- Provided by Spring Framework
- Automatically injects dependencies, eliminating the need to manually create or manage object instances.
- Has a required attribute (e.g., @Autowired(required = false)) to handle optional dependencies.
- Commonly used in Spring applications as it offers Spring-specific features and configuration flexibility.
- Works on fields, constructors, and setters.
- ex
  @Service
  public class UserService {
      public String getUserDetails() {
          return "User details";
      }
  }

  @RestController
  public class UserController {
      @Autowired
      private UserService userService; // Automatic injection

      @GetMapping("/user")
      public String getUser() {
          return userService.getUserDetails();
      }
  }


# @Inject
- Part of the JSR-330 standard for dependency injection.
- Can be used across any Java DI framework, enhancing portability.
- Ideal for projects that require a uniform approach across different frameworks.
- Does not have the required attribute, so all dependencies are mandatory by default.
- Also works on fields, constructors, and setters.





# @Getter
- Generates getter methods automatically for all fields.
- E.g., for private String name;, it creates getName().



# @Setter
- Generates setter methods automatically for all fields.
- E.g., for private String name;, it creates setName(String name).




# @PreAuthorize("hasAuthority('ADMIN')")
- Used to restrict access to certain methods or endpoints based on user roles or authorities.
- Often used in Spring Security for role-based access control.



# @RequestParam
- Captures query parameters from a URL in a Spring Boot application.
- When you send a request with a query parameter like keyword=java, Spring Boot uses @RequestParam to capture
  that value.
- ex
  @GetMapping("/search")
  public String search(@RequestParam String keyword) {
      return "Searching for: " + keyword;
  }
- If you access http://localhost:8080/search?keyword=java
- The response will be: Searching for: java.



# @RequestHeader
- They are commonly used for passing authentication tokens (e.g., JWT) or API keys without exposing them in the URL.
- Used to capture metadata from the HTTP headers (e.g., User-Agent, Authorization, etc.).



# @RestController (@Controller + @ResponseBody)
- Used for REST APIs that return data (JSON/XML) directly in the response body.


# @Controller
- For handling web requests in MVC (Model-View-Controller) applications.
- Specialized @Component annotation that handles HTTP requests and responses.



# @ResponseBody (sending data)
- Sends a Java object as a response to the client in JSON/XML format.
- Use When: When the client expects data from the server.
- ex
  @GetMapping("/user/{id}")
  @ResponseBody
  public User getUser(@PathVariable Long id) {
      return userService.findUserById(id); // Automatically converted to JSON
  }




# @RequestBody (receiving data)
- Converts JSON/XML from the request body into a Java object.
- Use Case: When the client sends data to the server (e.g., via POST/PUT).
- The incoming JSON data (e.g., {"name": "Alice", "age": 30}) is captured by @RequestBody and converted into a User object.
- ex
  @RestController
  public class UserController {
 
      static class User {
          private String name;
          private int age;
          // Getters and setters
      }

      @PostMapping("/user")
      public String createUser(@RequestBody User user) {
          return "User " + user.getName() + " created successfully!";
      }
  }



# @PathVariable
- Used to extract dynamic values (like IDs) from the URL path.







# @RequestMapping("/api")
- Sets the base path /api for all the endpoints in this controller, so all endpoints like /api/users, 
  /api/products, etc., will be part of this controller.



# @GetMapping, put, post, delete -  used to handle GET, PUT, POST, DELETE requests
- ex
 
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<String> getAllUsers() {
        return List.of("John", "Jane", "Doe");
    }
}


@PostMapping("/users")
public String createUser(@RequestBody String newUser) {
    // Logic to create a new user
    return "User " + newUser + " created!";
}


@PutMapping("/users/{id}")
public String updateUser(@PathVariable String id, @RequestBody String updatedUser) {
    // Logic to update user with the given ID
    return "User " + id + " updated!";
}


@DeleteMapping("/users/{id}")
public String deleteUser(@PathVariable String id) {
    // Logic to delete the user with the given ID
    return "User " + id + " deleted!";
}



# @PostConstruct
- Used for initialization tasks after dependencies are injected.
- ex
  @PostConstruct
  public void init() {
      // Initialization logic
  } 


# @PreDestroy
- Used for cleanup tasks before the bean is destroyed.




# @DateTimeFormat 
- Formats and parses date fields with a specific pattern (e.g., yyyy-MM-dd).
- Ensures proper handling of dates in requests.
- ex:-
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate date;



# @Transactional
- Combines multiple database operations into one transaction.
- Automatically rolls back if an error occurs.
- Can be applied to methods or classes.
- ex:-
  @Transactional  
  public void updateUserDetails(User user) {  
      userRepository.save(user);  
      logAction(user);  
  }  


# @SpringBootTest
- Used for testing Spring Boot applications.
- Loads the full application context for integration tests.
- Allows testing with real Spring beans and components.



# @Builder
- It is a design pattern that helps to create complex objects step by step.
- ex 
  @Builder
  public class User {
     private Long id;
     private String name;
     private String email;
  }

- without builder 
  User user = new User(1L, "John", "john@example.com");

- with builder
  User user = User.builder()
                .name("John")
                .email("john@example.com")
                .build();






# @Entity
- Maps a Java class to a database table for JPA (Java Persistence API).
- Used to define entities in ORM frameworks like Hibernate.
- Example: Maps the User class to a table in the database.

  @Entity
  public class User {
      @Id
      private Long id;
      private String name;
  }





# @Data
- Automatically generates common methods for a class:
- Getters and Setters: Automatically handles data access (get/set) for all fields.
- toString(): Generates a string representation of the object.
- equals() and hashCode(): Ensures objects are compared based on field values.
- RequiredArgsConstructor: Creates a constructor for all final fields or fields marked with @NonNull.
- In Entity, equals() and hashCode() should be controlled manually for persistence, so @Data is not used and used only in DTO.

- ex:-
  @Data  
  public class User {  
      private final Long id;  
      private String name;  
  }    




# @Table (name = "users") 
- Specifies the table name in the database for the class.
- If not provided, the table name defaults to the class name.
- ex
  @Entity
  @Table(name = "users")
  public class User {
      @Id
      private Long id;
      private String name;
  }





# @Id
- Marks a field as the primary key for the database table.
- ex:- @Id
        private Long id;  //now id is primary key
   



# @GeneratedValue(strategy = GenerationType.IDENTITY)
- Automatically generates unique IDs for primary key fields using the database's auto-increment feature.
- ex:-
  @Entity  
  public class User {  
      @Id  
      @GeneratedValue(strategy = GenerationType.IDENTITY)  
      private Long id;  // Auto-generated primary key  
      private String name;  
  }  


# @Column(unique = true)
- Ensures that the value of this column is unique across all rows in the database.
- ex:-
  @Entity  
  public class User {  
      @Id  
      @GeneratedValue(strategy = GenerationType.IDENTITY)  
      private Long id;  
    
      @Column(unique = true)  
      private String email;  // Ensures unique email addresses  
  }  



# @NotBlank(message = "Email is required")
- Validates that the field is not empty and shows "Email is required" if validation fails.





# @Param
- Binds a method parameter to a named parameter in JPQL (Java Persistence Query Language).
- ex:-
  public interface UserRepository extends JpaRepository<User, Long> {
    
    @Query("SELECT u FROM User u WHERE u.name = :username")  // named parameter = :username
    List<User> findByName(@Param("username") String name);   
  }

- name is the method parameter, referred to as username in @Param and used as a named parameter in 
  the query (:username).

- ex:-
  @Service
  public class UserService {

      @Autowired
      private UserRepository userRepository;

      public List<User> findUsersByName(String name) {
          return userRepository.findByName(name); // (suppose i called here athena it goes to jpql for db matching)
      }
  }      




# @Query
- Defines custom queries in Spring Data JPA.
- Supports JPQL (entity-based queries) and native SQL (direct database queries).



# @JsonInclude(JsonInclude.Include.NON_NULL)
- Excludes null values from the JSON response.
- Fields with null values (like email) are not included when the User object is converted to JSON.
- ex:-
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public class User {
      private String name;
      private String email;  // Optional field

      // Constructor, getters and setters
      public User(String name, String email) {
          this.name = name;
          this.email = email;
      }
  }

  User user1 = new User("Athena", null);


- The email field is null in this case.
- When user1 is serialized to JSON, the resulting output will be:
- Output:-
  {
    "name": "Athena"
  }



# @JsonIgnoreProperties(ignoreUnknown = true)
- Ignores unknown properties in JSON during deserialization.
- Each piece of data from the JSON is converted into its corresponding field in the Java object
- Extra fields in the JSON that don't match the User class are ignored, preventing errors.
- Deserialization:-
  The process of converting JSON data (or XML) back into a Java object.
  


# @CrossOrigin(origin = "https://localhost:3000")
- Used to enable Cross-Origin Resource Sharing (CORS) in Spring applications.
- It allows server to accept requests from a different domain (like a frontend app running on a different port or domain).



## @RestControllerAdvice (@ControllerAdvice + @ResponseBody)
- Used to globally handle exceptions and send responses in a Spring Boot application.
- It centralizes exception handling for all controllers and automatically converts Java objects into JSON/XML responses.


# @ControllerAdvice
- Global exception handler for all controllers.
- Centralizes error handling to avoid repetition in each controller.


# @ResponseBody (sending data)
- Sends a Java object as a response to the client in JSON/XML format.
- Use When: When the client expects data from the server.
- ex
  @GetMapping("/user/{id}")
  @ResponseBody
  public User getUser(@PathVariable Long id) {
      return userService.findUserById(id); // Automatically converted to JSON
  }


# @ExceptionHandler(RuntimeException.class)
- Handles specific exceptions, like RuntimeException.
- Catches the exception and returns a custom response or error message.

- ex:-
  @ControllerAdvice
  public class GlobalExceptionHandler {

      @ExceptionHandler(RuntimeException.class)
      public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
          return new ResponseEntity<>("Error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }



#########################################################################


### For Spring security ###########################


# Spring Security
- A framework for authentication & authorization in Spring Boot.
- Protects against CSRF, XSS, SQL Injection, etc.
- Supports role-based access control (@PreAuthorize("hasRole('ADMIN')")).
- Works with JWT, OAuth2, LDAP, and custom authentication.



# CSRF (Cross-Site Request Forgery) 
- Tricks users into performing actions without their consent.
- Malicious sites make requests using the user’s credentials.
- Prevented by using anti-CSRF tokens to verify requests.


# XSS (Cross-Site Scripting)
- Injects malicious scripts into web pages viewed by others.
- Can steal cookies, session tokens, or redirect users.
- Prevented by input sanitization & Content Security Policy (CSP).




# JWT (JSON Web Token)
- A compact, URL-safe token used for authentication and data exchange.
- Composed of three parts: Header, Payload (claims), and Signature.
- Used to securely transfer the information between client and server.


# OAuth 2.0 (Open Authorization)
- Allows third-party login (Google, GitHub, etc.).
- Uses Access Tokens for authorization.






## Implementing Security in Spring Boot
1. Add Spring Security dependency (in pom.xml).
2. Set up basic authentication (optional in application.properties).
- ex:-
  spring.security.user.name=user
  spring.security.user.password=pass

3. Implement a UserDetailsService to load user data from the database:
- ex:-
  @Service
  public class CustomUserDetailsService implements UserDetailsService {
      @Override
      public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
          return new User("user", "password", new ArrayList<>()); // Example user
      }
  }



## Spring Security Annotations
# @PreAuthorize("hasRole('ADMIN')")
- Restricts access to methods.


# @EnableWebSecurity
- Enables Spring Security.
- Manages authentication, authorization, login, logout, and session security.
- Sets up basic security features for web apps.


# @EnableMethodSecurity
- Enables method-level security annotations.
- Restricts access to service methods based on roles or permissions.
- Simplifies role-based access control (RBAC).




## Best Practices for Spring Security
- Use Bcrypt (BCryptPasswordEncoder()) to hash passwords.
- Always disable CSRF for APIs (http.csrf().disable()).
- Use JWT for token-based authentication instead of session-based login.
- Enable @EnableMethodSecurity for fine-grained method security.
- Use role-based access control (hasRole(), hasAuthority()).



## Difference between mvn clean,mvn verify ,mvn test
# mvn clean
- Deletes the target/ directory (removes old compiled files).
- Ensures a fresh build without leftover artifacts.

# mvn verify
- Runs unit tests + integration tests (mvn test + checks for validation).
- Ensures the build is valid before packaging.

# mvn test
- Runs unit tests in the project (from src/test/java).
- Does not build the final JAR/WAR.

===========================================================================

####################  MICROSERVICES ########################

- It is a way of building software systems by breaking them into small, independent parts that can work together.


# When to use microservices
- Microservices are ideal when the monolithic applications need to be optimized and modernized.
- Each service can be independently developed, deployed, and maintained.
- To reduce time, for scalability, fast development, low cost, and cloud-native development microservices are ideal.


# How microservices communicate with each other
- Microservices use REST APIs or gRPC for real-time communication.
- Message brokers like Kafka or RabbitMQ enable event-driven or queued messaging.
- Tools like Eureka or Consul help microservices locate each other dynamically.

# 12 factor app for clod native application (advanced concept)


# Horizontal and vertical scaling 

# Cloud Native vs Cloud ready


# Monolithic application and then to microservices


# It depends on the project needs. Monolithic is good for small applications, while microservices are better for large, scalable systems

## Monolithic vs Microservices Architecture
# Monolithic Architecture
- Entire application is built and deployed as a single package (JAR/WAR).
- Tightly coupled – All components (UI, business logic, database) are in one codebase.
- One database for the whole application.
- Easy to develop – Simple to start and deploy.
- Scaling requires redeploying the entire application.
- Maintenance becomes difficult as the application grows.


# Microservices Architecture
- Application is broken into independent services, each handling a specific function.
- Loosely coupled – Services communicate via APIs (REST, gRPC, Kafka, RabbitMQ).
- Each microservice can have its own database.
- Independent scaling – Each service can scale separately based on load.
- Deployment is more complex and requires API gateways, service discovery, and orchestration tools (Docker, Kubernetes).
- Easier maintenance as services can be updated independently.



# Load balancers  (like which is the free instance either port 8080 or 8081)
# API gateway
# Service registry
# failed fast


# rest template
# Feign client 
# Eureka server and client 



===================================================================================


############################# JUNIT 5 and Mockito #######################################



# to write test cases order (SRCDE)
- service layer
- repository layer
- controller
- dto 
- entity



## Unit Testing 
- Testing individual units (smallest pieces) of code like functions or methods.
- ex
  MathOperations Class:-
  public class MathOperations {

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }
  }


  class MathOperationsUnitTest {

     @Test
     void testMultiply() {
         MathOperations mathOperations = new MathOperations();  
        
         int result = mathOperations.multiply(5, 4);  
        
         // Check if result is 20 (5 * 4 = 20)
         assertEquals(20, result);
     } 
   }


# Advantages of Unit Testing 
- find bugs early
- easy to fix bugs 
- reduces the cost and time




## Integration Testing
- Testing multiple units together to check if they work well as a whole.
- ex
  BillingService Class:-
  public class BillingService {

     public int calculateTotalPrice(int quantity, int pricePerUnit) {
         MathOperations mathOperations = new MathOperations();
         
         return mathOperations.multiply(quantity, pricePerUnit);  
     }
  }


  
  class BillingServiceIntegrationTest {

     @Test
     void testCalculateTotalPrice() {
         BillingService billingService = new BillingService();  // Create instance of BillingService
        
         int totalPrice = billingService.calculateTotalPrice(10, 50);  // Quantity: 10, Price per unit: 50
        
         // Check if total price is 500 (10 * 50 = 500)
         assertEquals(500, totalPrice);
     }
  }

# Advantages of Integration Testing
- Identifies issues between interacting components.
- Ensures the system works as a whole.
- Helps catch integration bugs early.
- Ensures reliability of combined system features.




# Difference b/w Unit & Integration Testing
- When you test one logic in isolation (like multiply() in MathOperations), it’s unit testing. 
- But when you test how that same logic is used in other classes (like in BillingService), it’s integration testing 
  because you're checking how multiple parts of the system work together.





## JUnit 5
- A popular Java testing framework used for unit and integration testing.
- It provides annotations (@Test, @BeforeAll, @AfterAll) and methods to write and run tests easily.



### Annotations in JUnit 5
# @Test
- Marks a method as a test case.

# @BeforeEach and @AfterEach 
- The annotated method should be executed before and after each test case.

# @BeforeAll and @AfterAll
- The annotated method should be executed once before and after all test cases in test class.

# @DisplayName
- Allows you to provide a custom name for the test class or test method.

# @Disabled 
- Indicates that the annotated test class or method is disabled and will not be executed.

# @ParameterizedTest
- Allows you to run the same test method multiple times with different arguments.





# Assertion - validating actual result with expected result
  (Assertions.assertEquals)



# Assertions.assertEquals(expected, actual)
- Validates that the expected value is equal to the actual value.

# Assertions.assertSame(expected, actual)
- Validates that the expected and actual references point to the same object in memory.

# Assertions.assertArrayEquals(expected, actual)
- Validates that two arrays are equal in terms of length and content.

# Assertions.assertNull(actual)
- Validates that the actual value is null.

# Assertions.assertNotNull(actual)
- Validates that the actual value is not null.

# Assertions.assertTrue(condition)
- Validates that the condition is true.

# Assertions.assertIterableEquals(expectedIterable, actualIterable)
- Validates that two iterables (like lists) are equal in terms of content and order.
- Use this to compare lists or sets.






# Mockito 
- A mocking framework for testing and is used to simulate behaviors of dependencies (other classes or external systems)
  in unit tests.



# @ExtendWith(MockitoExtension.class)
- Integrates Mockito with JUnit 5 for initializing Mocks.
- Use Mockito features like @Mock and @InjectMocks.

# @Mock
- Creates mock objects to simulate dependencies.
- We use this to simulate the behavior of dependencies without invoking their real implementations.

# @InjectMocks
- Automatically injects the mocked dependencies (created with @Mock) into the class being tested.

# verify(mock)
- Used to check that a specific method was called on a mock object.
- Ensures that interactions with the mock are as expected, confirming the behavior of the class under test.





##################### SOLID Principles #####################################


==> Advantages of SOLID principles:-
- Avoid duplicate code.
- Easy to understand and maintain.
- Reduces complexity.
- Enhances scalability and testability.




## Single Responsibility Principle (SRP):-
- It states that every java class must perform a single functionality.
- A class should have only 1 reason to change

=> Advantages
- Code is easier to maintain and extend.
- Classes are focused and reusable.
- Debugging and testing are simpler.




## Open-closed Principle (OCP):-
- It states that classes should be open for extension but closed for modification.
- Add new features by extending the code, not changing it.

=> Advantages:
- No risk of breaking existing functionality.
- Easier to scale.




## Liskov Substitution Principle (LSP):-
- Subclasses should replace parent classes without affecting the program's functionality.
- Use subclass objects wherever superclass objects are used.

=> Advantages:
- Promotes code flexibility.
- Prevents unexpected behavior.




## Interface Segregation Principle (ISP):-
- A class should not be forced to implement unused methods.
- Use small, specific interfaces instead of one large interface.

=> Advantages:
- Reduces unnecessary code.
- Improves modularity and readability.




## Dependency Inversion Principle (DIP):-
- High level modules should not depend on low level modules but both high-level and low-level modules should depend on
  abstractions (abstraact classes and interfaces) instead of concrete implementations.
- Depend on interfaces or abstract classes, not specific classes.

=> Advantages:
- Loose coupling.
- Easier to test and extend.




==> You don’t need to apply all SOLID principles at once!
- Use SRP when a class has too many responsibilities.
- Use OCP when new features require modifying existing code.
- Use LSP when inheritance breaks expected behavior.
- Use ISP when an interface forces unnecessary methods.
- Use DIP when high-level modules are tightly coupled to low-level implementations.



####################### DESIGN PATTERNS #############################################

# Design patterns are reusable solutions to common software design problems.
- Examples: Singleton, Factory, Observer, Adapter.



# Adapter
- Adapter Pattern allows incompatible interfaces to work together.
- Adapter - used in JDBC api.




########################## APACHE KAFKA #############################################


## Apache Kafka
- Apache Kafka is a distributed event streaming platform designed for high-throughput, fault-tolerant data streams.
- It acts as a communication system that facilitates the exchange of data between various components of a computer 
  system through a publish-subscribe model.
- It is used to build real-time data pipelines and streaming applications.
- It helps different systems exchange data efficiently.


## Features:-
# Message Broker
- Kafka serves as a message broker, enabling seamless sending and receiving of messages between different systems.
- It acts as a middle layer where producers (data senders) publish messages, and consumers (data receivers) subscribe
  to topics to get these messages.

# Publish-Subscribe Model
- In Kafka, producers publish messages to topics, and consumers subscribe to these topics to receive updates.
- This decouples the systems and allows for greater flexibility.

# Scalability
- Kafka can easily scale out to handle an increasing number of messages across multiple servers, making it suitable 
  for large-scale applications.

# Real-time Processing
- Kafka supports real-time data processing, making it ideal for applications that require immediate responses to
  incoming data.

# High Throughput
- Designed for high throughput, Kafka can process millions of messages per second, making it suitable for 
  data-intensive applications.


## Examples
- Ola Driver Location Updates
  Kafka can be used to continuously stream updates about driver locations to ensure real-time tracking.

- Zomato Live Food Tracking
  It enables real-time updates on food delivery status, allowing customers to track their orders as they are prepared 
  and delivered.






## How Apache Kafka Works:-
# Producers Send Data to Kafka
- Producers send messages to topics in Kafka.
- A topic is like a category where data is organized.

# Topics and Partitions 
- Topics are divided into partitions to distribute data across multiple servers.
- Each message in a partition has a unique offset (position).

# Consumers Subscribe to Topics
- Consumers subscribe to topics and read messages from them.

# Offsets Track Message Position
- Offsets track the position of each message.
- This ensures consumers can resume reading from where they left off after a failure.

# Replication for Fault Tolerance
- Kafka replicates partitions across servers to ensure fault tolerance.
- If one server fails, it switches to a replica.

# Zookeeper Manages Kafka Cluster
- Zookeeper manages the cluster, tracking the status of brokers, partitions, and topics.
- Example: If a broker goes offline, Zookeeper helps assign its partitions to another broker.





## Example
# Let’s take a real-time food delivery system:
- Producers
  Delivery drivers’ apps send location updates as messages.

- Topics
  A topic named “driver-location” stores these updates.

- Consumers
  The live tracking system consumes the messages from the “driver-location” topic to update the location on the 
  customer’s app.

- Offset
  The tracking system keeps track of which updates have been processed using offsets.

- Replication
  Messages are replicated to ensure that if a server crashes, the data is not lost.





                   
## Components of Apache Kafka?   
# Producers
- They send messages to topics in Kafka.
- They decide which topic and partition the message goes to.
- Producers can also handle message serialization (Converting data into JSON format for easy storage or transmission)
  and compression (Reducing the size of message data).
   
# Topics
- A topic is a category or channel where Kafka stores messages.
- Producers send messages to topics, and consumers read from them.
- Messages in a topic are stored for a set period before being deleted.
- A topic is divided into multiple partitions for parallel processing.

# Partitions
- Each topic is divided into partitions for scalability.
- Partitions distribute data across multiple servers.
- Messages in partitions have unique offsets for tracking.
- Partitions enable parallel processing by allowing multiple consumers to read simultaneously.
- This improves scalability and performance by handling larger data efficiently.


# Offsets
- Each message within a partition has a unique offset.
- Offsets help consumers keep track of which messages they have read.

# Replication
- Kafka replicates partitions across brokers to ensure fault tolerance.
- If a broker fails, Kafka switches to a replica to avoid data loss.

# Brokers
- Kafka runs on brokers, which are the servers that store data.
- Kafka cluster consists of multiple brokers that manage topics and partitions.
- Data replication keeps multiple copies of each partition for fault tolerance.
- One broker acts as the leader for each partition, handling all read and write requests.
- Other brokers are followers, replicating data from the leader.
- If the leader fails, a follower automatically becomes the new leader.
- The number of replicas for each topic can be configured.


# ZooKeeper
- It manages and monitors the Kafka cluster.
- It tracks the status of brokers and partitions.
- Monitors which brokers are active or down.
- Holds important Kafka configuration data.


# Consumers
- Consumers are applications that read messages from Kafka topics.
- Consumers can belong to consumer groups for parallel processing.






# Role of Kafka Producer API 
- Publishes streams of records (messages) to Kafka topics.
- Decides which partition each message goes to.
- Distributes messages evenly across different Kafka servers (brokers) to share the load.
- Compresses messages to reduce data size and save network resources.
- Retries sending messages if there are failures.
- Offers configurable reliability, like ensuring messages are delivered (e.g., at least once, exactly once).





# How Producers Send Messages to Topics
- Initialize a producer to connect to the Kafka cluster.
- Specify the topic for the message.
- Optionally choose a partition or let Kafka decide.
- Serialize the message into a suitable format.
- Send the message to the selected topic and partition.
- Wait for acknowledgment to confirm successful delivery.
- Retry if sending fails.





# How Consumers Read Messages from Topics
- Initialize the consumer to connect to the Kafka cluster.
- Subscribe to the desired topics.
- Poll for new messages continuously.
- Receive messages from the topic's partitions.
- Deserialize the messages into a usable format.
- Process the received messages.





# Consumer Group
- A group of consumers working together to consume messages from a Kafka topic.
- Each consumer reads messages from different partitions, avoiding overlap.

# How Does It Help in Message Consumption?
- Enables faster processing by allowing multiple consumers to read from different partitions simultaneously.
- Automatically balances the workload across consumers.
- Ensures continuous processing by reassigning partitions if a consumer fails.
- Guarantees each message is consumed only once within the group, avoiding duplication.






# @kafkalistener 
- Used to define Kafka consumer method in Spring Boot.
- It listens to specified Kafka topic and processes incoming messages.
- Automatically receives and processes messages from the topic it subscribes to.
- ex
  @KafkaListener(topics = "my-topic", groupId = "my-group")
  public void listen(String message) {
      System.out.println("Received message: " + message);
  }

- // topics: Specifies which Kafka topic to listen to.
  // groupId: Defines the consumer group for the listener.





############################ DOCKER ###############################

# Docker
- It is a platform used for developing, shipping, and running applications inside isolated environments called
  containers.


# Containers
- Package apps and their dependencies, ensuring they run consistently across environments.



# Advantages
- Avoid dependency issues and app conflicts.
- Run apps anywhere (laptop, cloud, server).
- Applications behave the same in any environment, reducing deployment issues.
- Team members can easily share containerized apps for better collaboration.



# Disadvantages
- Can be hard for beginners to grasp.
- Misconfigurations can lead to security risks.
- Managing many containers becomes complex at scale.






## Components of Docker:-
# Docker Engine
- The core part of Docker that runs and manages containers.
- It includes:
  Docker Daemon: The server that handles container management.
  API: Allows communication with Docker.
  CLI (Command Line Interface): Used to interact with Docker via commands.


# Docker Images
- They are read-only templates and contain everything needed to run an app (code, libraries, etc.).

# Docker Containers
- Lightweight, executable packages created from Docker images, used to run applications.

# Dockerfile
- A file containing instructions to build a Docker image 
  (e.g., specifying the base image, copying files, running commands).

# Docker Hub
- A cloud-based repository for sharing and storing Docker images, allowing users to pull and push images.

# Docker Compose
- A tool to manage multi-container applications using a YAML file.
- Makes it easier to define and run multi-container Docker applications.

# Docker Swarm
- An orchestration tool for managing clusters of Docker containers, enabling load balancing and high availability.







## Difference between Docker and Virtualization
# Docker (Containerization)
- Uses containers that share the host OS kernel.
- Lower resource consumption, starts in seconds.
- Near-native performance.
- Highly portable across systems, ideal for microservices.


# Virtualization
- Each VM has its own OS and kernel.
- Consumes more resources and takes minutes to start.
- Slight performance decrease due to overhead.
- Best for running multiple OSs or legacy applications.






# Hypervisor
- A tool that allows multiple operating systems to run on one physical machine.
- Manages resources like CPU, memory, and storage for virtual machines (VMs).
- Ensures VMs remain isolated and independent.






## Commands
# docker ps – Lists currently running containers.
# docker ps -a – Lists all containers (running and stopped).
# docker pull image-name – Pull an image from Docker Hub.
# docker run image-name – Run a container from an image.
# docker images – Lists all Docker images.
# docker rm container_id – Removes a container.
# docker rmi image_id – Removes an image.
# docker help (main command) - list all the commands like when to use which




## Starting and Managing Containers:
# docker create image-name – Create a container from an image without running it.
# docker start container_id – Start a created container.
# docker pause container_id – Pause a running container.
# docker stop container_id – Stop a running container.



## Interactive Mode:
# docker run -it image-name – Run a container in interactive mode (e.g., for debugging).




## Searching and Pulling Images:
# docker search image-name – Search for images on Docker Hub.
# docker pull image-name – Pull an image from Docker Hub.





## Dockerfile Commands
# FROM:
- Specifies the base image to build from.

# RUN:
- Executes commands during the image build process.

# COPY:
- Copies files from the host system into the container.

# ADD:
- Similar to COPY but also supports downloading files from URLs and unpacking tar archives.

# CMD:
- Default command to run when the container starts (can be overridden).

# ENTRYPOINT:
- Sets the main executable for the container (not easily overridden).




# Docker Container Lifecycle
- Created: Container created but not running.
- Running: Container is active.
- Stopped: Container has been stopped but still exists.
- Removed: Container is deleted, and resources are freed.






## Steps to Dockerize a Spring Boot Application:
- Use maven image to build and openjdk image to run the app.
- Set a working directory (WORKDIR /app) to organize files in the container.
- Copy pom.xml and src to the container.
- Build the JAR using mvn clean package.
- Copy the JAR to the runtime image.
- Expose the app port (e.g., EXPOSE 8080).
- Run the Spring Boot application with ENTRYPOINT ["java", "-jar", "app.jar"].




# Maven Image:
- Used to build Java applications.
- Example: maven:3.8.4-openjdk-17
           Maven version: 3.8.4
           Java version: OpenJDK 17

# OpenJDK Image:
- Used to run Java applications in production.
- Example: openjdk:17-jdk-slim
           Java version: OpenJDK 17
           Slim variant: Smaller size by removing unnecessary components.


======================================================================
############################ KUBERNETES ###############################

# Kubernetes (K8s)
- It is an open-source container orchestration tool for automating the deployment, scaling, and
  management of containerized applications.
- It's excellent for managing containers across multiple machines, handling scaling, load balancing, auto-restarts,
  and updates.
- Kubernetes manages multiple containers across many machines, while Docker focuses on running individual containers.
- Kubernetes can automatically scale applications, while Docker requires manual scaling.


# Load Balancing:-2
- Kubernetes handles traffic distribution between containers, Docker doesn’t have built-in load balancing.




# Containers
- Packages applications with their dependencies to run consistently across environments.


# Pods
- The smallest deployable unit in Kubernetes, containing one or more containers that share the same network 
  and storage.


# Nodes
- Physical or virtual machines that run containers.
- A cluster has multiple nodes:-
> Master Node:-
  Manages the cluster, schedules pods, and maintains cluster health.

> Worker Nodes:-
  Run the applications (pods) and communicate with the master.



# Cluster
- A set of nodes working together.
- The master node manages the worker nodes to ensure application reliability and scaling.



# ReplicaSets
- Ensure the specified number of pod replicas are running.
- If a pod fails, a new one is created.


# Service
- A Service is a stable way to expose your applications running inside pods to the outside world or to other 
  parts of the cluster.
- Even if pods are temporary, a service ensures they can be accessed using the same IP address or DNS name.


# Deployments
- They are Kubernetes objects that are used for managing pods.
- You can easily update or scale applications using a deployment.


## Secrets and ConfigMaps
# Secrets 
- Securely store sensitive data like passwords or API keys.

# ConfigMaps
- Store configuration data as key-value pairs for injecting into pods.



# ETCD
- Kubernetes used etcd as a key value database store.
- It stores the configuration of Kubernetes cluster in etcd.
- It stores all the secrets and configMap data inside etcd database.
- Max limit is 1 mb to store secrets.







## Master node components (Kubernetes Architecture)
# API server
- Acts as a gateway to the cluster, handling communication between users and the system.

# Scheduler
- Distributes pods across nodes based on availability and resources.

# Controller Manager
- Monitors the cluster state, handles failures, and maintains the desired state.

# ETCD
- A key-value store that stores the entire cluster’s configuration, including Secrets and ConfigMaps.



## worker node components
# Kubelet
- An agent on each node that ensures containers are running and communicates with the master node.

# Kube-proxy
- It is a network agent which runs on each node and it is responsible for maintaining configuration and rules. 

# Container Runtime
- Executes containers in pods (e.g., Docker).






# Minikube
- Creates a single-node Kubernetes cluster on your local machine for learning and development.

- minikube version - to check version 
- minikube start – Start Minikube.
- minikube status – Check status.
- kubectl get nodes – List cluster nodes.








===================================================================


##################### JENKINS (CI/CD pipeline) ###################


# DevOps is a set of practices, principles, and tools that combines software development (Dev) and IT operations (Ops).
# Its primary goal is to shorten the software development lifecycle and deliver high-quality software continuously.



# Start Jenkins (through cmd)
- java -jar .\jenkins.war




# Jenkins
- Open-source automation server for Continuous Integration (CI) and Continuous Delivery (CD).
- It automates the build, test, and deployment processes, reducing manual effort.

# Features of jenkins
- Easy Installation & Setup
- Extensive Plugin Support (e.g., Git, Maven)
- Distributed Builds (run jobs on different machines)
- Extensible (can be customized as per needs)



## CI/CD Concepts:-
# CI (Continuous Integration):-
- Frequently merging code changes into a shared repository.
- Runs tests automatically to catch issues early and ensure the code works together.


# CD (Continuous Delivery):-
- Automating the preparation of code changes for release, so the software is always ready for deployment.
- Ensure changes are reliable and can be deployed at any time.


# CD (Continuous Deployment):-
- Automatically deploys code changes to production if they pass all tests.
- Unlike Continuous Delivery, it skips manual approval for deployment.



# CI/CD Pipeline Key Components
- Source Code Management (SCM): Tools like Git, SVN, etc.
- Build: Compiling code into executable artifacts (e.g., .jar files).
- Test: Running automated tests to verify code quality.
- Deploy: Moving built code to staging or production environments.





## Jenkins and Pipelines
# Jenkins Pipelines:-
- Pipelines are a series of automated steps that Jenkins uses to build, test, and deploy applications.
- They can be defined using a domain-specific language (DSL) called Pipeline Syntax.

# Declarative Pipeline:-
- Structured and easy-to-read syntax.

# Scripted Pipeline:-
- More flexible and allows for custom logic.






## Commonly used Jenkins plugins
# Git Plugin:-
  Integrates Jenkins with Git repositories.

# Pipeline Plugin:-
  For creating and managing CI/CD pipelines.

# JUnit Plugin:-
  Integrates JUnit test results into Jenkins.





# Scheduling Jobs in Jenkins
- Use cron syntax like * * * * * to schedule jobs (e.g., run every minute).



------------------------------

## What is the Blue/Green Deployment Pattern?
- Its purpose is to Minimize downtime and reduces risk by having two versions of an application (Blue and Green) running in parallel.

# Blue Deployment
- The current stable version of the application running in production.

# Green Deployment
- A clone of the Blue version with new features or bug fixes.
- Traffic can be routed to the Green deployment for testing and validation.

# Benefits
- Reduces production risk.
- Enables easy rollback to the previous stable version.




===================================================================

########################## CLOUD COMPUTING CONCEPTS ############################

# Cloud Computing
- Delivery of computing services (storage, processing, software) over the internet.


## Cloud service models
# IaaS (Infrastructure as a Service)
- Provides virtualized computing resources (VMs, storage, networking).
- Examples: AWS EC2, Azure VMs.
- You manage the OS, apps, and data.
- Flexible and scalable infrastructure.


# PaaS (Platform as a Service)
- A platform that allows developers to build, deploy, and manage applications without worrying about 
  the underlying infrastructure.
- Examples: Google App Engine, Azure App Services.
- Focuses on app development with tools and databases.
- You manage apps and data, provider handles infrastructure.


# SaaS (Software as a Service)
- Provides software applications over the internet on a subscription basis.
- Examples: Gmail, Dropbox, Salesforce.
- No installation needed; accessed via a browser.
- Provider manages everything (software, updates, infrastructure).





## IT infrastructure deployment models
# On-Premises
- IT infrastructure located within a company’s physical premises.
- Full control over hardware, software, and security.

# Cloud
- On-demand delivery of computing services (servers, storage, databases, networking) via the internet.
- Scalable and flexible.
- You pay only for what you use (pay-as-you-go).
- No need to manage physical hardware.




## Types of Cloud
# Public Cloud
- Cloud services provided over the internet, shared among multiple organizations.
- Managed by third-party providers.
- Cost-effective with pay-per-use pricing.
- Resources are shared with other customers.
- Examples: AWS, Microsoft Azure, Google Cloud.

# Private Cloud
- Cloud infrastructure dedicated to a single organization.
- Can be hosted on-premises or by a third-party.
- Offers more control and security.
- More expensive than public cloud.
- Example: VMware Cloud

# Hybrid Cloud
- Combination of public and private clouds.
- Allows data and applications to move between both.
- Offers flexibility and scalability.
- Sensitive data stays in private cloud, other workloads in public cloud.
- Example: Microsoft Azure Hybrid Cloud


 


# Advantages of AWS (amazon web services) over Others
- Largest and most widely used cloud platform.
- Offers a wide range of cloud services.
- Flexible and cost-efficient pricing.
- Easy integration with third-party tools.
- Excellent customer support options.


## Services provided by AWS
# AWS IAM (Identity and Access Management)
- Manage user access and permissions securely.

# Amazon EC2 (Elastic Compute Cloud)
- EC2 provides scalable virtual servers for hosting applications.

# Amazon S3 (Simple Storage Service)
- Scalable object storage service for storing and retrieving data.

# Amazon RDS (Relational Database Service)
- Managed relational databases like MySQL, PostgreSQL, and Oracle.

# Amazon Lambda
- Serverless computing for running code without managing servers.

# Amazon VPC (Virtual Private Cloud)
- Isolated network environment to host resources securely.

# Amazon DynamoDB
- Fully managed NoSQL database service.

# AWS CloudWatch
- Monitoring service for tracking metrics, logs, and alarms.

# AWS Route 53
- Scalable Domain Name System (DNS) and domain registration service.




-------------

### AWS IAM (Identity and Access Management)


# IAM Groups are collections of IAM users

# Root User
- The initial user created with an AWS account.
- It has unrestricted access and should only be used for setup and emergencies.

# Role vs. User
- Roles are temporary and assumed by entities (services, users).
- Users are permanent and have credentials like passwords or access keys.

# Instance Profile
- A container for IAM roles used to grant permissions to EC2 instances.

#  Principle of Least Privilege:-
- It means giving users the minimum permissions they need to perform their tasks to reduce security risks.

# IAM Credential Report
- A downloadable report listing all users and their credentials' status 
  (e.g., password age, Multi-Factor Authentication (MFA) enabled).

# IAM Limits
- IAM users: 5000 per account
- Groups per user: 10
- Policies per role: 20


# Permissions Boundaries:-
- Permissions boundaries set the maximum permissions a user or role can have, even if other policies grant
  broader permissions.

# Resource-based IAM Policy
- These are policies that are directly attached to a resource (e.g., S3 bucket) to control access to 
  that resource.


==================================================

### AWS EC2 (Elastic Compute Cloud)


# Instances
- Virtual servers with configurable compute capacity (CPU, memory, storage).

# Instance Types
- General-purpose (t2, t3)
- Compute-optimized (c5)
- Memory-optimized (r5)
- Storage-optimized (i3).

# Elastic IP
- Static, public IP address for instances.

# Security Groups
- Acts as a virtual firewall to control inbound and outbound traffic.

# AMI (Amazon Machine Image)
- Preconfigured templates for launching EC2 instances.

# Auto Scaling
- Automatically adjusts instance count based on demand.

# EC2 Pricing Models
- On-Demand: Pay per use.
- Reserved: Discounted pricing for long-term commitments.
- Spot Instances: Low-cost, unused capacity (can be terminated anytime).
- Dedicated Hosts: Physical servers for compliance or licensing needs.

# Elastic Load Balancer (ELB)
- Distributes traffic across multiple instances.

# EBS (Elastic Block Store)
- Persistent block storage for EC2 instances.

# Instance States
- States: Pending, Running, Stopping, Stopped, Terminated.



==========================================================

### AWS S3 (Simple Storage Service)

# Buckets
- Containers for storing objects (files).
- Each bucket is globally unique.

# Objects
- Individual files stored in S3 with metadata.

# Storage Classes
=> Options based on cost and access needs:
- Standard: Frequent access.
- Intelligent-Tiering: Automatic cost optimization.
- Standard-IA: Infrequent access.
- Glacier: Archival storage.
- Glacier Deep Archive: Lowest-cost, long-term storage.


# Versioning
- Keeps multiple versions of an object for recovery.

# Lifecycle Policies
- Automates transitioning objects between storage classes or deleting them.


# Access Control
- Bucket Policies: Grant access to S3 buckets.
- IAM Policies: Assign permissions to users/roles.
- ACLs (Access Control Lists): Legacy method for fine-grained access.


## Data Encryption
# Server-Side Encryption (SSE):-
- Data encrypted at rest.
- SSE-S3, SSE-KMS, or SSE-C.

# Client-Side Encryption:
- Encrypt data before uploading.


# Static Website Hosting
- Host static websites directly from S3 buckets.

# Cross-Region Replication (CRR)
- Automatically replicate data to another region for redundancy.

# Transfer Acceleration
- Speeds up uploads and downloads using AWS edge locations.

# Event Notifications
- Trigger actions (e.g., Lambda functions) when events occur in a bucket.

# S3 Object Lock
- Prevents object deletion for compliance (WORM storage).

# Data Consistency
- S3 provides strong consistency for all read-after-write and list operations.








############################## LINUX #################################


# Virtualization
- Creating virtual versions of physical resources (like servers or storage).
- Allows us to run many virtual environments on just one physical machine, making better use of hardware.


# Virtual Machines (VMs)
- Software versions of real computers, running their own operating systems.
- Each VM has its own virtual CPU, memory, and storage, and runs independently on the same physical machine.


## Hypervisor
- Software that controls and manages virtual machines (VMs).
- It allocates resources (like CPU, memory, storage) to each VM and keeps them separate from each other.

## Types of hypervisors:
# Type 1 Bare-metal :-
- Runs directly on physical hardware, without an underlying OS.
- VMware ESXi, Microsoft Hyper-V
- More efficient and faster as it has direct access to hardware

# Type 2 hosted:-
- Runs on top of an existing operating system (like a regular application).
- VMware Workstation, Oracle VirtualBox.
- Easier to set up but less efficient as it depends on the host OS.



## COMMANDS
# whoami
- Display current logged-in user.

# date
- Display current date and time.

# clear
- Clear terminal screen.

# Concatenate and display file contents
- cat <filename>

# list files and directories in a directory
- ls
- ls -l (for detailed listing, including permissions, file size, and last modified date)

# To find the current directory you're in
- pwd 

# copy files in Linux
- cp <source> <destination>
- For directories, use cp -r for recursive copying.

# move or rename files in Linux
- mv <source> <destination>

# command to delete a file in Linux
- rm <filename>
- Use rm -r to delete directories recursively.


# How do you create a new directory
- mkdir <directory_name>


# chmod
- chmod is used to change the permissions of a file or directory
- ex:- chmod 755 file grants read, write, and execute permissions to the owner and read and 
       execute permissions to others.


# su
- Switch to another user.

# sudo
- Execute commands as a superuser.


# ps
- ps shows information about the current processes.


# How can you kill a process in Linux
- kill <pid>  (PID - process ID)



## Search Pattern Basics
# command to search for a file by name in Linux
- find /path -name <filename>

# How do you search for a specific string in a file?
- grep <pattern> <file>


# grep -i
- It makes the search case-insensitive.


# How can you search for a word in multiple files?
- grep <pattern> <file1> <file2> ...


# grep -r 
- It searches for a pattern recursively in a directory




#################### SDLC Phases #############################

- It is a step-by-step process used to design, develop, test, and deploy software.
- It ensures that software is of high quality and meets user needs.
- Understanding the SDLC process helps you see the bigger picture of how software is developed from an idea to a 
  final product, ensuring quality and meeting user expectations.

- Phases:-

1. Project Planning (What is the goal?)
- Define the project’s purpose, goals, and estimate resources (time, cost, people).
- It’s all about understanding the overall goal of the project.
- Example: A company needs a mobile app for food delivery. The team plans the features and decides it will 
  take 6 months to build.



2. Requirements Gathering & Analysis (What do users need?)
- Collect detailed information on what the customer wants and analyze how the software can meet these needs.
- It’s all about collecting and confirming all the details from the clients, ensuring nothing is missed.
- Example: Users need to search for restaurants, create accounts, and order food through the app.



3. Design (How will it work?)
- Plan how the software will be built, from its appearance to how it will function.
- Create blueprints for the software's structure, UI design, and select technologies.
- Example: Designing the layout of the app screens and deciding which programming language to use, like Java or Python.



4. Coding (Build the software)
- Developers start building the different parts of the software.
- It’s all about turning the design into a working software product through coding.
- Example: One developer codes the login feature, while another works on payment integration.




5. Testing (Is everything working?)
- Make sure the software works as expected, without bugs or errors.
- Testers run the software to check for issues and ensure it matches the client’s requirements.
- Example: Testers check if the food ordering process works smoothly and the app doesn’t crash.
 


6. Deployment (Release the software)
- Deliver the completed software to users and make it available for use.
- The software is finally ready for users to use after passing all tests.
- Example: The food delivery app is uploaded to app stores for customers to download.



7. Maintenance (Keep it running)
- Fix any issues that arise after deployment and update the software as needed.
- Make updates, fix bugs, and ensure the software runs smoothly over time.
- Example: After release, users report a bug in the payment process, and the developers fix it.









## Questions 
# What challenges do you face when gathering requirements from clients?
- Unclear Requirements
- Changing Requirements
- Communication Gaps



# How do you ensure good communication between developers, testers, and stakeholders?
- Regular Meetings
- Use Collaboration Tools
  Use tools like Slack, Jira, or Trello for real-time communication and task tracking.
- Document Everything
  Ensure requirements, changes, and decisions are documented so there is no confusion.



# What do you do if the project is running behind schedule?
- Prioritize Tasks
- Re-allocate Resources
  Bring in additional resources or redistribute tasks among the team to speed up the process.
- Negotiate with the Client
  Discuss the possibility of extending the deadline or reducing the scope.
- Example: If a project is 2 weeks behind, negotiate with the client to either extend the timeline or 
  remove less critical features for now.




# How do you handle team conflicts during the development phase?
- Open Communication
  Encourage team members to express their concerns openly in a safe environment.
- Focus on the Project
  Remind team members that the goal is the success of the project, and personal differences should be set aside.
- Mediate Conflicts
  As a manager or leader, mediate the conflict by understanding both sides and finding a common ground.
- Example: If one team member is unhappy with workload distribution, re-assign tasks to balance the work fairly.


######################## Agile Methodology ################################

















############################################################################

### Interview Questions 


Recently Done hashtag#SpringBoot Interview, Questions for fresher & Exp level asked in most of Spring boot Interviews 👇 

Here is the list of questions asked in most of the Spring Boot Interviews:

𝐒𝐩𝐫𝐢𝐧𝐠 𝐁𝐨𝐨𝐭 𝐈𝐧𝐭𝐞𝐫𝐯𝐢𝐞𝐰 𝐐𝐮𝐞𝐬𝐭𝐢𝐨𝐧𝐬 𝐟𝐨𝐫 𝐅𝐫𝐞𝐬𝐡𝐞𝐫𝐬:
1. What are the advantages of using Spring Boot?
2. What are the Spring Boot key components?
3. Why Spring Boot over Spring?
4. What is the starter dependency of the Spring boot module?
5. How does Spring Boot works?
6. What does the @SpringBootApplication annotation do internally?
7. What is the purpose of using @ComponentScan in the class files?
8. How does a Spring Boot application get started?
9. What are starter dependencies?
10. What is Spring Initializer?
11. What is Spring Boot CLI and what are its benefits?
12. What are the most common Spring Boot CLI commands?

𝐀𝐝𝐯𝐚𝐧𝐜𝐞𝐝 𝐒𝐩𝐫𝐢𝐧𝐠 𝐁𝐨𝐨𝐭 𝐐𝐮𝐞𝐬𝐭𝐢𝐨𝐧𝐬:
13. What Are the Basic Annotations that Spring Boot Offers?
14. What is Spring Boot dependency management?
15. Can we create a non-web application in Spring Boot?
16. Is it possible to change the port of the embedded Tomcat server in Spring Boot?
17. What is the default port of Tomcat in Spring Boot?
18. Can we override or replace the Embedded Tomcat server in Spring Boot?
19. Can we disable the default web server in the Spring Boot application?
20. How to disable a specific auto-configuration class?
21. Explain @RestController annotation in Spring Boot?
22. What is the difference between @RestController and @Controller in Spring Boot?
23. Describe the flow of HTTPS requests through the Spring Boot application?
24. What is the difference between RequestMapping and GetMapping?
25. What is the use of Profiles in Spring Boot?
26. What is Spring Actuator? What are its advantages?
27. How to enable Actuator in Spring Boot application?
28. How to get the list of all the beans in your Spring Boot application?
29. How to enable debugging log in the Spring Boot application?
30. Where do we define properties in the Spring Boot application?
31. What is Dependency Injection?
32. What is an IOC container?

Want to be Java SpringBoot developer?
Do this topics 👇
 1. Dependency Injection (DI) and Inversion of Control (IoC)
 2. Bean lifecycle and scopes
 3. ApplicationContext and BeanFactory
 4. XML vs. Java-based Configuration
 5. Annotations: @Component, @Autowired, @Qualifier, @Value
 6. Pointcuts, Advice, Joinpoints, Aspects
 7. Common AOP annotations: @Aspect, @Before, @After
 8. JDBC Template
 9. Spring ORM with Hibernate
 10. Transactions: Programmatic vs Declarative
 11. Spring Boot starters and dependencies
 12. Auto-configuration
 13. Embedded servers (Tomcat, Jetty)
 14. Spring Boot Actuator
 15. DispatcherServlet flow
 16. RESTful Web Services
 17. RequestMapping: @GetMapping, @PostMapping, etc.
 18. Exception handling with @ControllerAdvice
 19. Authentication and Authorization
 20. Security filters and interceptors
hashtag#SpringBoot hashtag#Java hashtag#InterviewQuestions
likeinsightfullove
218



