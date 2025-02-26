
# Domain-model

```mermaid
    classDiagram

        Employee--|>Booking
        Customer--|>Booking
        Admin--|>Employee
        Db<|--Booking
        Service--|>Booking
        TimeSlot<|--Booking
        
                
```
