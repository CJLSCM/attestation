package controller;

import java.io.Closeable;
import java.io.IOException;

public class Counter implements Closeable {
    private static Integer counter = 0;

    public void add() {
        counter++;
    }

    public Integer getCount() {
        return counter;
    }

    @Override
    public void close() throws IOException {

    }
}
