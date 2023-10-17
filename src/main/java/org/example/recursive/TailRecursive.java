package org.example.recursive;

public class TailRecursive {
    public int tailRecursive(int n, int res) {
        if(n==0) return res;
        res = n + res;
        return tailRecursive(n-1, res);
    }
}
