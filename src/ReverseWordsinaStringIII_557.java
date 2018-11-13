/*
给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例 1:

输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc"
注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWordsinaStringIII_557 {
    public String reverseWords(String s) {
//        String[] words = s.split(" ");
//        String result = "";
//        for (int i = 0;i<words.length;i++){
//           String newWord = new StringBuilder(words[i]).reverse().toString();
//           result = result + newWord ;
//           if(i!=words.length-1){
//               result = result + " ";
//           }
//        }
//        return result;
        String[] re = new StringBuffer(s).reverse().toString().split(" ");
        String result= "";
        for(int i = 0;i<re.length;i++){
            String x = re[i];
            if(i!=0){
                x = x + " ";
            }
           result = x + result;
        }
        return  result;
    }

}
