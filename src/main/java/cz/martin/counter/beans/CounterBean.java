package cz.martin.counter.beans;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named("counter")
@ApplicationScoped
public class CounterBean {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
