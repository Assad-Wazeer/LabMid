/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author Global Computer
 */
public class PaymentFilter extends Filter {
    @Override
    public void apply(User user) {
        if (user.getRole().equalsIgnoreCase("student")) {
            System.out.println("Advanced payment: " + user.getName());
        } else {
            System.out.println("No advanced payment filter for faculty: " + user.getName());
        }
    }
}

