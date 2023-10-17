package org.example.recursive;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NormalRecursive {
    public int recur(int n) {
        if(n==1) return 1;
        return n + recur(n-1);
    }
}
