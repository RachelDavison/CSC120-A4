public class Engine implements EngineRequirements{
    private FuelType fuelType;
    private double maxFuel;
    private double currentFuel;

    /**
     * Constructor for Engine
     * @param fuelType
     * @param currentFuel
     * @param maxFuel
     */
    public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    }

    /**
     * Accessor for fuelType
     * @return fuelType
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * Accessor for maxFuel
     * @return maxFuel
     */
    public double getMaxFuel() {
        return maxFuel;
    }

    /**
     * Accessor for currentFuel
     * @return currentFuel
     */
    public double getCurrentFuel() {
        return currentFuel;
    }

    /**
     * Refuels the engine to max fuel
     */
    public void refuel() {
        this.currentFuel = this.maxFuel;
    }

    /**
     * Attempts to decrease currentFuel by one unit
     * @return true if there is still fuel left, false if not
     */
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
            return false;
        }
    }
}