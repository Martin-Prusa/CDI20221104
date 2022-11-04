package cz.martin.counter.beans;

import cz.martin.counter.repositories.CounterRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.*;

@Named("counter")
@ApplicationScoped
public class CounterBean {
    private int count = 0;

    @Inject
    private CounterRepository counterRepository;

    public void increment() throws IOException {
        count++;
        counterRepository.save(count);
    }

    public int getCount() {
        count = counterRepository.load();
        return count;
    }
}
