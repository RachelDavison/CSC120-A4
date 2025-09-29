public class Engine implements EngineRequirements{
    private FuelType fuelType;
    private double maxFuel;
    private double currentFuel;

    public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void refuel() {
        this.currentFuel = this.maxFuel;
    }

    public Boolean go(){
        if(currentFuel > 0){
            currentFuel -= 1;
            if (currentFuel > 0) {
                return true;
            }
            else {
                
                return false;
            }
        } 
        else {
            System.out.println("Not enough fuel to go");
            return false;
        }
    }
}