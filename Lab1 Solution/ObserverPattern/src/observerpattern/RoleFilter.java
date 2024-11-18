/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author Global Computer
 */
public class RoleFilter extends Filter {
    @Override
    public void apply(User user) {
        System.out.println("Role identified: " + user.getRole());
    }
}
