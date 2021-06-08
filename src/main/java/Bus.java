import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.capacity = 40;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        int numberOfPassengers = getPassengerCount();
        if (numberOfPassengers < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
