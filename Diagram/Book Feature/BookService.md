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
    actor CustomerI/O
    actor EmployeeI/O
    participant ViewController
    participant MessageController
    participant BookingController
    participant CustomerController
    participant Booking
    participant Customer
    participant DbRepo
    participant Db
    
    EmployeeI/O->>ViewController: BookService(BTN)
    EmployeeI/O->>ViewController: BookingI/O
    ViewController->>CustomerController: newCustomer(customerFirstName, customerLastName, phonenumber, email)
    CustomerController->>Customer: Customer(customerFirstName, customerLastName, phonenumber, email)
    Customer-->>CustomerController: return(customer)
    CustomerController->>DbRepo: saveData(customer)
    DbRepo->>Db: Query("")
    alt confirmed
        Db-->>DbRepo: return(1)
        DbRepo-->>CustomerController: return(0)
    else not Confirmed
        Db-->>DbRepo: return(0)
        DbRepo-->>CustomerController: return(0)
    end
    CustomerController-->>ViewController: return(customer)
    ViewController->>BookingController: createBooking(timeSlot, barber, service, customer)
    BookingController->>Booking: Booking(timeSlot, barber, service, customer)
    Booking-->>BookingController: return(booking)
    BookingController-->>ViewController: return(booking)
    BookingController->>DbRepo: saveBooking(booking)
    DbRepo->>Db: Query("")
    alt confirmed
        Db-->>DbRepo: return(1)
        DbRepo-->>BookingController: return(0)
    else not Confirmed
        Db-->>DbRepo: return(0)
        DbRepo-->>BookingController: return(0)
    end
    BookingController-->>MessageController: confirmBooking(booking)
    MessageController-->>EmployeeI/O: confirmBooking(booking)
    MessageController-->>CustomerI/O: confirmBooking(booking)

```
idk







