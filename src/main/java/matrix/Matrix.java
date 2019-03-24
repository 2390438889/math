package matrix;

import base.OperationException;
import util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * =================================================================================================
 * 日期		             开发者	       修改类型  	      备注
 * 2019/2/19			 Hearts         创建	          描述：请输入描述
 * =================================================================================================
 * Copyright (c) 2018-2020 湖南创博龙智信息科技股份有限公司 All rights reserved.
 * =================================================================================================
 */
public class Matrix {

    /**
     * 矩阵
     */
    private int[][] matrix;
    
    private List<MatrixOperation> matrixOperations;

    /**
     * 初始化矩阵
     */
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        matrixOperations = new ArrayList<MatrixOperation>();
        matrixOperations.add(new MatrixBinaryOperation());
        matrixOperations.add(new TheTernaryMatrixOperation());
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * 矩阵元运算
     * @return
     */
    public Integer matrixOperation(){

        //如果为基元矩阵运算,则直接返回结果
        for (MatrixOperation matrixOperation : matrixOperations) {
            if (matrixOperation.checkData(this)){
                return matrixOperation.operationStep(this);
            }
        }

        int[][] subMatrix;
        subMatrix = ArrayUtil.copySubArrayAtStart(matrix,1,1);
        return matrix[0][0] * new Matrix(subMatrix).matrixOperation();
    }


}
