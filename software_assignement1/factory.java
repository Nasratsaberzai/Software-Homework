
package software_assignement1;


public class factory {

 public static void main(String[] args) {
   car nasrat = carFactory.createCar("Nasrat");
        nasrat.drive();  
        
        car basir = carFactory.createCar("Basir");
        basir.drive();    // Output: Driving an SUV car.
    }
    
}
