import java.util.ArrayList;;

public class Car implements CarRequirements{
    private int maxCapacity;
    private ArrayList<Passenger> passengers;

    public Car(int capacity){
        this.maxCapacity = capacity;
        this.passengers = new ArrayList<Passenger>();
    }

    public int getCapacity(){
        return maxCapacity;
    }
    public int seatsRemaining(){
        return maxCapacity-passengers.size();
    }
    public Boolean addPassenger(Passenger p){
        if (passengers.size() < maxCapacity){
            passengers.add(p);
            return true;
        }
        return false;
    }
    public Boolean removePassenger(Passenger p){
        if (passengers.contains(p)){
            passengers.remove(p);
            return true;
        }
        return false;
    }
    public void printManifest(){
        if (passengers.size() == 0){
            System.out.println("This car is EMPTY");
            return;
        }
        System.out.println("Passenger Manifest:");
        for (Passenger p : passengers){
            System.out.println(p);
        }
    }

}