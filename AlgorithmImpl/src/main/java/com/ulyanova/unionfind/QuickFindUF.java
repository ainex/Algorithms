package com.ulyanova.unionfind;

/**
 * Created with IntelliJ IDEA.
 * User: ainex
 * Date: 29.08.13
 * Time: 21:26
 * To change this template use File | Settings | File Templates.
 */
public class QuickFindUF {
    private int[] id;

    public QuickFindUF (int size){
        id = new int[size];

        for (int i=0; i<id.length; i++) {
            id[i] = i;
        }
    }

    public void printUnion(){
        for (int i=0; i<id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }
}
