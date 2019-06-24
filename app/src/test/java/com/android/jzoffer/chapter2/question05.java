package com.android.jzoffer.chapter2;

/**
 * Created by zhulei .
 * Time on 2019-06-24.
 * Description 替换空格
 *      请实现一个函数，把字符串中的每个空格替换成%20.
 *      如：输入“we are happy.” 输出“we%20are%20happy.”
 */
public class question05 {

    /*length 为字符数组str的总容量，大于或等于字符串str的实际长度*/
    void ReplaceBlank(char str[], int length)
    {
        if(str == null && length <= 0)
            return;

        /*originalLength 为字符串str的实际长度*/
        int originalLength = 0;
        int numberOfBlank = 0;
        int i = 0;
        while(str[i] != '\0')
        {
            ++ originalLength;

            if(str[i] == ' ')
                ++ numberOfBlank;

            ++ i;
        }

        /*newLength 为把空格替换成'%20'之后的长度*/
        int newLength = originalLength + numberOfBlank * 2;
        if(newLength > length)
            return;

        int indexOfOriginal = originalLength;
        int indexOfNew = newLength;
        while(indexOfOriginal >= 0 && indexOfNew > indexOfOriginal)
        {
            if(str[indexOfOriginal] == ' ')
            {
                str[indexOfNew --] = '0';
                str[indexOfNew --] = '2';
                str[indexOfNew --] = '%';
            }
            else
            {
                str[indexOfNew --] = str[indexOfOriginal];
            }

            -- indexOfOriginal;
        }
    }


}
