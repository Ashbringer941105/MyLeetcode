package leetcode;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import javax.xml.stream.FactoryConfigurationError;

/**
 * @Author 宋宗垚
 * @Date 2018/11/26 17:11
 * @Description TODO
 */

/*
给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：

'A' : Absent，缺勤
'L' : Late，迟到
'P' : Present，到场
如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。

你需要根据这个学生的出勤纪录判断他是否会被奖赏。

示例 1:

输入: "PPALLP"
输出: True
示例 2:

输入: "PPALLL"
输出: False
 */
public class StudentAttendanceRecordI_551 {

    public static void main(String[] args){
       String x = "PPALLP";
       String b = "PPALLL";
        boolean xx = checkRecord(x);
        boolean bb = checkRecord(b);

    }
    public static boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        int L = 0;
        int A = 0;
        int P = 0;
        for(char c:chars){
            if(c=='A') {
                A++;
            }
        }


        int index = s.indexOf("LLL");

        boolean flag = false;
        if(A<=1 && index==-1){
            flag = true;
        }
        return flag;



    }

}
