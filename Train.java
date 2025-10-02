import java.util.ArrayList;

public class Train {

    private Engine engine;
    private int maxCapacity = 0;
    private ArrayList<Car> cars;

    /**
     * Constructor for Train
     * @param fuelType
     * @param currentFuelLevel
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.cars = new ArrayList<Car>();
        for (int i = 0; i < nCars-1; i++){
            cars.add(new Car(passengerCapacity/nCars));
        }
        if ((passengerCapacity/nCars)*nCars < passengerCapacity){
            cars.add(new Car(passengerCapacity/nCars + passengerCapacity - (passengerCapacity/nCars)*nCars));
        }
        else {
            cars.add(new Car(passengerCapacity/nCars));
        }
        this.maxCapacity = passengerCapacity;
    }
    
    /**
     * Accessor method for engine
     * @return engine
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Accessor method for a specific car
     * @param carNum
     * @return car at index carNum
     */
    public Car getCar(int carNum){

        return cars.get(carNum);
    }

    /**
     * Accessor method for capacity
     * @return maxCapacity
     */
    public int getMaxCapacity(){
        return this.maxCapacity;
    }

    /**
     * Finds the number of seats left on the train
     * @return seatsRemaining
     */
    public int seatsRemaining(){
        int seats = 0;
        for (Car c : cars){
            seats += c.seatsRemaining();
        }
        return seats;
    }

    /**
     * Prints the passenger manifest
     */
    public void printManifest(){
        System.out.println("Train Manifest:");
        for (int i = 0; i < cars.size(); i++){
            System.out.println("Car " + (i+1) + ": ");
            cars.get(i).printManifest();
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        myEngine.refuel();
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
        Train myTrain = new Train(FuelType.STEAM, 50.0, 100.0, 3, 10);
        System.out.println("Max capacity: " + myTrain.getMaxCapacity());
        System.out.println("Seats remaining: " + myTrain.seatsRemaining());
        System.out.println(myTrain.getCar(0).getCapacity());
        System.out.println(myTrain.getCar(1).getCapacity());
        System.out.println(myTrain.getCar(2).getCapacity());
        for (int i = 1; i <=12; i++){
            myTrain.getCar(0).addPassenger(new Passenger("Passenger" + i));
        }
        myTrain.printManifest();
        System.out.println("Seats remaining: " + myTrain.seatsRemaining());
        System.out.println(myTrain.getCar(1).getCapacity());
    }
}
