package com.android.jzoffer.chapter2;

import org.junit.Test;

/**
 * Created by zhulei .
 * Time on 2019-06-13.
 * Description
 */
public class question_03_1 {

    /**
     * 3.1 找出数组中重复的数字
     * 在一个长度为n的数组里的所有数字都在0~n-1的范围内。
     * 数组中某些数字是重复的，但不知道有哪几个数字重复了，
     * 也不知道每个数字重复了几次。
     * 请找出数组中任意一个重复的数字。
     * 如果输入长度为7的数字{2,3,1,0,2,5,3},那么对应的输出重复的数字是2或者3
     * */


    public boolean duplicate(int[] list) {
        if (list.length == 0) {
            return false;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] < 0 || list[i] > list.length - 1) {
                return false;
            }
        }

        for (int i = 0; i < list.length; i++) {
            while(list[i] != i) {
                if (list[i] == list[list[i]]) {
                    System.out.print(list[i] + " ");
                    break;
                } else {
                    int temp = list[i];
                    list[i] = list[temp];
                    list[temp] = temp;
                }
            }
        }

        return false;
    }

    @Test
    public void testDuplicate() {
        int testInt[] = {2,3,1,0,2,5,3};
        duplicate(testInt);
    }


    @Test
    public void test() {
        System.out.print("我就是随便输出一下");
    }
}
