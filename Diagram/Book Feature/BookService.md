# Book Service

## Usecase
### Precondition:
logged in

### Process:
As an employee I need to be able to book appointments. I need to add a barber, timeslot,
service required and customer data. when logged I should be able to see the appointment.
when making new bookings I should not be able to overlap appointments.
### Postcondition:
service booked

## System sequence diagram

```mermaid
sequenceDiagram
    participant Employee
    participant System
    
    Employee->>System: Click Book service
    System->>Employee: Booking screen
    Employee->>System: enters customer info
    Employee->>System: selects service
    Employee->>System: select timeslot and barber
    System->>Employee: Shows Price
    Employee->>System: click book
    System->>Employee: booking confirmed
    
   ```

## Sequence Diagram

```mermaid
sequenceDiagram
    actor EmployeeInput
    participant SystemView
    participant Employee
    participant Costumer
    participant EmployeeSelectionController
    participant BookingController
    participant DbController
    participant Db
    
    EmployeeInput->>EmployeeSelectionController: BookAppointment()
    EmployeeSelectionController->>BookingController: ChangeScene()
    BookingController->>SystemView: 'SceneChange'
    
```








