# Hello REST API Messaging App

## 📌 Description
This project demonstrates different REST API calls using Spring Boot.  
It covers GET, POST, and PUT methods with query parameters, path variables, and request bodies.

---

## 🚀 Technologies Used
- Java
- Spring Boot
- REST API
- Maven
- GitFlow

---

## 📁 Project Structure

    com.bridgelabz.hellospringapp
     ├── HelloSpringAppApplication.java
     ├── controller/
     │     └── HelloController.java
     └── dto/
           └── UserDTO.java

---

## 🧪 API Endpoints

### 🔹 UC1 – GET Hello

GET /hello

```bash
curl http://localhost:8080/hello
```

Output:
Hello from BridgeLabz

---

### 🔹 UC2 – Query Parameter

GET /hello/query?name=Mark

```bash
curl http://localhost:8080/hello/query?name=Mark
```

Output:
Hello Mark from BridgeLabz

---

### 🔹 UC3 – Path Variable

GET /hello/param/Mark

```bash
curl http://localhost:8080/hello/param/Mark
```

Output:
Hello Mark from BridgeLabz

---

### 🔹 UC4 – POST (Request Body)

POST /hello/post

```bash
curl -X POST http://localhost:8080/hello/post -H "Content-Type: application/json" -d '{"firstName":"Mark","lastName":"Taylor"}'
```

Output:
Hello Mark Taylor from BridgeLabz

---

### 🔹 UC5 – PUT (Path + Query)

PUT /hello/put/Mark?lastName=Taylor

```bash
curl -X PUT http://localhost:8080/hello/put/Mark?lastName=Taylor
```

Output:
Hello Mark Taylor from BridgeLabz

---

## 🔀 GitFlow Used

```bash
git flow feature start UCx-FeatureName
git add .
git commit -m "[Barnam] UCx: Description"
git push origin HEAD
git flow feature finish -k UCx-FeatureName
git push origin develop
```

---

## 💡 Notes
- Browser supports only GET requests.
- POST and PUT APIs were tested using curl and PowerShell.
- PowerShell users can use Invoke-RestMethod for POST/PUT requests.

---

## 👤 Author
Barnam