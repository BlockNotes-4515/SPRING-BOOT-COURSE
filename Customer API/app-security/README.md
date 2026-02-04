
# CURL Requests

### 1. Create a Customer

```bash
curl -X POST http://localhost:8080/api/customers \
  -H "Content-Type: application/json" \
  -d '{
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "phoneNumber": "1234567890"
      }'
```

---

### 2. Get All Customers

```bash
curl -X GET http://localhost:8080/api/customers
```
---

### 3. Get Customer by ID

```bash
curl -X GET http://localhost:8080/api/customers/1
```

---

### 4. Update a Customer

```bash
curl -X PUT http://localhost:8080/api/customers/1 \
  -H "Content-Type: application/json" \
  -d '{
        "firstName": "Jane",
        "lastName": "Smith",
        "email": "jane.smith@example.com",
        "phoneNumber": "9876543210"
      }'
```

---

### 5. Delete a Customer

```bash
curl -X DELETE http://localhost:8080/api/customers/1
```
