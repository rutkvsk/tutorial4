import java.util.ArrayList;
public class ReservationSystem {
    private ArrayList<Event> events;
    private ArrayList<Customer> customers;

public ReservationSystem() {
    this.events = new ArrayList<>();
    this.customers = new ArrayList<>();
}
public void addEvent(Event event) {
    events.add(event);
}
public void addEvent(String name, String date) {
    this.events = name;
}
public void addCustomer(Customer customer) {}
}
