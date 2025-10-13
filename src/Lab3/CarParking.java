package Lab3;

public class CarParking {
    private Car[][] parking;
    private int[] capacities = {5, 4, 3, 2, 1};  // per floor
 
    public CarParking() {
        parking = new Car[5][];
        for (int i = 0; i < 5; i++) {
            parking[i] = new Car[capacities[i]];
        }
    }
 
    public void showAvailability() {
        System.out.println("\nAvailability per floor:");
        for (int i = 0; i < 5; i++) {
            int available = 0;
            for (int j = 0; j < capacities[i]; j++) {
                if (parking[i][j] == null) {
                    available++;
                }
            }
            System.out.println("Floor " + (i + 1) + ": " + available + " slots free");
        }
    }
 
    public boolean parkCar(Car car) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < capacities[i]; j++) {
                if (parking[i][j] == null) {
                    parking[i][j] = car;
                    System.out.println("Car parked at floor " + (i + 1) + ", slot " + (j + 1));
                    return true;
                }
            }
        }
        System.out.println("Parking Full!");
        return false;
    }
 
    public Car getCar(int tokenNo) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < capacities[i]; j++) {
                if (parking[i][j] != null && parking[i][j].getTokenNo() == tokenNo) {
                    Car car = parking[i][j];
                    parking[i][j] = null;
                    System.out.println("Car with token " + tokenNo + " retrieved.");
                    return car;
                }
            }
        }
        System.out.println("No car found with token " + tokenNo);
        return null;
    }
}