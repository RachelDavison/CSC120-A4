public class Passenger implements PassengerRequirements{
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        if (c.addPassenger(this)){
            System.out.println(this.name + " has boarded");
        }
        else{
            System.out.println("Car is full, " + this.name + " cannot board");
        }
    }
    public void getOffCar(Car c){
        if (c.removePassenger(this)){
            System.out.println(this.name + " has disembarked");
        }
        else{
            System.out.println(this.name + " is not in this car");
        }
    } 

    public String toString(){
        return name;
    }
}
