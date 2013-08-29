package com.ulyanova.unionfind;

/**
 * Quik-union called  "lazy approach"
 */
public class QuickUnion {

    private int[] id;

    public QuickUnion (int size){
        id = new int[size];

        for (int i=0; i<id.length; i++) {
            id[i] = i;
        }
    }

    private int root (int i) {
        // chase parent pointers until reach roots
        while (i != id[i]) i=id[i];
        return i;
    }

    public boolean connected (int p, int q) {
        return (root(p) == root(q));
    }

    public void union (int p, int q) {
        //change root of p to point to root of q
        id[root(p)] = root(q);
    }

    public void printUnion(){
        for (int i=0; i<id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }
}
