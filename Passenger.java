public class Passenger implements PassengerRequirements{
    
    private String name;

    /**
     * Constructor for Passenger
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Attempts to board a car
     * @param car
     */
    public void boardCar(Car car){
        if (car.addPassenger(this)){
            System.out.println(this.name + " has boarded");
        }
        else{
            System.out.println("Car is full, " + this.name + " cannot board");
        }
    }

    /**
     * Attempts to disembark a car
     * @param car
     */
    public void getOffCar(Car car){
        if (car.removePassenger(this)){
            System.out.println(this.name + " has disembarked");
        }
        else{
            System.out.println(this.name + " is not in this car");
        }
    } 

    /**
     * Overrides the toString method
     * @return name
     */
    public String toString(){
        return name;
    }
}
