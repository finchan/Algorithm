package org.example.recursive;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class FibTest {
    private Fib fib;

    @Before
    public void setUp() throws Exception {
        fib = new Fib();
    }

    @Test
    public void fib() {
        int res = fib.fib(8);
        log.info(" " + res);
        res = fib.fib(6);
        log.info(" " + res);
        res = fib.fib(3);
        log.info(" " + res);
        res = fib.fib(2);
        log.info(" " + res);
        res = fib.fib(1);
        log.info(" " + res);
    }
}