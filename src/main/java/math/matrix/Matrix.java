package math.matrix;

import math.exception.IllegalMatrixCols;
import math.exception.IllegalMatrixRows;
import math.exception.MatrixOperationIllegal;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

import static java.util.stream.Collectors.toList;

/**
 * @author Hearts
 * @date 2019/3/24
 * @desc 矩阵
 */
public class Matrix implements Serializable{
    /**
     * 矩阵值
     */
    private final int[][] value;

    /**
     * 矩阵行数
     */
    private int row;

    /**
     * 矩阵列数
     */
    private int col;

    public Matrix(int row,int col){
        this.row = row;
        this.col = col;
        checkRowAndCols(this);
        value = new int[row][col];
    }

    public Matrix(int[][] value){
        row = value.length;
        col = value[0].length;
        this.value = value;
    }

    private void checkRowAndCols(Matrix matrix) throws IllegalMatrixRows, IllegalMatrixCols {
        if (matrix.getRow() <= 0){
            throw new IllegalMatrixRows();
        }

        if (matrix.getCol() <= 0){
            throw new IllegalMatrixCols();
        }
    }


    /**
     * 矩阵加法
     * @param matrix
     */
    public Matrix add(Matrix matrix){
        return operate(matrix,Integer::sum);
    }

    /**
     * 相同类型矩阵每个元素对应操作
     * @param matrix
     * @param b
     * @return
     */
    public Matrix operate(Matrix matrix,BiFunction<Integer,Integer,Integer> b){
        checkOperatorColsAndRows(matrix);
        int[][] newValue = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newValue[i][j] = b.apply(value[i][j],matrix.value[i][j]);
            }
        }
        return new Matrix(newValue);
    }

    /**
     * 矩阵减法
     */
    public Matrix sub(Matrix matrix){
        return operate(matrix,(i,j) -> i-j);
    }

    /**
     * 当前矩阵的负矩阵
     */
    public Matrix negativeMatrix(){
        Matrix newMatrix = new Matrix(row,col);
        return operate(newMatrix,(i,j) -> j-i);
    }


    private void checkOperatorColsAndRows(Matrix matrix) {
        if (row != matrix.row || col != matrix.col){
            throw new MatrixOperationIllegal(String.format("两个操作矩阵行列数不一致(%d,%d),(%d,%d)",row,col,matrix.row,matrix.col));
        }
    }

    public int[][] getValue() {
        return Arrays.copyOf(value,row);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i=0;i<row;i++) {

            str.append("│");
            str.append(" " + String.join(",", Arrays.stream(value[i])
                    .boxed()
                    .map(Object::toString)
                    .collect(toList())) + " ");

            str.append("│\n");
        }



        return str.toString();
    }
}
