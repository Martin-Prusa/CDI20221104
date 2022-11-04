package cz.martin.counter.repositories;

import java.io.*;

public class CounterRepository {

    public void save(int count) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        bw.write(String.valueOf(count));
        bw.close();
    }

    public int load() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            return Integer.parseInt(br.readLine());
        } catch (IOException e) {
            return 0;
        }
    }
}
