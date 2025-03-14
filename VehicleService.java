public class VehicleService {  
//returns the total service charge of all the vehicles that are gone under full service  
    private static int calculateTotal(Vehicle[] vehicles) {  
        VehicleInspector inspector = new VehicleInspection();  
        int total = 0;  
        for(Vehicle vehicle : vehicles){  
            total = total + vehicle.accept(inspector);  
        }  
        return total;  
    }  
//driver code  
    public static void main(String[] args) {  
        Vehicle[] vehicles = new Vehicle[]{  
                new Car("Black", 2010),  
                new Van(5000, 6),  
                new Motorbike(100, "TVS")  
        };  
        int totalCost = calculateTotal(vehicles);  
        System.out.println("Total Service Charge: " + totalCost);  
    }  
}  
