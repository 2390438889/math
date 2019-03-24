package matrix;

/**
 * =================================================================================================
 * 日期		             开发者	       修改类型  	      备注
 * 2019/2/19			 Hearts         创建	          描述：请输入描述
 * =================================================================================================
 * Copyright (c) 2018-2020 湖南创博龙智信息科技股份有限公司 All rights reserved.
 * =================================================================================================
 */
public class MatrixBinaryOperation extends  MatrixOperation {


    @Override
    public boolean checkData(Matrix matrix) {
        int[][] data = matrix.getMatrix();
        if (data.length == 2 && data[0].length ==2){
            return true;
        }
        return false;
    }

    @Override
    public Integer operationStep(Matrix matrix){
        int[][] data = matrix.getMatrix();

        return null;
    }




}
