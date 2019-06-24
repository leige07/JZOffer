package com.android.jzoffer.chapter2;

/**
 * Created by zhulei .
 * Time on 2019-06-24.
 * Description
 *      在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列也按照从上至下递增的顺序排序，
 *      请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 *      1   2   8   9
 *      2   4   9   12
 *      4   7   10  13
 *      6   8   11  15
 */
public class question_04 {


    boolean Find(int matrix[][], int rows, int columns, int number) {
        boolean found = false;
        if (matrix.length != 0 && rows > 0 && columns > 0) {
            int row = 0;
            int column = columns - 1;
            while (row < rows && column >= 0) {
                if (matrix[row][column] == number) {
                    found = true;
                    break;
                } else if (matrix[row][column] > number){
                    --column;
                } else {
                    ++row;
                }
            }
        }

        return found;
    }

}
