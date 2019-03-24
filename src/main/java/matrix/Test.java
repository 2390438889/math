package matrix;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * =================================================================================================
 * 日期		             开发者	       修改类型  	      备注
 * 2019/2/19			 Hearts         创建	          描述：请输入描述
 * =================================================================================================
 * Copyright (c) 2018-2020 湖南创博龙智信息科技股份有限公司 All rights reserved.
 * =================================================================================================
 */
public class Test {

    public static void main(String[] args){
        Integer[][] array = new Integer[][]{
                new Integer[]{
                   1,2,3
                },
                new Integer[]{
                    1,2,3
                },
                new Integer[]{
                    1,2,3
                }
        };

        ArrayUtil<Integer> arrayUtil = new ArrayUtil<Integer>();
        printArrays(arrayUtil.copySubArrayAtEnd(array,1,1));


    }

    public static void printArrays(Object[][] data){
        for (Object[] integers : data) {
            for (Object i : integers) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
