package org.example.recursive;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@Slf4j
public class TailRecursiveTest {
    private TailRecursive tailRecursive;

    @Before
    public void setUp() throws Exception {
        tailRecursive = new TailRecursive();
    }

    @Test
    public void tailRecursive() {
        int res = tailRecursive.tailRecursive(10, 0);
        log.info(" " + res);
    }
}