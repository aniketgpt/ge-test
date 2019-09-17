package com.ge.exercise2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
//private static final Logger logger = LogManager.getLogger(ArrayQuadrantUtil.class);

public class ArrayQuadrantUtil {
    private static final Logger logger = LogManager.getLogger(ArrayQuadrantUtil.class);


    String[][] data2;


    public ArrayQuadrantUtil(String[][] data) {
        this.data2 = data;
    }


//    public char[] getQuadrantValues(int row, int column) {
//        //List<Character> a = new ArrayList<Character>();
//        char[] a = new char[4];
//        a[0]=data[row][column];
//
//    //    a.add(data[row][column]);
//        a[1]=(data[row][column + 1]);
//        a[2]=(data[row + 1][column]);
//        a[3]=(data[row + 1][column + 1]);
//
//        //System.out.println(a);
//        return a;
//    }
//    public int[] getQuadrantValues1(int row, int column) {
//        //List<Character> a = new ArrayList<Character>();
//        int[] a = new int[4];
//        a[0]=data1[row][column];
//
//        //    a.add(data[row][column]);
//        a[1]=(data1[row][column + 1]);
//        a[2]=(data1[row + 1][column]);
//        a[3]=(data1[row + 1][column + 1]);
//
//        //System.out.println(a);
//        return a;
//    }


    public String[] getQuadrantValues(int row, int column) {
        //List<Character> a = new ArrayList<Character>();
        String[] a = new String[4];
        a[0]=data2[row][column];

        //    a.add(data[row][column]);
        a[1]=(data2[row][column + 1]);
        a[2]=(data2[row + 1][column]);
        a[3]=(data2[row + 1][column + 1]);

        //System.out.println(a);
        return a;
    }
//    public char[] getRowValues(int row, int rowSize) {
//        char[] a = new char[rowSize];
//        for (int i = 0; i < rowSize; i++) {
//            a[i]=data[row][row + i];
//        }
//        //a.add(data[row][column+1]);
//        //a.add(data[row+1][column]);
//        //a.add(data[row+1][column+1]);
//
//
//        return a;
//    }
//
//    public char[] getColumnValues(int column, int columnSize) {
//        char[] a = new char[columnSize];
//        for (int i = 0; i < columnSize; i++) {
//            a[i]=(data[column + i][column]);
//        }
//        //a.add(data[row][column]);
//        //a.add(data[row][column+1]);
//        //a.add(data[row+1][column]);
//        //a.add(data[row+1][column+1]);
//
//
//        return a;
//    }

}