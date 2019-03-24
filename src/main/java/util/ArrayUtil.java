package util;

/**
 * =================================================================================================
 * 日期		             开发者	       修改类型  	      备注
 * 2019/2/19			 Hearts         创建	          描述：请输入描述
 * =================================================================================================
 * Copyright (c) 2018-2020 湖南创博龙智信息科技股份有限公司 All rights reserved.
 * =================================================================================================
 */
public class ArrayUtil<T> {

    /**
     *
     * @param data
     * @param startPointX
     * @param startPointY
     * @return
     */
    public  T[][] copySubArrayAtStart(T[][] data,int startPointX,int startPointY){

        return copySubArray(data,startPointX,startPointY,data.length-1,data[0].length-1);
    }

    public  T[][] copySubArrayAtEnd(T[][] data,int endPointX,int endPointY){

        return copySubArray(data,0,0,endPointX,endPointY);
    }


    /**
     *
     * @param data
     * @param startPointX
     * @param startPointY
     * @param endPointX
     * @param endPointY
     * @return
     */
    public  T[][] copySubArray(T[][] data,int startPointX,int startPointY,int endPointX,int endPointY){
        T[][] subData;
        //计算截取后数组的大小
        int arrayWidth = endPointX - startPointX +1;
        int arrayHeight =endPointY - startPointY +1;
        subData = (T[][]) new Object[arrayWidth][arrayHeight];
        for (int i = startPointX,k=0; i <= endPointX ; i++,k++) {
            for (int j = startPointY,v=0; j <= endPointY ; j++,v++) {
                subData[k][v] = data[i][j];
            }
        }
        return subData;

    }


    /**
     *
     * @param data
     * @param startPointX
     * @param startPointY
     * @return
     */
    public static  int[][] copySubArrayAtStart(int[][] data,int startPointX,int startPointY){

        return copySubArray(data,startPointX,startPointY,data.length-1,data[0].length-1);
    }

    public static  int[][] copySubArrayAtEnd(int[][] data,int endPointX,int endPointY){

        return copySubArray(data,0,0,endPointX,endPointY);
    }


    /**
     *
     * @param data
     * @param startPointX
     * @param startPointY
     * @param endPointX
     * @param endPointY
     * @return
     */
    public static  int[][] copySubArray(int[][] data,int startPointX,int startPointY,int endPointX,int endPointY){
        int[][] subData;
        //计算截取后数组的大小
        int arrayWidth = endPointX - startPointX +1;
        int arrayHeight =endPointY - startPointY +1;
        subData = new int[arrayWidth][arrayHeight];
        for (int i = startPointX,k=0; i <= endPointX ; i++,k++) {
            for (int j = startPointY,v=0; j <= endPointY ; j++,v++) {
                subData[k][v] = data[i][j];
            }
        }
        return subData;

    }


}
