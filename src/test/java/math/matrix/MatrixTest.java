package math.matrix;

/**
 * @author Hearts
 * @date 2019/3/24
 * @desc
 */
public class MatrixTest {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
          new int[]{1,2,3,4},
          new int[]{5,6,7,8}
        };
        System.out.println(new Matrix(ints).negativeMatrix());
    }
}
