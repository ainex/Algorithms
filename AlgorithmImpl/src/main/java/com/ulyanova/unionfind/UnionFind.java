package com.ulyanova.unionfind;

/**
 * Created with IntelliJ IDEA.
 * User: ainex
 * Date: 29.08.13
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */
public class UnionFind {
    public static void main( String[] args )
    {
       QuickFindUF union= new QuickFindUF(10);
       union.printUnion();
        union.union(0,5);
        union.union(1,5);
        System.out.println("connected(0,1) = " + union.connected(0,1));
        union.printUnion();


    }
}
