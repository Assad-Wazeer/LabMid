/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author Global Computer
 */
public class TransportSystem {
    private Pipe pipe = new Pipe();

    public void addFilter(Filter filter) {
        pipe.addFilter(filter);
    }

    public void processUser(User user) {
        pipe.process(user);
    }
}

