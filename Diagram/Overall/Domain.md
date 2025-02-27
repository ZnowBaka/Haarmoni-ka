
# Domain-model

```mermaid
    classDiagram
       
        Person <|-- Employee : Inheritance
        Person <|-- Customer : Inheritance
        Employee --o Booking : aggregation
        Customer --o Booking : aggregation
        
        DB-->Service_Table
        Service_Table --> Service
        Service --o Booking : aggregation
                
```
