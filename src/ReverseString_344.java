/*
编写一个函数，其作用是将输入的字符串反转过来。

示例 1:

输入: "hello"
输出: "olleh"
示例 2:

输入: "A man, a plan, a canal: Panama"
输出: "amanaP :lanac a ,nalp a ,nam A"
 */
public class ReverseString_344 {
    public String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
