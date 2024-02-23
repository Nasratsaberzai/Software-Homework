
package software_assignement1;


public class carFactory {
        public static car createCar(String type) {
        if (type.equalsIgnoreCase("Nasrat")) {
            return new Nasrat();
        } else if (type.equalsIgnoreCase("Basir")) {
            return new Basir();
        } else {
            throw new IllegalArgumentException("Invalid car type.");
        }
    }
    
}
