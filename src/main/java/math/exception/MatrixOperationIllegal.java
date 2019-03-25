package math.exception;

import java.util.concurrent.ExecutorService;

/**
 * @author Hearts
 * @date 2019/3/24
 * @desc
 */
public class MatrixOperationIllegal extends RuntimeException {

    public MatrixOperationIllegal(String message) {
        super(message);
    }
}
