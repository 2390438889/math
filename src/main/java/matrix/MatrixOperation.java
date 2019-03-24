package matrix;

import base.Operation;
import base.OperationException;

/**
 * =================================================================================================
 * 日期		             开发者	       修改类型  	      备注
 * 2019/2/19			 Hearts         创建	          描述：请输入描述
 * =================================================================================================
 * Copyright (c) 2018-2020 湖南创博龙智信息科技股份有限公司 All rights reserved.
 * =================================================================================================
 */
public abstract class MatrixOperation implements Operation<Matrix,Integer> {


    @Override
    public Integer execOpration(Matrix matrix){
        if (checkData(matrix)){
            return operationStep(matrix);
        }
        return null;
    }
}
