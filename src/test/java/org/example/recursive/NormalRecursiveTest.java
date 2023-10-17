package org.example.recursive;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;
@Slf4j
public class NormalRecursiveTest {

    @Test
    public void recur() {
        int res = new NormalRecursive().recur(10);
        log.info(" " + res);
    }
}