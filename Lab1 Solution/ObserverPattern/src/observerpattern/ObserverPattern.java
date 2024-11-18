/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpattern;

/**
 *
 * @author Global Computer
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           TransportSystem transportSystem = new TransportSystem();

        // Adding Filters
        transportSystem.addFilter(new RoleFilter());
        transportSystem.addFilter(new PaymentFilter());
        transportSystem.addFilter(new TimingFilter());

          // Users
        User student = new User("1", "Alice", "student");
        User faculty = new User("2", "Bob", "faculty");

        // Processing Users
        System.out.println("Processing Student:");
        transportSystem.processUser(student);

        System.out.println("\nProcessing Faculty:");
        transportSystem.processUser(faculty);
    }
    
}
