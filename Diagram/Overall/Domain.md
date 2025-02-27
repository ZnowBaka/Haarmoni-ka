
# Domain-model

```mermaid
    classDiagram

        Employee__--|>Booking__
        Customer__--|>Booking__
        Admin_--|>Employee__
        Db_<|--Booking__
        Service__--|>Booking__
        TimeSlot__<|--Booking__
        
                
```
