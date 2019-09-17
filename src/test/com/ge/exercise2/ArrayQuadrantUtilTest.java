package com.ge.exercise2;

import org.junit.Assume;
import org.junit.Test;

import java.awt.desktop.SystemSleepEvent;

import static org.junit.Assert.assertArrayEquals;

public class ArrayQuadrantUtilTest {

    @Test
    public void getQuadrantValuesTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };
        int[][] data1 = {
                {1,2,3,4},
                {5,6,7,8},
                {1,2,3,4},
                {5,6,7,8}
        };

        String[][] data2 =new String[4][4];


        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                data2[i][j]= String.valueOf(data[i][j]);
      //  System.out.println(data1[i][j]);

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data2);
        Assume.assumeNotNull(util.getQuadrantValues(0, 0));

        String[] expectedResult = {"a","b","e","f"};
        //char[] rowsexpected={'a','b','c','d'};
        //char[] columnsExpected={'a','e','i','m'};
        //System.out.println(expectedResult);
        assertArrayEquals(expectedResult, util.getQuadrantValues(0, 0));
        //assertArrayEquals(columnsExpected, util.getColumnValues(0, 4));
        //assertArrayEquals(rowsexpected, util.getRowValues(0,4));
    }
}