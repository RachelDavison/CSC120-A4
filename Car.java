import java.util.ArrayList;

public class Car implements CarRequirements{
    private int maxCapacity;
    private ArrayList<Passenger> passengers;

    /**
     * Constructor for Car
     * @param capacity
     */
    public Car(int capacity){
        this.maxCapacity = capacity;
        this.passengers = new ArrayList<Passenger>();
    }

    /**
     * Accessor for maxCapacity
     * @return maxCapacity
     */
    public int getCapacity(){
        return maxCapacity;
    }

    /**
     * Returns number of seats remaining in the car
     * @return number of seats remaining
     */
    public int seatsRemaining(){
        return maxCapacity-passengers.size();
    }

    /**
     * Attempts to add a passenger to the car
     * @param passenger
     * @return true if successful, false if car is full
     */
    public Boolean addPassenger(Passenger passenger){
        if (passengers.size() < maxCapacity){
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    /**
     * Attempts to remove a passenger from the car
     * @param passenger
     * @return true if successful, false if passenger is not in the car
     */
    public Boolean removePassenger(Passenger passenger){
        if (passengers.contains(passenger)){
            passengers.remove(passenger);
            return true;
        }
        return false;
    }
    
    /**
     * Prints the passenger manifest for the car
     */
    public void printManifest(){
        if (passengers.size() == 0){
            System.out.println("This car is EMPTY");
            return;
        }
        System.out.println("The passengers in this car are:");
        for (Passenger p : passengers){
            System.out.println(p);
        }
    }

}