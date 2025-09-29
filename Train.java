import java.util.ArrayList;

public class Train {

    private Engine engine;
    private int maxCapacity = 0;

    public ArrayList<Car> cars;

    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        for (int i = 0; i < nCars; i++){
            cars.add(new Car(passengerCapacity));
            this.maxCapacity += passengerCapacity;
        }
        this.cars = new ArrayList<Car>();
        this.maxCapacity = 0;
    }
    
    public Engine getEngine(){
        return this.engine;
    }

    public Car getCar(int i){
        return cars.get(i);
    }

    public int getMaxCapacity(){
        return this.maxCapacity;
    }

    public int seatsRemaining(){
        int seats = 0;
        for (Car c : cars){
            seats += c.seatsRemaining();
        }
        return seats;
    }

    public void printManifest(){
        System.out.println("Train Manifest:");
        for (int i = 0; i < cars.size(); i++){
            System.out.println("Car " + (i+1) + ":");
            cars.get(i).printManifest();
        }
    }
}
