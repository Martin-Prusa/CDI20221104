package cz.martin.counter.beans;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.io.*;

@Named("counter")
@ApplicationScoped
public class CounterBean {
    private int count = 0;

    public void increment() throws IOException {
        count++;

        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        bw.write(String.valueOf(count));
        bw.close();
    }

    public int getCount() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            this.count = Integer.parseInt(br.readLine());
            return count;
        } catch (IOException e) {
            return 0;
        }
    }
}
