/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author Global Computer
 */
import java.util.ArrayList;
import java.util.List;

public class Pipe {
    private List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void process(User user) {
        for (Filter filter : filters) {
            filter.apply(user);
        }
    }
}

