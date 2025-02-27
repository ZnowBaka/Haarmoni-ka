# Employee Login


## Usecase
### Precondition:
not logged in

### Process:
As an employee i need to log in with credentials given by a system admin,
to gain access to the system. As an employee I enter my username and password, I would then have access to the system.

### Postcondition:
logged in

## System-Sequence-diagram

```mermaid
sequenceDiagram
    title Employee System sequence diagram
    participant Employee
    participant System

    System->>Employee: Telling Employee to login
    Employee->>System: Enters Username and Password
    System->>System: Validate login
    alt login is correct
        System-->>Employee: logged in
    else login incorrect
        System->>Employee: Retry
    end
```
```mermaid
sequenceDiagram
    participant User
    participant LoginSystem
    participant Databaserepo
    participant Database

    User->>LoginSystem: login(username, password)
    LoginSystem->>Databaserepo: Checklogin
    Databaserepo->Database: SELECT * FROM employees WHERE username = ? AND password = ?
    Database-->>Databaserepo: Returnes user 
    Databaserepo-->> LoginSystem: Resultset (user found or not)
    
    
    
    alt Login Successful
        LoginSystem-->>User:  Login successful
    else Login Failed
        LoginSystem-->>User:  Login failed
    end
```

